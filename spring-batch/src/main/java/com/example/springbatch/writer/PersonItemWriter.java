package com.example.springbatch.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import com.example.springbatch.entities.Person;

import java.io.FileWriter;
import java.util.List;

@Component
public class PersonItemWriter implements ItemWriter<Person> {

	private String outputFile = "D:\\Work\\Train_Proj\\spring-batch\\src\\main\\resources\\output.txt"; // Specify your
																										// output file
																										// name

	@Override
	public void write(List<? extends Person> persons) throws Exception {
		System.out.println("Person Being Written" + persons.size());
		try (FileWriter writer = new FileWriter(outputFile, true)) {
			for (Person person : persons) {

				writer.write(person.toString() + "\n");
			}
		}
	}
}
