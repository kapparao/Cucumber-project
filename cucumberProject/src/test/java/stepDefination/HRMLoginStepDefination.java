package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLoginStepDefination {

	WebDriver driver;

	@Given("user entering the vaild URL")
	public void user_entering_the_vaild_url() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("user entering the userName as {string} and password as {string}")
	public void user_entering_the_user_name_as_and_password_as(String userName, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);

	}

	@When("click the login button")
	public void click_the_login_button() {
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
				.click();

	}

	@Then("user should able to see userdropdown")
	public boolean user_should_able_to_see_userdropdown() {

		Assert.assertTrue(driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).isDisplayed());
		return true;

	}

}
