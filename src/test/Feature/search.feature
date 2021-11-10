Feature: Search for a friend in facebook
  @search
  Scenario: As a user I should be able to search new friends
    Given I'm on homepage
    When Click on Search facebook text
    Then land on result search page "ISTQB Guru"

