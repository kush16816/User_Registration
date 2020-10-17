package com.capgemini.usrreg;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {

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
		assertEquals(true, Validator.validate("abc.123@gmail.com", Validator.email_ID));
	}
	
	@Test
	public void testForInvalidEmailID() {
		assertEquals(false, Validator.validate("abc.123@gmail.com.aus", Validator.email_ID));
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
