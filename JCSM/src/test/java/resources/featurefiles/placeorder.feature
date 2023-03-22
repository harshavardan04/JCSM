@placeOrder
Feature: User places order

  Scenario Outline: User places order

    Given user is on store page
    When User checkout a "<productName>"
    And User provides billing details "<fName>","<lName>","<address>","<city>","<zip>","<email>"
    Then user should see order is placed successfully

    Examples:
      | productName | fName | lName | address           | city    | zip   | email                |
      | Blue Shoes  | demo  | user  | 879 chancery lane | florida | 98432 | test2224@yopmail.com |

