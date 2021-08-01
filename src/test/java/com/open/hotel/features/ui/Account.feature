
Feature: login hotel application

  @CreateAccount
  Scenario: 101:login to the hotel application
    Given Open Browser
    Given User is able Launch the hotel application
    When User enters the "hariprasadv.1807@gmail.com" and "ykEoEDuAKrEhYqSokSqUEQ==" and Click LogIn button
    Then Click App Launcher
    Then Click Account Menu
    Then Create New Account

