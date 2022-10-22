@Regression
Feature: PHP Home page

#@smoke
#Scenario: User login to PHP website
#		Given User navigate to php page	
#		Then go to demo page	
#		Then user is on demo page
#		Given validate text	Instant Demo
#		Then user enters "Divya" in fname field
#		Then user enters "Jadhav" in lname field
#		Then user enters "dvj" in Businessname field
#		Then user enters "jadhavdivya123@gmail.com" in email field
#		Given This is a close broswer test

Scenario Outline: Another form fill 
		Given User navigate to php page	
		Then go to demo page	
		Then user is on demo page
		Given validate text	Instant Demo
		Then user enters "<fname>" in fname field
		Then user enters "<lname>" in lname field
		Then user enters "<bname>" in Businessname field
		Then user enters "<emailid>" in email field
		Given This is a close broswer test
Examples: 
		|	fname	      |	lname	       |	bname	  |		emailid		|
		|R/5FYCjjJ0U= |3435DG6WMKI=  | SG      |sanika123@gmail.com|
		|isha         | mane         | IM      |isha123@gmail.com|
		|era          | jadhav       | EJ      |era123@gmail.com|
		
		