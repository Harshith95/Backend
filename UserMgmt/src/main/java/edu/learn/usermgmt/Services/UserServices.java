package edu.learn.usermgmt.Services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import edu.learn.usermgmt.model.User;
import edu.learn.usermgmt.model.UserReq;

@Service
public class UserServices {

	private final String FILE_PATH = determineFilePath();
	private final ObjectMapper objectMapper = new ObjectMapper();

	public List<User> getAllUsers() {
		return readDataFromFile();
	}

	public User readUsersDataByUserId(Long userId) {
		List<User> usersData = getAllUsers();
		return usersData.stream().filter(user -> user.getId() == userId).findFirst().orElse(null);
	}

	public void writeUsersToFile(List<User> users) throws Exception {
		try {
			objectMapper.writerWithDefaultPrettyPrinter().writeValue(Files.newOutputStream(Paths.get(FILE_PATH)),
					users);
		} catch (IOException e) {
			e.printStackTrace();
			throw new Exception("Error occured while writing the file", e);
		}
	}

	public void writeUsersToFile(UserReq userReq) throws Exception {
		List<User> users = readDataFromFile();
		Long nextId = users.stream().map(User::getId).max(Long::compare).orElse(0L) + 1;

		User user = new User();
		user.setId(nextId);
		user.setName(userReq.getName());
		user.setAge(userReq.getAge());
		user.setEmail(userReq.getEmail());
		users.add(user);
		writeUsersToFile(users);
	}

	public User updateUsersData(Long id, User userDetails) throws Exception {
		List<User> users = readDataFromFile();
		Optional<User> optUsers = users.stream().filter(us -> (us.getId() == id)).findFirst();
		optUsers.ifPresent(user -> {
			user.setName(userDetails.getName());
			user.setAge(userDetails.getAge());
			user.setEmail(userDetails.getEmail());
		});

		writeUsersToFile(users);
		return optUsers.orElse(null);
	}

	public void deleteUser(Long userId) throws Exception {
		List<User> users = readDataFromFile();
		users.removeIf(user -> user.getId().equals(userId));
		writeUsersToFile(users);
	}

	private List<User> readDataFromFile() {
		List<User> users = new ArrayList<>();
		Path path = Paths.get(FILE_PATH);
		if (!Files.exists(path)) {
			return users;
		}
		try {
			users = objectMapper.readValue(Files.newInputStream(path), new TypeReference<List<User>>() {
			});
			users.sort(Comparator.comparing(User::getId));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}

	/**
	 * This method would determin filePaths based on Docker Deployment or Local
	 * Deployment
	 * 
	 * @return FilePath which is a String
	 */
	private String determineFilePath() {
		return Files.exists(Paths.get("/app/data")) ? "/app/data/users.json" : "src/main/resources/users.json";
	}

}
