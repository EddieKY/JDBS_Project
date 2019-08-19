Feature: END to END verification of DB

  @g
  Scenario Outline: Creating, validating and deleting data in Student DB
    Given Student on the CybertekTrainingg page
    And Student adds new student on CybertekTraining page
    And Student should add first name "<first name>"
    And Student should add last name "<last name>"
    And Student should add "<email>" and joining date
    And Student should add subject "<subject>"
    And Student should add phone number "<mobile Phone>"
    And Student should add gender and "<admision number>"
    And Student should add birthDate and "<major>"
    And Student should add batch and section "<section>"
    And Student should add adress "<adress>"
    And Student should add Company Information
    When Student submits application
    Then Verify if student "<first name>" is in UI of Cybertek page
    When Match firstName "<first name>", lastName "<last name>", subject "<subject>", admisionNo "<admision number>" and  major "<major>" with DB
    Then After verification, Student delete profile by first name "<first name>"


Examples:
    |first name   |last name  |email                |subject    |mobile Phone    |admision number  |major    |section    |adress         |
    |JohnyY       |Doe        |johndoe@yahoo.com    |fotball    |551             |123              |Sport    |3          |123 main street|
    |Gogu         |Stanescu   |gogu@gmail.com       |anysubject |456             |321              |Actor    |9          |147 minor ave. |

