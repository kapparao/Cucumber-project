
Feature: This is for Login the Applicaton OpenKart with Data Table
Scenario Outline: Login the Application
    Given user open the respective browser
    And user provide the open kart URL
		When provide the  "<userName>" and "<password>"
		And Hitting the login button icon
    
    Examples:
    |userName 					   | password		 |
		|kapparao@yahoo.com    | Readonly@2022|
		|kapparao@google.com 	 | writeonly@2022|
		|kapparao@hotmail.com  | readandwrite@2022|
		
    
    
    
    
    
   