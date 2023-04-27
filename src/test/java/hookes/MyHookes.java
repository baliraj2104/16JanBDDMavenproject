package hookes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import pageObject.AdminPage;
import stepdefinations.Base;

public class MyHookes extends Base {
    
	@Before
	public void setUp() {
		//System.out.println("Launch Application");
		
	}
	
	@After
	public void tearDown() {
		//System.out.println("close the browser");
		
	}
	
	@BeforeStep
	public void takescreenshot() {
		System.out.println("take the screenshot");
	}
	
	
}
