
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
	static String password;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		addFirstName();
		addLastName();
		addEmailID();
		addMobileNo();
		addPassword();

		Validator.validate(firstName, Validator.f_Name);
		Validator.validate(lastName, Validator.l_Name);
		Validator.validate(emailID, Validator.email_ID);
		Validator.validate(mobileNo, Validator.mob_No);
		Validator.validate(password, Validator.pass_Word);

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

	/**
	 * Takes password from user
	 */
	public static void addPassword() {

		System.out.println("Enter your Password");
		password = sc.next();
	}
}
