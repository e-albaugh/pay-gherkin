#Auto generated Octane revision tag
@TID6001REV0.2.0
@web
Feature: Site-Wide Promotions
	Scenario Outline: Promotion search
		Given the browser is in the search bar
		When the user searches for "<promotion>"
		Then "<promotion>" related content is displayed
		
		Examples:
		|promotion|
		|delivery|
		|mouse|
		|covid|
         
  Scenario: Promotion visibility
		Given the user is in the site 
		When  the user navigates to any screen 
		Then  the user can still see the promotion on the top banner
