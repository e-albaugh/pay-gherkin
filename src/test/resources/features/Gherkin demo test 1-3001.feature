#Auto generated Octane revision tag
@TID3001REV0.3.0
@web
Feature: Gherkin demo test 1
	Scenario: Web Scenario 1
	    Given I have A
		"""
		large set of text to be passed
		"""
		When I add B
		Then I have A and B

	Scenario: Web Scenario 2
		Given I have A
		"""
		another large set of text
		"""
		Given I enter the following information
			|firstname  |lastname   |
			|Flynn      |Maven      |
			|Shahar     |MC         |
		Then I have A and B