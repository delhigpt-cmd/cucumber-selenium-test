package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Steps {
	public ChromeDriver driver;

@Given("user launch {string} browser")
public void user_launch_browser(String string) {
    
	driver=new ChromeDriver();
	
	
}

@When("user open url {string}")
public void user_open_url(String string) {
   driver.get(string);
}

@Then("I Verify logo is present")
public void i_verify_logo_is_present() {
  System.out.println(driver.getTitle());
}

@Then("close browser")
public void close_browser() {
 driver.quit();
}



}
