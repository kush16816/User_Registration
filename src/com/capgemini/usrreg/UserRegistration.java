
package com.capgemini.usrreg;

import java.util.Scanner;

public class UserRegistration {

	/**
	 * @param args
	 */
	static String firstName;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		addFirstName();

		Validator.validate(firstName, Validator.f_Name);

	}

	/**
	 * Takes first name from user
	 */
	public static void addFirstName() {
		
		System.out.println("Enter your first name");
		firstName = sc.next();
	}
}
