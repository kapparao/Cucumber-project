package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogleStepDefination {

	WebDriver driver;

	@Given("user is entering the google URL")
	public void user_is_entering_the_google_url() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in");

	}

	@When("user is entering the search as {string}")
	public void user_is_entering_the_search_as(String string) {

		driver.findElement(By.name("q")).sendKeys(string);

	}

	@And("user clicking the search button")
	public void user_clicking_the_search_button() {

		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).sendKeys(Keys.ENTER);

	}

	@Then("user should see the search results")
	public void user_should_see_the_search_results() {

		if (driver.getTitle().equalsIgnoreCase("selenium jobs - Google Search")) {

			System.out.println("Test Pass....");

		}

	}

}
