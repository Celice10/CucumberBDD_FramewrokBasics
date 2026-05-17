
Feature: login
  As a user
  I want to login to ndosi website
  So that I can access my account

  @smoke
  Scenario: Successful login with valid credentials
    Given user is on the Home page
    When user enters valid credentials
    And user clicks the login button
    Then user should be redirected to the dashboard

