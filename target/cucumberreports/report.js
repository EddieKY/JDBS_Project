$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/student.feature");
formatter.feature({
  "name": "JDBC training",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "JDBC creatinggg knowledge",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@student"
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
  "name": "Student adds new student page",
  "keyword": "And "
});
formatter.match({
  "location": "student_steps.student_adds_new_student_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Student fills all the required information and saves it",
  "keyword": "And "
});
formatter.match({
  "location": "student_steps.student_fills_all_the_required_information_and_saves_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify if student is in system",
  "keyword": "Then "
});
formatter.match({
  "location": "student_steps.verify_if_student_is_in_system()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\n\tat utilities.DBUtility.executeSQLquery(DBUtility.java:32)\n\tat steps.student_steps.verify_if_student_is_in_system(student_steps.java:79)\n\tat ✽.Verify if student is in system(src/test/features/student.feature:8)\n",
  "status": "failed"
});
});