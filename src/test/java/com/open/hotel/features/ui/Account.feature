
Feature: login hotel application

  @CreateAccount
  Scenario: 101:Create Account with Mandatory Fields
    Given Open Browser
    Given User is able Launch the Salesforce application
    When User enters the "hariprasadv.1807@gmail.com" and "ykEoEDuAKrEhYqSokSqUEQ==" and Click LogIn button
    Then Click App Launcher
    Then Click Account Menu
    Then Create New Account with Mandatory

  @CreateAccount
  Scenario: 102:Create Account with All Fields
    Given Open Browser
    Given User is able Launch the Salesforce application
    When User enters the "hariprasadv.1807@gmail.com" and "ykEoEDuAKrEhYqSokSqUEQ==" and Click LogIn button
    Then Click App Launcher
    Then Click Account Menu
    Then Create New Account with All Fields
