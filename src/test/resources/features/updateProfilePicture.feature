
@tag
Feature: To verify upload picture
  @tag1
  Scenario Outline: Check user is able to upload profile picture
    Given User is able to login with valid credentials <username> and <password>
    And navigate to profile page
    When when he upload picture
    Then user should be able to upload picture


   Examples: 
      |username|password|
      |saurabhitankar1|Welcome123|