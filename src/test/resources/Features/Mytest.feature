Feature: Reset functionality on login page of Application				

Scenario Outline: Verification of reset button with numbers of credential

Given Open the Chrome and launch the application				

When Navigation to register page

And Enter the Name "<name>", LastName "<lastname>", Email "<email>", Phone "<phone>", Skills "<skills>", Country "<country>", Year "<year>", Month "<month>", Day "<day>" And Password "<password>"

Then Register new User		

Examples:                      		

| name 	| lastname  | email | phone | skills | country | year | month |day | password|
| name1   | lastname1 |	lucas_v@teste.com | 4190000131| Client Server | Aruba | 1995 | March | 6 | Pass1 |
