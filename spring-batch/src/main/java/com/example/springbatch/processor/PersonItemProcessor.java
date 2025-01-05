package com.example.springbatch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import com.example.springbatch.entities.Person;

@Component
public class PersonItemProcessor implements ItemProcessor<Person, Person> {

	@Override
	public Person process(Person person) throws Exception {
		// Add your processing logic here
		// For simplicity, let's just uppercase the names
		person.setFirstName(person.getFirstName().toUpperCase());
		person.setLastName(person.getLastName().toUpperCase());
		System.out.println("Person Being Processed" + person);
		return person;
	}
}
