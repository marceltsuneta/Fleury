$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/marce/eclipse-workspace/UnidadesFleury/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Fleury Login Feature",
  "description": "",
  "id": "fleury-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Fleury Login Test Scenario",
  "description": "",
  "id": "fleury-login-feature;fleury-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on Unidade",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user choose the facility",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user selects an unit",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the unit name is the same selected",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.given()"
});
formatter.result({
  "duration": 14763309700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.when()"
});
formatter.result({
  "duration": 192149700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_choose_the_facility()"
});
formatter.result({
  "duration": 4342242001,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_selects_an_unit()"
});
formatter.result({
  "duration": 241738001,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.unit_same_selected()"
});
formatter.result({
  "duration": 1747663600,
  "status": "passed"
});
});