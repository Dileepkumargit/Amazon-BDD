Feature: Amazon Testing

  Scenario: checking the ADD TO CART fuctionality
    Given User visits the website
    And User click on signin button
    When User enter the username and password and click on Login button
    And search for iteam and select
    And select the iteam from search results page
    And click on add to cart
    And check the iteam in cart is present
    And logout fro the website
