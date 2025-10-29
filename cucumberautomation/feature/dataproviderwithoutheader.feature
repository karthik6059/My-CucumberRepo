Feature: Test with dataprovider
	Scenario Outline:: user login data
	 Given users at login page of the application
	 When user enter the details "<username>" and "<password>"
	 And click login button on the page
	 
	 Examples:
	 |username|password|
	 |karthik|kannan|
	 |Laksh|Poorni|
		
	
