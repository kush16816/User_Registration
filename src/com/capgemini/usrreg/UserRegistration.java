
package com.capgemini.usrreg;

import java.util.Scanner;

public class UserRegistration {

	/**
	 * @param args
	 */
	static String firstName;
	static String lastName;
	static String emailID;
	static String mobileNo;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		addFirstName();
		addLastName();
		addEmailID();
		addMobileNo();

		Validator.validate(firstName, Validator.f_Name);
		Validator.validate(lastName, Validator.l_Name);
		Validator.validate(emailID, Validator.email_ID);
		Validator.validate(mobileNo, Validator.mob_No);

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
	
	/**
	 * Takes email ID from user
	 */
	public static void addEmailID() {

		System.out.println("Enter your email ID");
		emailID = sc.next();
	}
	
	/**
	 * Takes mobile no from user
	 */
	public static void addMobileNo() {

		System.out.println("Enter your mobile no.");
		mobileNo = sc.next();
	}
}
