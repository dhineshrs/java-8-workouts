package com.dlabs.java_8_workouts.methodReferences;

public class MethodReferenceTest {

	public static void main(String[] args) {
		int a = MethodReferenceDemo::compareByAge(new Student("Sai", 23), new Student("Janu", 3));
		System.out.println(" Static MethodReferenceTest : " + a);
	}

}
