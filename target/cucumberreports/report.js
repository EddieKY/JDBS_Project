$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/Student2.feature");
formatter.feature({
  "name": "Validating creat and delete student",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "creat and delete student",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@student2"
    }
  ]
});
formatter.step({
  "name": "Student is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "Student2_steps.student_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student clicks on Students module and Adds student",
  "keyword": "When "
});
formatter.match({
  "location": "Student2_steps.student_clicks_on_Students_module_and_Adds_student()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student fill up details information and click on submit",
  "keyword": "And "
});
formatter.match({
  "location": "Student2_steps.student_fill_up_details_information_and_click_on_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate if student is in UI",
  "keyword": "And "
});
formatter.match({
  "location": "Student2_steps.validate_if_student_is_in_UI()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student verification in UI and database",
  "keyword": "Then "
});
formatter.match({
  "location": "Student2_steps.student_verification_in_UI_and_database()"
});
formatter.result({
  "status": "passed"
});
});