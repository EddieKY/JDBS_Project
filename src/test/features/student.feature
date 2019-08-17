Feature: JDBC training
  @student
  Scenario: JDBC creatinggg knowledge

    Given Student on the CybertekTrainingg page
    And Student adds new student page
    And Student fills all the required information and saves it
    And Verify if student is in UI
    Then Verify is user is in our database
