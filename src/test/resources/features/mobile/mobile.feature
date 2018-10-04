@mobile
Feature: mobile feature stuff
    This is where you can put in an indepth description the feature

	Background:
	    # Background give you a common set of steps that need to be done
	    # in order for the scenarios to work.  I makes for easier reading
	    # as you won't be repeating these steps in each of the scenarios
		Given application is open

	@ignore
	Scenario: Mobile Scenario 1
        """
        You can also add a description to a scenario, like what is done here
        Make sure you put in 3 " in a row so it will be interpreted as a docstring
        """

		Given I have A
		"""
		Stuff for mobile
		"""
		# You can also use data tables to pass data to the step.
		# Example would be entering the following in to a spreadsheet.
		# This is a similar concept of a scenario outline that uses the example table
		Given I enter the following information
			|firstname  |lastname   |
			|Steve      |Jobs       |
   			|Flynn      |Maven      |
   			|Shahar     |MC         |
		# you can provide comments to a step in a scenario as well, like:
		# Then we need to verify both A and B are avaialble
		Then I have A and B

	@slow @fast
	Scenario: Mobile scenario 2
	    Given I have A and B
		Then I have A and B

	@ignore @slow
	Scenario: Mobile scenario 3
		Given I have A
		"""
		text for Mobile scenario 3
		"""
		Then I have A and B

	@fast
	Scenario: Mobile scenario 4
		Given I have A
		"""
		text for Mobile scenario 4
		"""
		Then I have A and B