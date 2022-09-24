
Feature: Study Degree

Background: Student should complete School Education
		Given Student should clear higer education
		Given Student should clear higer-secondary education
 
  
  Scenario: I want to Study Doctor
    Given Need to clear NEET
    And Apply the medical college
    When Application get approval
    And Interview for Canditate
    And Cantidate clear in Interview
    Then Student joined in Government medical college
    
	Scenario: I want to Study Engineering
    Given Buy the application form from Engineering college
    And Fill the details and give back to admin office
    When Application get approval
    And Interview for Canditate
    And Cantidate clear in Interview
    Then Student joined in Government Engineering college
    
 Scenario: I want to Study Arts
    Given Buy the application form from Any Arts college
    And Fill the details and give back to admin office
    When Application get approval
    And Interview for Canditate
    And Cantidate clear in Interview
    Then Student joined in Government Arts college
    

