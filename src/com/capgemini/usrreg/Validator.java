package com.capgemini.usrreg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

	static final String fName = "^[A-Z][A-Za-z]{2,}";
	static final String lName = "^[A-Z][A-Za-z]{2,}";

	static Matcher match;

	static final String f_Name = "First Name";
	static final String l_Name = "Last Name";

	/**
	 * @param input Contains input to be verified
	 * @param type  Contains type of input to be verified
	 */
	public static boolean validate(String input, String type) {

		switch (type) {
		case f_Name:
			match = Pattern.compile(fName).matcher(input);

			if (match.matches()) {
				System.out.println("Your " + type + " is in valid format");
				return true;
			} else {
				System.out.println("Your " + type + " is not in valid format");
				return false;
			}
		case l_Name:
			match = Pattern.compile(lName).matcher(input);

			if (match.matches()) {
				System.out.println("Your " + type + " is in valid format");
				return true;
			} else {
				System.out.println("Your " + type + " is not in valid format");
				return false;
			}
		}
		return false;
	}
}