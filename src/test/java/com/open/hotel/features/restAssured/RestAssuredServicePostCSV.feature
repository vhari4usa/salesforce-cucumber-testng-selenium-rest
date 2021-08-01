
Feature: Create the user in a gorest api site

  @RestAssuredServicePostCSV
  Scenario: 101:Read data from csv and create JSON request and send request and get response and validate it
    Given Customer "GoRest" read the data from CSV "CreateUser.csv" from test case id "tc02" and create the JSON request using JSON request template "goRest_CreateUser_Template"
    When Using Rest Assured I submit the JSON "POST" request with end point "/users/"
    When I validate "krishna94" from "name" node in JSON response - JSON path "data.name"
    When I validate "Male" from "gender" node in JSON response - JSON path "data.gender"
    When I validate "krishna94@gmail.com" from "email" node in JSON response - JSON path "data.email"
    When I validate "Active" from "status" node in JSON response - JSON path "data.status"
