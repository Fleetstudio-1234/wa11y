package wally.testCase;

import org.testng.annotations.Test;

import wally.pageObjects.Wally_Login_pom;

public class Wally_Login_TC extends Wally_BaseClass {
	// Test method for execution
	@Test
	public void signin() {
		// implementing the testcases

		Wally_Login_pom log = new Wally_Login_pom(driver);
		log.user_emailid(emailid1);
		log.password(password);
		log.submit();
	}
}
