@Regression
Feature: GlobalSQA site 
Scenario: validation of elements on home page
		Given user navigate to globalsqa site
		Then user clicks on "home" button in "homeglobal" page
#		Then user validates "+91-9910979218" on "homeglobal" page 
#		Then user validates "contact@globalsqa.com" on "homeglobal" page
#		Then user validates "Fields of Expertise" on "homeglobal" page
#		Then user validates "End to End QA Solution" on "homeglobal" page
#		Then user validates "QA Consulting" on "homeglobal" page
#		Then user validates "QA Outsourcing" on "homeglobal" page
#		Then user validates "Test Automation" on "homeglobal" page
 # 	Then user validates "Testing & QA Services" on "homeglobal" page
#    Then user validates text "Selenium" on "homeglobal" page
#		Then user validates text "Robotium" on "homeglobal" page
#		Then user validates text "HP Loadrunner" on "homeglobal" page
#		Then user validates text "Coded UI" on "homeglobal" page
#		Then user validates text "Test Complete" on "homeglobal" page
#		Then user validates "Contact Info" on "homeglobal" page
#		Then user validates text "+91-9910979218" in element "phno" on "homeglobal" page

Scenario: validation of elements on cheatsheet page	
		Then user clicks on "cheatsheet" button in "cheatsheet" page
		Then user validates "+91-9910979218" on "cheatsheet" page 
		Then user validates "contact@globalsqa.com" on "cheatsheet" page
		Then user validates "GIT Cheat Sheet" on "cheatsheet" page
		Then user validates "VIM Cheat Sheet" on "cheatsheet" page
		Then user validates "VIM Cheat Sheet" on "cheatsheet" page
		Then user validates "Python Beginner Cheat Sheet" on "cheatsheet" page
		Then user validates "Contact Info" on "cheatsheet" page
		Then user validates text "+91-9910979218" in element "phno" on "cheatsheet" page

Scenario: 	validation of elements on ebook page	
		Then user clicks on "free_ebook" button in "ebbook" page
		Then user validates "+91-9910979218" on "ebbook" page
		Then move towards element "free_ebook"in page "ebbook"
		Then user validates text "Free Machine Learning Ebooks" in element "freelearning" on "ebbook" page
		Then user validates text "Free Deep Learning eBooks" in element "freedeep" on "ebbook" page
		Then user validates text "Free Elasticsearch eBooks" in element "freeelastic" on "ebbook" page
		Then user validates text "+91-9910979218" in element "phno" on "ebbook" page

Scenario:	 validation of elements on testerhub page	
		Then user clicks on "tester_hub" button in "testerhub" page
		Then move towards element "tester_hub"in page "testerhub"
		Then user validates text "Demo Testing Site" in element "DemoTesting" on "testerhub" page
		Then move towards element "DemoTesting"in page "testerhub"
		Then move towards element "tooltip"in page "testerhub"
   	Then user validates text "Tooltip" in element "tooltip" on "testerhub" page
		Then move towards element "AlertBox"in page "testerhub"
		Then user validates text "AlertBox" in element "AlertBox" on "testerhub" page
		Then user validates text "DatePicker" in element "DatePicker" on "testerhub" page
		Then user validates text "Dialog Boxes" in element "DialogBoxes" on "testerhub" page
		Then user validates text "Progress Bar" in element "ProgressBar" on "testerhub" page
		Then user validates text "Drag And Drop" in element "DragAndDrop" on "testerhub" page
		Then user validates text "Draggable boxes" in element "Draggable" on "testerhub" page
		Then user validates text "DropDown Menu" in element "DropDownMenu" on "testerhub" page
		Then user validates text "Toolbar" in element "Toolbar" on "testerhub" page
		Then user validates "+91-9910979218" on "testerhub" page
		Then user validates text "+91-9910979218" in element "phno" on "testerhub" page

Scenario:	 validation of elements on contactus page	
		Then user clicks on "contactus" button in "contactinfo" page
		Then user validates "+91-9910979218" on "contactinfo" page
		Then user validates "Contact Form" on "contactinfo" page
		Then user validates text "name" in element "name" on "contactinfo" page
		Then user validates text "email" in element "email" on "contactinfo" page
		Then user validates text "send" in element "send" on "contactinfo" page

Scenario: closing the browser	
		Then close broswer1

	
