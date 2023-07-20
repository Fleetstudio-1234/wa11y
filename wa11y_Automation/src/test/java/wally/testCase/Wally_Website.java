package wally.testCase;

import org.testng.annotations.Test;

import wally.pageObjects.Wally_Login_pom;
import wally.pageObjects.Wally_Website_pom;

public class Wally_Website extends Wally_BaseClass{
	@Test
	public void website() {
		Wally_Login_pom log = new Wally_Login_pom(driver);
		log.user_emailid(emailid1);
		log.password(password);
		log.submit();
		Wally_Website_pom web = new Wally_Website_pom(driver);
		web.add_new_web();
		web.domain();
		web.website();
		web.view_audit();
		
	}
}
