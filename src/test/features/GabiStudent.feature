Feature: Creating, validating and deleting data in Student DB

  @g
  Scenario: Validating data in DB
    Given Student on the CybertekTrainingg page
    And Student adds new student on CybertekTraining page
    And Student fills all the required information and saves it on Cybertek page
    And Verify if student is in UI of Cybertek page
    Then Verify is user is in our Cybertek database
