Feature: Reset functionality on login page of Application				

Scenario Outline: Verification of reset button with numbers of credential

Given Open the Chrome and launch the application				

When Navigation to register page

And Enter the Name "<name>", LastName "<lastname>"	and Email "<email>"

Then Reset the credential						

Examples:                      		

| name 	| lastname  | email |  
| name1   | lastname1 |	lucas_v@teste.com | 
