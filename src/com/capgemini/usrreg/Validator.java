package com.capgemini.usrreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	static final String fName = "^[A-Z][A-Za-z]{2,}";
	static final String lName = "^[A-Z][A-Za-z]{2,}";
	static final String emailId = "^[a-z0-9]+[a-z0-9.+-_]+@[a-z0-9]+.[a-z]{2,}(.[a-z]{2})?$";
	static final String mobNo = "[1-9][0-9][\\s][1-9][0-9]{9}";
	static final String passWord = "^(?=.*[A-Z])(?=.*[@$!#*])(?=.*[0-9]).{8,}";

	static Matcher match;

	static final String f_Name = "First Name";
	static final String l_Name = "Last Name";
	static final String email_ID = "EmailID";
	static final String mob_No = "Moblie No";
	static final String pass_Word = "Password";

	/**
	 * @param input Contains input to be verified
	 * @param type  Contains type of input to be verified
	 */
	public static boolean validate(String input, String type) {

		switch (type) {
		case f_Name:
			match = Pattern.compile(fName).matcher(input);

			if (match.matches()) {
				System.out.println("The mood of user is happy for " + type );
				return true;
			} else {
				System.out.println("The mood of user is sad for " + type );
				return false;
			}
		case l_Name:
			match = Pattern.compile(lName).matcher(input);

			if (match.matches()) {
				System.out.println("The mood of user is happy for " + type );
				return true;
			} else {
				System.out.println("The mood of user is sad for " + type );
				return false;
			}
		case email_ID:
			match = Pattern.compile(emailId).matcher(input);

			if (match.matches()) {
				System.out.println("The mood of user is happy for " + type );
				return true;
			} else {
				System.out.println("The mood of user is sad for " + type );
				return false;
			}
		case mob_No:
			match = Pattern.compile(mobNo).matcher(input);

			if (match.matches()) {
				System.out.println("The mood of user is happy for " + type );
				return true;
			} else {
				System.out.println("The mood of user is sad for " + type );
				return false;
			}
		case pass_Word:
			match = Pattern.compile(passWord).matcher(input);

			if (match.matches()) {
				System.out.println("The mood of user is happy for " + type );
				return true;
			} else {
				System.out.println("The mood of user is sad for " + type );
				return false;
			}
		}
		return false;
	}
}