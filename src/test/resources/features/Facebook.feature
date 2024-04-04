Feature: Login functionality

  Scenario Outline:
    Given I am on Facebook login page
    When I enter invalid Facebook email "<email>"
    And I enter invalid facebook password "<password>"
    Then I should get message "<error>"




    Examples:
      | email             | password      | error                                               |
      | test123456@te.com | myFavPassword | The email you entered isn’t connected to an account.|
