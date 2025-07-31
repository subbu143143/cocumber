Feature: Login Functionality

  @Smoke
  Scenario Outline: Validate the Login Functionality with valid Credentials
    Given User should open the Browser
    And User open the Application
    When User enters the <Username> & <Password>
    And User click on the Sigin button
    Then User should successfully login
    And User should navigate to Search Hotel Functionality
    
    Examples:
    	|Username | Password |
    	|praveen  |	pravven@123 |
    	|anil     |           |
    	|anil			| anwesh26#	|
    	|anwesh26	| anil@123	|
    	|anwesh26	| anwesh26# |  

    	