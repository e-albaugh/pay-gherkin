@mobile
Feature: mobile feature stuff
	@ignore
	Scenario: Mobile Scenario 1
		Given I have A
		"""
		Stuff for mobile
		"""
		Given I enter the following information
			|firstname |lastname|
			|Steve        |Jobs     |
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