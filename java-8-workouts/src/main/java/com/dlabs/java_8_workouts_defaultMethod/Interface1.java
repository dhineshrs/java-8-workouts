package com.dlabs.java_8_workouts_defaultMethod;

public interface Interface1 {

	
	void method1(String str);

	// Java Interface Default Method
	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

}
