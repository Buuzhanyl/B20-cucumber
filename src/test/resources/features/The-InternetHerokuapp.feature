Feature: The Internet herokuapp
  Scenario: Validate links on home page
    When I navigate to home page
    Then I shuold see 44 links


    Scenario: validate checkboxes header
      When I navigate to checkboxes page
      Then I validate page header
