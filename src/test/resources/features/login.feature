Feature: Test login fuctionality

  
  Scenario Outline: Check login is successful with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And click on login button
    Then should be able to land on home page
    

    Examples: 
      |username|password|
      |saurabhitankar1|Welcome123|