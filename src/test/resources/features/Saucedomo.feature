Feature: Google search

  Scenario: I navigate to home page
    Given I login using username
    Then I login suing password
    Then I print all item names from page



    Scenario: Login with locked user
      Given I am on sause swag login page
      When I login with locked username and password
      Then I should get error message

      Scenario: Login with visual user
        Given I am on swag login page
        When I login with visual user
        Then I shoul see backpack item




