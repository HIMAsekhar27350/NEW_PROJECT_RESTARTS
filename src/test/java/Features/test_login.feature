Feature: Test the login page using the username and password

  Scenario: login with username and password
    Given opening the chrome brower
    When Entering the username and password
    And clicking the login button
    Then closeing the brower
