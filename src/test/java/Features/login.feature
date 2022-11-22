Feature: Test login functionality

  Scenario Outline: Test with valid username and password
    Given the User is at Login Page
    When User Enter "<UserName>" , "<Password>"
    And Click on Login Button
    Then user Logged in Successfully

    Examples:
      | UserName | Password |
      | Admin    | admin123 |
