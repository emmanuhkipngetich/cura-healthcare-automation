Feature: Appointment Booking

  Background:

    Given User launches CURA website
    When User clicks Make Appointment
    And User enters valid username and password
    And User clicks Login button

  @smoke
  Scenario: Book appointment using Medicare

    And User selects Tokyo CURA Healthcare Center
    And User selects Medicare program
    And User enters visit date
    And User enters appointment comment
    And User books the appointment
    Then Appointment should be confirmed