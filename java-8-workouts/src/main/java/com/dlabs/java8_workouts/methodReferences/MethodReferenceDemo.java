package com.dlabs.java8_workouts.methodReferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		compareByAge(new Student("Sai", 23), new Student("Janu", 3));

	}

	public static int compareByAge(Student first, Student second) {
		return Integer.compare(first.age, second.age);
	}

}

class MyComparator {
	public int compareByFirstName(User first, User second) {
		return first.getFirstName().compareTo(second.getFirstName());
	}

	public int compareByLastName(User first, User second) {
		return first.getLastName().compareTo(second.getLastName());
	}

	private static void instanceMethodReference() {
		System.err.println("Instance method reference");
		List<User> users = Arrays.asList(new User("Gaurav", "Mazra"), new User("Arnav", "Singh"),
				new User("Daniel", "Verma"));
		MyComparator comparator = new MyComparator();
		System.out.println(users);
		Collections.sort(users, comparator::compareByFirstName);
		System.out.println(users);
	}
}
