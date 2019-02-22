package com.dlabs.java_8_workouts_defaultMethod;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2(String str) {

	}

	@Override
	public void method1(String str) {

	}

	// Interface1's default log method implementation
	@Override
	public void log(String str) {
		// Interface1's default log method implementation
		 Interface1.super.log(str);

		// Interface2's default log method implementation
		// Interface2.super.log(str);
	}

	public static void main(String ar[]) {
		MyClass myClass = new MyClass();
		myClass.log("Hello..");
	}

}
