Feature: Login Functionality

  @smoke
  Scenario: Successful Login

    Given User launches CURA website
    When User clicks Make Appointment
    And User enters valid username and password
    And User clicks Login button