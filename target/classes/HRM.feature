Feature: OrangeHrm Login/out
  @login
  Scenario: admin Login and logout
    Given I am navigating to orrangeHRM Website
    When I enter username and password
    Then I calick on Login button
    And I should login sucessfuly
