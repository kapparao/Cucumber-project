Feature: This is for Login the Applicaton OpenKart
Scenario:Login the Application with Valid Credentials.

Given user opening the respective browser
And user entering the open kart URL
When entering the below username and password
  	|userName|Password|
		|kapparao@yahoo.com    | Readonly@2022|
		|kapparao@google.com 	 | writeonly@2022|
		|kapparao@hotmail.com  | readandwrite@2022|

