$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/GabiStudent.feature");
formatter.feature({
  "name": "Creating, validating and deleting data in Student DB",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validating data in DB",
  "description": "",
  "keyword": "Scenario",
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
  "location": "student_steps.student_adds_new_student_on_CybertekTraining_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student fills all the required information and saves it on Cybertek page",
  "keyword": "And "
});
formatter.match({
  "location": "student_steps.student_fills_all_the_required_information_and_saves_it_on_Cybertek_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if student is in UI of Cybertek page",
  "keyword": "And "
});
formatter.match({
  "location": "student_steps.verify_if_student_is_in_UI_of_Cybertek_page()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.student_steps.verify_if_student_is_in_UI_of_Cybertek_page(student_steps.java:139)\r\n\tat ✽.Verify if student is in UI of Cybertek page(src/test/features/GabiStudent.feature:8)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "Verify is user is in our Cybertek database",
  "keyword": "Then "
});
formatter.match({
  "location": "student_steps.verify_is_user_is_in_our_Cybertek_database()"
});
formatter.result({
  "status": "skipped"
});
});