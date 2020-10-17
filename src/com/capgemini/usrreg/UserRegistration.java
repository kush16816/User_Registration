
package com.capgemini.usrreg;

import java.util.Scanner;

public class UserRegistration {

	/**
	 * @param args
	 */
	static String firstName;
	static String lastName;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		addFirstName();
		addLastName();

		Validator.validate(firstName, Validator.f_Name);
		Validator.validate(lastName, Validator.l_Name);

	}

	/**
	 * Takes first name from user
	 */
	public static void addFirstName() {

		System.out.println("Enter your first name");
		firstName = sc.next();
	}

	/**
	 * Takes last name from user
	 */
	public static void addLastName() {

		System.out.println("Enter your last name");
		lastName = sc.next();
	}
}
