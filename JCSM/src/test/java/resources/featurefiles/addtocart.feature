@addToCart
Feature: test one

  Rule: Add step feature

  Scenario Outline: First Scenario
    Given user is on store page
    When user adds "<productName>" to the cart
    Then User see "<productName>" is added in the cart

    Examples:
      | productName |
      | Blue Shoes  |


