Feature: Facebook LoginPage
  @login
  Scenario: As a registered user I should be able to login in
    Given I'm on Login page
    When Provide Registered Email or phone number
    And Provide Valid Password
    And Click Login Button
    Then I should be re directed to home page
