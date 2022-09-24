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

public class OpenKartLoginStepDefination {
	WebDriver driver;

	@Given("user opening the respective browser")
	public void user_opening_the_respective_browser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();

	}

	@And("user entering the open kart URL")
	public void user_entering_the_open_kart_url1() {

		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");

	}

	@When("entering the  {string} and {string}")
	public void entering_the_below_username_and_password(DataTable dataTable) {

		List<Map<String, String>> keyvaluePair = dataTable.asMaps(String.class, String.class);

		String username = keyvaluePair.get(0).get("UserName");
		String password = keyvaluePair.get(0).get("Password");

		/*
		 * List<String> cre = dataTable.asList(String.class); String username =
		 * cre.get(0); String password = cre.get(1)
		 */;

		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);

	}

	@And("clicking the login icon")
	public void clicking_the_login_icon() {

		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

	}

}
