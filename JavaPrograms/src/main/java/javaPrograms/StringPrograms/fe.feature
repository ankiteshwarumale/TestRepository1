@APPLICATIONAVERAGE-FEATURE
Feature: Add Application Averages widgets

  Background: 
    Given Open the browser and Login to the cat application with valid credentials
    Given Summary view page should be displayed

  @ApplicationAverages-Addwidget
  Scenario: Add the Application Averages widget with Group By Application
    When Click on Add Widget icon then Select the Productive Tab and Select the Application Averages
    And Configure the Averages widget with equipments and Group by "Application"
    Then Widget should be added and table should be displayed for Averages
    And Averages table should have the data "AAGroupByApplication"
    And Get Application Averages CCDS response
    Then Averages CCDS response should match the values rendered in UI