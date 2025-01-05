package com.learnJava;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

public class Main {

	BinaryOperator<List<String>> binaryOperator = (a, b) -> {
		System.out.println("input 1 : " + a + "input 2 : " + b);
		return a;
	};

	public void listToMap() {

		Map<String, List<String>> result1 = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities, binaryOperator));
		System.out.println("Result 1 : " + result1);

	}

	public static void main(String[] args) {

		List<Integer> varLis = Arrays.asList(1, 2, 3, 4, 5, 6);
		// Max
		System.out.println("MinMax");
		Optional<Integer> resVal = varLis.stream().max(Comparator.naturalOrder());
		resVal.ifPresent(v -> System.out.println(v));
		System.out.println("=======");
		// allMatch
		System.out.println("allMatch");
		boolean flag = varLis.stream().allMatch(i -> i % 2 == 0);
		System.out.println("allMatch Value: " + flag);
		System.out.println("=======");
		// allMatch
		System.out.println("anyMatch");
		boolean anyMatchflag = varLis.stream().anyMatch(i -> i % 2 == 0);
		System.out.println("anyMatch Value: " + anyMatchflag);
		System.out.println("=======");
		// findFirst
		System.out.println("Find First");
		Optional<Integer> findFirstVal = varLis.stream().findFirst();
		findFirstVal.ifPresent(num -> {
			System.out.println("First Value found is ::" + num);
		});
		System.out.println("=======");
		// findAny
		System.out.println("Find Any");
		Optional<Integer> findAnyVal = varLis.stream().findAny();
		findAnyVal.ifPresent(num -> {
			System.out.println("Find Any Value found is ::" + num);
		});
		System.out.println("=======");

		// Requirement;
		System.out.println("Find repeating number and print it");
		int[] nums = { 2, 2, 2, 3, 3, 4, 5 };
		List<Integer> listNums = Arrays.stream(nums).boxed().collect(Collectors.toList());
		Set<Integer> inpSet = new HashSet<>();
		Set<Integer> outSet = listNums.stream().filter(num -> !inpSet.add(num)).collect(Collectors.toSet());
		outSet.forEach(num -> System.out.print("Repeated Numbers are:: " + num + " "));
		System.out.println();
		System.out.println("=======");
	}
}
