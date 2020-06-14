@login
Feature: login


Scenario Outline: login with valid email and password
Given user is on login page
When user enters valid "<email>" and "<password>"
Then user is able to login successfully
  Examples:
  | email | password |
  |nrshkhunt123@gmail.com |Hello123      |
  |bakkd@yahoo.com    |jllhlhlha      |