$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/features/Teacher.feature");
formatter.feature({
  "name": "Teacher adding feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "Example",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@teacher"
    }
  ]
});
formatter.step({
  "name": "User is on Cybertektraining page",
  "keyword": "Given "
});
formatter.match({
  "location": "AddTeacher_steps.user_is_on_Cybertektraining_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User starts add new Teacher/Student profile",
  "keyword": "When "
});
formatter.match({
  "location": "AddTeacher_steps.user_starts_add_new_Teacher_Student_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User starts to fill Teacher/Student information",
  "keyword": "And "
});
formatter.match({
  "location": "AddTeacher_steps.user_starts_to_fill_Teacher_Student_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User sees created profile",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTeacher_steps.user_sees_created_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User validates UI and DataBase",
  "keyword": "Then "
});
formatter.match({
  "location": "AddTeacher_steps.user_validates_UI_and_DataBase()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User deletes profile",
  "keyword": "And "
});
formatter.match({
  "location": "AddTeacher_steps.user_deletes_profile()"
});
formatter.result({
  "status": "passed"
});
});