package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BackgroundHooks {

	@Before
	public void beforeScenario() {

		System.out.println("This will run all before scenarios ");

	}

	@After
	public void afterScenario() {

		System.out.println("This will run all after scenarios ");
	}

}

