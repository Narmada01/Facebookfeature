Feature: Search for a friend in facebook

  Background: As a registered user I should be able to login in
    Given I'm on Login page
    When Provide Registered Email or phone number
    And Provide Valid Password
    And Click Login Button
    Then I should be re directed to home page

  @search
  Scenario: As a user I should be able to search new friends
    Given I'm on homepage
    When Click on Search facebook text
    Then land on result search page "ISTQB Guru"
  @account
  Scenario: As a user I should be able to change account settings
   When Click on account settings
   And Choose Display and Accessability
   And Turn on Dark mode
   And Turn on Compact mode
   And return to account setting
   Then Logout
