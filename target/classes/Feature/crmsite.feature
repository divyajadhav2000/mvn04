@Regression
Feature: freeCRM site 
Scenario: 
		Given User login on CRM site
		Then user clicks on "contactpage" in "contact"
		Then user clicks on "create" in "contact"
		Then user enters "Divya" in "firstname" field in "contact"
		Then user enters "Jadhav" in "lastname" field in "contact"
		Then user enters "Vikas" in "middlename" field in "contact"
		Then user enters "TCS" in "companyname" field in "contact"
		Then user clicks on "donotcall" in "contact"
		When user clicks on "save" in "contact"
		Then move towards "company" in "company"
		Then user clicks on "compicon" in "company"
		Then move towards "create" in "company"
		Then user clicks on "create" in "company"
		Then user enters "TCS" in "cname" field in "company"
		When user clicks on "save" in "company"
		Then close broswer
		
		