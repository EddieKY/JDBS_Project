Feature: Validating creat and delete student
  @student2
  Scenario: creat and delete student
    Given Student is on Home Page
    When Student clicks on Students module and Adds student
    And Student fill up details information and click on submit
    And Validate if student is in UI
    Then Student verification in UI and database
