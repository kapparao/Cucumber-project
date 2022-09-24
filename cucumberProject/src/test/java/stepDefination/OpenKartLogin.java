package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenKartLogin {
	static WebDriver driver;

	@Given("user open the respective browser")
	public void user_open_the_respective_browser() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	@And("user provide the open kart URL")
	public void user_provide_the_open_kart_url() {
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

	}

	@When("entering the below username and password")
	public void entering_the_below_username_and_password(DataTable credentials) {

		List<Map<String, String>> cre = credentials.asMaps(String.class, String.class);
		
		String userName = cre.get(0).get("userName");
		String password = cre.get(1).get("Password");
		
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).sendKeys(password);

	}

	/*
	 * @When("provide the  {string} and {string}") public void
	 * provide_the_and(DataTable datatable) {
	 * 
	 * List<Map<String, String>> unpass = datatable.asMaps(String.class,
	 * String.class);
	 * 
	 * String userName = unpass.get(0).get("userName"); String password =
	 * unpass.get(0).get("password");
	 * 
	 * driver.findElement(By.id("input-email")).sendKeys(userName);
	 * driver.findElement(By.id("input-password")).sendKeys(password);
	 * 
	 * }
	 */

	@When("Hitting the login button icon")
	public void hitting_the_login_button_icon() {

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	}

}
