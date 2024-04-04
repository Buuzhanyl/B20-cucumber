Feature: idfjd

  Scenario Outline: dkfj
    Given I am on Selenium Playground home page
    When I click Input Form Submit Link
    Then I enter all required data in form
    Then I click submit
    And I validate success message

    Examples:
      | name | email          | password | company  | country       | city      | address      | address | state | zipcode |
      | John | john@gmail.com | john123  | Codefish | united States | Desplanes | 2200 e Devon | 351     | Ill   | 60018   |



  Scenario: Test input form 2
    Given I am on Selenium Playground home page
    When I click Input Form Submit Link
    And I fill out the form with following information
      | name     | John          |
      | email    | jc@gmail.com  |
      | password | myFavPass     |
      | company  | Codefish      |
      | website  | Codefish.io   |
      | country  | United States |
      | city     | Des Plaines   |
      | address1 | 2200 E Devon  |
      | address2 | 351           |
      | state    | IL            |
      | zipCode  | 60018         |
    And click submit
    Then I should see success message

