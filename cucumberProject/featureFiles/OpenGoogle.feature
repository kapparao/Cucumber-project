Feature: This is to Test google search
Scenario: Google Search scenario
	Given user is entering the google URL
	When user is entering the search as "Selenium Automation"
	And user clicking the search button
	Then user should see the search results
																								
