Feature: To retrive Times of India tweets
 
  @tag1
  Scenario: To retrive tweets from Times of India page
    Given User is logged in
    And user search for Times of India
    When users press enter
    And clicks on the Times of india page
    And the page opens
    Then retrive tweets from the page
    And which is published in last 2hs

  
