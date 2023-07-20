package wally.testCase;

import org.testng.annotations.Test;

import wally.pageObjects.Wally_Login_pom;
import wally.pageObjects.Wally_Profile_pom;

public class Wally_Profile_TC extends Wally_BaseClass {
	@Test
	public void profile() {	
		Wally_Login_pom log = new Wally_Login_pom(driver);
		log.user_emailid(emailid1);
		log.password(password);
		log.submit();
		Wally_Profile_pom profile = new Wally_Profile_pom(driver);
		profile.user_profile();
		profile.profile_firstname();
		profile.profile_lastname();
		profile.profile_phone();
		
			
	}
}
