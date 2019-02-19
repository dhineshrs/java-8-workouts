package com.dlabs.java_8_workouts.functional_interface;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		PredicateDemo predicateDemo = new PredicateDemo();
		predicateDemo.predicateDemo1();
		predicateDemo.predicateDemo2();

	}

	public void predicateDemo1() {
		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i < 18);

		// Calling Predicate method
		System.out.println(lesserthan.test(10));
	}

	public void predicateDemo2() {
    
        Predicate<Integer> greaterThanTen = (i) -> i > 10; 
  
        // Creating predicate 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;  
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15); 
        System.out.println(result); 
  
        // Calling Predicate method 
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15); 
        System.out.println(result2); 
    } 

}
