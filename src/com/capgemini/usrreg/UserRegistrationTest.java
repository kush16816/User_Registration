package com.capgemini.usrreg;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;

public class UserRegistrationTest {

	@Parameter
	public static String[] falseEmailIDs = { "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
							".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gamil.com", "abc.@gmail.com",
							"abc@abc@gmail.com", "abc@gmail.com.1a" };
	
	@Parameter
	public static String[] trueEmailIDs = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", 
							"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com" };

	@Test
	public void testForValidFirstName() {
		assertEquals(true, Validator.validate("Kushagra", Validator.f_Name));
	}

	@Test
	public void testForInvalidFirstName() {
		assertEquals(false, Validator.validate("Kushagr5", Validator.f_Name));
	}

	@Test
	public void testForValidLastName() {
		assertEquals(true, Validator.validate("Sharma", Validator.l_Name));
	}

	@Test
	public void testForInvalidLastName() {
		assertEquals(false, Validator.validate("Sha15rma", Validator.l_Name));
	}

	@Test
	public void testForValidEmailID() {
		for (int i = 0; i < 7; i++)
			assertEquals(true, Validator.validate(trueEmailIDs[i], Validator.email_ID));
	}

	@Test
	public void testForInvalidEmailID() {
		for (int j = 0; j < 12; j++)
			assertEquals(false, Validator.validate(falseEmailIDs[j], Validator.email_ID));
	}

	@Test
	public void testForValidMobileNo() {
		assertEquals(true, Validator.validate("91 9846541648", Validator.mob_No));
	}

	@Test
	public void testForInvalidMobileNo() {
		assertEquals(false, Validator.validate("91 958436584", Validator.mob_No));
	}

	@Test
	public void testForValidPassword() {
		assertEquals(true, Validator.validate("@Password15", Validator.pass_Word));
	}

	@Test
	public void testForInvalidPassword() {
		assertEquals(false, Validator.validate("@Password", Validator.pass_Word));
	}

}
