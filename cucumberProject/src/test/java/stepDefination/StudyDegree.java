package stepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StudyDegree {

	@Given("Student should clear higer education")
	public void student_should_clear_higer_education() {

		System.out.println("Studend should clear 10th Grade");

	}

	@Given("Student should clear higer-secondary education")
	public void student_should_clear_higer_secondary_education() {

		System.out.println("Studend should clear 12th Grade");
	}

	@Given("Need to clear NEET")
	public void need_to_clear_neet() {

		System.out.println("Studend should clear NEET Exame");

	}

	@Given("Apply the medical college")
	public void apply_the_medical_college() {

		System.out.println("Studend should applay Medical College");

	}

	@When("Application get approval")
	public void application_get_approval() {

		System.out.println("Studend application should get approved");

	}

	@When("Interview for Canditate")
	public void interview_for_canditate() {

		System.out.println("Studend call for Interview");
	}

	@When("Cantidate clear in Interview")
	public void cantidate_clear_in_interview() {

		System.out.println("Studend clear the Interview");
	}

	@Then("Student joined in Government medical college")
	public void student_joined_in_government_medical_college() {
		System.out.println("Studend should join the government medical college");
	}

	@Given("Buy the application form from Engineering college")
	public void buy_the_application_form_from_engineering_college() {
		System.out.println("Studend should put application for Engineering college");
	}

	@Given("Fill the details and give back to admin office")
	public void fill_the_details_and_give_back_to_admin_office() {

		System.out.println("Studend should fill and give back to admin office");

	}

	@Then("Student joined in Government Engineering college")
	public void student_joined_in_government_engineering_college() {

		System.out.println("Studend should join the government Engineering college");

	}

	@Given("Buy the application form from Any Arts college")
	public void buy_the_application_form_from_any_arts_college() {
		System.out.println("Studend should put application for Any Arts college");
	}

	@Then("Student joined in Government Arts college")
	public void student_joined_in_government_arts_college() {

		System.out.println("Studend should join the government Arts college");

	}

}
