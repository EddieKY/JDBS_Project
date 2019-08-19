$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/GabiStudent.feature");
formatter.feature({
  "name": "END to END verification of DB",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Creating, validating and deleting data in Student DB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@g"
    }
  ]
});
formatter.step({
  "name": "Student on the CybertekTrainingg page",
  "keyword": "Given "
});
formatter.step({
  "name": "Student adds new student on CybertekTraining page",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add first name \"\u003cfirst name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add last name \"\u003clast name\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add \"\u003cemail\u003e\" and joining date",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add subject \"\u003csubject\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add phone number \"\u003cmobile Phone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add gender and \"\u003cadmision number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add birthDate and \"\u003cmajor\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add batch and section \"\u003csection\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add adress \"\u003cadress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Student should add Company Information",
  "keyword": "And "
});
formatter.step({
  "name": "Student submits application",
  "keyword": "When "
});
formatter.step({
  "name": "Verify if student \"\u003cfirst name\u003e\" is in UI of Cybertek page",
  "keyword": "Then "
});
formatter.step({
  "name": "Match firstName \"\u003cfirst name\u003e\", lastName \"\u003clast name\u003e\", subject \"\u003csubject\u003e\", admisionNo \"\u003cadmision number\u003e\" and  major \"\u003cmajor\u003e\" with DB",
  "keyword": "When "
});
formatter.step({
  "name": "After verification, Student delete profile by first name \"\u003cfirst name\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "first name",
        "last name",
        "email",
        "subject",
        "mobile Phone",
        "admision number",
        "major",
        "section",
        "adress"
      ]
    },
    {
      "cells": [
        "JohnyY",
        "Doe",
        "johndoe@yahoo.com",
        "fotball",
        "551",
        "123",
        "Sport",
        "3",
        "123 main street"
      ]
    },
    {
      "cells": [
        "Gogu",
        "Stanescu",
        "gogu@gmail.com",
        "anysubject",
        "456",
        "321",
        "Actor",
        "9",
        "147 minor ave."
      ]
    }
  ]
});
formatter.scenario({
  "name": "Creating, validating and deleting data in Student DB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@g"
    }
  ]
});
formatter.step({
  "name": "Student on the CybertekTrainingg page",
  "keyword": "Given "
});
formatter.match({
  "location": "student_steps.student_on_the_CybertekTrainingg_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student adds new student on CybertekTraining page",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_adds_new_student_on_CybertekTraining_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add first name \"JohnyY\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_first_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add last name \"Doe\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add \"johndoe@yahoo.com\" and joining date",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_and_joining_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add subject \"fotball\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_subject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add phone number \"551\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add gender and \"123\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_gender_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add birthDate and \"Sport\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_birthDate_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add batch and section \"3\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_batch_and_section(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add adress \"123 main street\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_adress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add Company Information",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_Company_Information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student submits application",
  "keyword": "When "
});
formatter.match({
  "location": "GabiStudent_steps.student_submits_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if student \"JohnyY\" is in UI of Cybertek page",
  "keyword": "Then "
});
formatter.match({
  "location": "GabiStudent_steps.verify_if_student_is_in_UI_of_Cybertek_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Match firstName \"JohnyY\", lastName \"Doe\", subject \"fotball\", admisionNo \"123\" and  major \"Sport\" with DB",
  "keyword": "When "
});
formatter.match({
  "location": "GabiStudent_steps.match_firstName_lastName_subject_admisionNo_and_major_with_DB(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After verification, Student delete profile by first name \"JohnyY\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GabiStudent_steps.after_verification_Student_delete_profile_by_first_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating, validating and deleting data in Student DB",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@g"
    }
  ]
});
formatter.step({
  "name": "Student on the CybertekTrainingg page",
  "keyword": "Given "
});
formatter.match({
  "location": "student_steps.student_on_the_CybertekTrainingg_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student adds new student on CybertekTraining page",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_adds_new_student_on_CybertekTraining_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add first name \"Gogu\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_first_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add last name \"Stanescu\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add \"gogu@gmail.com\" and joining date",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_and_joining_date(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add subject \"anysubject\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_subject(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add phone number \"456\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_phone_number(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add gender and \"321\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_gender_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add birthDate and \"Actor\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_birthDate_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add batch and section \"9\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_batch_and_section(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add adress \"147 minor ave.\"",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_adress(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student should add Company Information",
  "keyword": "And "
});
formatter.match({
  "location": "GabiStudent_steps.student_should_add_Company_Information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student submits application",
  "keyword": "When "
});
formatter.match({
  "location": "GabiStudent_steps.student_submits_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if student \"Gogu\" is in UI of Cybertek page",
  "keyword": "Then "
});
formatter.match({
  "location": "GabiStudent_steps.verify_if_student_is_in_UI_of_Cybertek_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Match firstName \"Gogu\", lastName \"Stanescu\", subject \"anysubject\", admisionNo \"321\" and  major \"Actor\" with DB",
  "keyword": "When "
});
formatter.match({
  "location": "GabiStudent_steps.match_firstName_lastName_subject_admisionNo_and_major_with_DB(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After verification, Student delete profile by first name \"Gogu\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GabiStudent_steps.after_verification_Student_delete_profile_by_first_name(String)"
});
formatter.result({
  "status": "passed"
});
});