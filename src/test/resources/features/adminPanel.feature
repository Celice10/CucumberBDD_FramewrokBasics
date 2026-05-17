Feature: Navigate to admin panel

  Scenario: Navigate to admin panel
    Given the user is logged in as an admin
    When the user clicks on the admin panel link
    Then the user should be redirected to the admin panel page