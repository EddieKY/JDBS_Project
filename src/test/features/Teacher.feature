@smoke
Feature: Teacher adding feature
         #Student adding feature

  @teacher
  #@student
  Scenario: Example
    Given User is on Cybertektraining page
    When User starts add new Teacher/Student profile
    And User starts to fill Teacher/Student information
    Then User sees created profile
    Then User validates UI and DataBase
    And User deletes profile