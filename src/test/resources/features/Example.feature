Feature: Sign In
  @Noe
  Scenario Outline: User Sign In
    Given I have a web browser installed and internet connection
    When I open the page
    And I click on the "Signin" button of the main page
    And I enter the "<username>" and "<password>"
    And I click on the "Signin" button to login
    Then the screen should display the validation message "<validation_message>"

    Examples:
      | username | password | validation_message               |
      | username | password | Success                          |
      |          | password | Login and/or password are wrong. |
      | username |          | Login and/or password are wrong. |
      |          |          | Login and/or password are wrong. |
