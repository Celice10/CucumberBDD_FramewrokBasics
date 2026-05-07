Feature: login
  As a user
  I want to login to ndosi website
  So that I can access my account

  Scenario Outline: Successful login with valid credentials
    Given user is on login page
    When user enters valid "<username>" and "<password>"
    And user clicks the login button
    Then user should be redirected to the dashboard

    Examples:
      | username | password |
      | User1    | Pass1    |
      | User2    | Pass2    |
