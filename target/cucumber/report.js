$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/ColorChange.feature");
formatter.feature({
  "line": 2,
  "name": "Validating Background Set Color",
  "description": "",
  "id": "validating-background-set-color",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "duration": 2664041800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to set sky blue background",
  "description": "",
  "id": "validating-background-set-color;user-should-be-able-to-set-sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Set SkyBlue Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefinition.set_skyBlue_background_button_exists()"
});
formatter.result({
  "duration": 1204186200,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.i_click_on_the_button()"
});
formatter.result({
  "duration": 2103131400,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 28076700,
  "status": "passed"
});
formatter.after({
  "duration": 749947600,
  "status": "passed"
});
formatter.before({
  "duration": 1496739200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should be able to set sky background",
  "description": "",
  "id": "validating-background-set-color;user-should-be-able-to-set-sky-background",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Set SkyWhite Background button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I click on the Set White Background button",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorStepDefinition.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 1466313300,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.i_click_on_the_set_white_background_button()"
});
formatter.result({
  "duration": 4186556000,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorStepDefinition.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 13021400,
  "status": "passed"
});
formatter.after({
  "duration": 3076344100,
  "status": "passed"
});
});