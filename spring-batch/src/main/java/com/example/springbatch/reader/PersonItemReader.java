package com.example.springbatch.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.stereotype.Component;

import com.example.springbatch.entities.Person;

import java.io.BufferedReader;
import java.io.FileReader;

@Component
public class PersonItemReader implements ItemReader<Person> {

	private BufferedReader reader;
	private String inputFile = "D:\\Work\\Train_Proj\\spring-batch\\src\\main\\resources\\input.txt"; // Specify your
																										// input file
																										// name

	public PersonItemReader() throws Exception {
		this.reader = new BufferedReader(new FileReader(inputFile));
	}

	@Override
	public Person read() throws Exception {
		String line = reader.readLine();

		if (line != null) {
			String[] fields = line.split(" ");
			Person person = new Person();
			person.setFirstName(fields[0]);
			person.setLastName(fields[1]);
			System.out.println("Person Being Read" + person);
			return person;
		}

		reader.close();
		return null; // End of file
	}
}
