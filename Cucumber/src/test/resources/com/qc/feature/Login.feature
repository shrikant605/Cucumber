Feature: queue codes login page test cases

Scenario: To valid queue codes dashboard page if user enter valid credentials
Given to enter valid userName "queuecodes@gmail.com"
And to enter valid password "123456"
When to click on sign in button
Then to validate the dashboard page title "Queue Codes | Dashboard"