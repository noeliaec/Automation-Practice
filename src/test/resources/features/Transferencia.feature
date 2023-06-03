Feature: Transferencias


  Background:
    Given I have a web browser installed and internet connection
    When I open the page
    And I click on the "Signin" button of the main page
    And I enter the "username" and "password"
    And I click on the "Signin" button to login in the web

  @Transferencia
  Scenario Outline: Successfully Transfer Funds
    And I click on the "Transfer Funds" tab
    #And I click on "From Account"
    And I select the option "<from_account>" from the first dropdown menu
    #And I click on "To Account"
    And I select the option "<to_account>" from the second dropdown menu
    And I click on "Amount"
    And I enter an "3000" amount in the blank field
    And I click on "Submit"
    And I click on "Submit"
    Then the screen should display the validation message "You successfully submitted your transaction."

    Examples:
      | from_account                     | to_account                           |
      #| Savings(Avail. balance = $ 1000) | Savings(Avail. balance = $ 1000)     |
      | Savings(Avail. balance = $ 1000) | Checking(Avail. balance = $ -500.2)  |
      #| Savings(Avail. balance = $ 1000) | Savings(Avail. balance = $ 1548)     |
      #| Savings(Avail. balance = $ 1000) | Loan(Avail. balance = $ 780)         |
      #| Savings(Avail. balance = $ 1000) | Credit Card(Avail. balance = $ -265) |
      #| Savings(Avail. balance = $ 1000) | Brokerage(Avail. balance = $ 197)    |

  #Scenario: Transfer Funds without entering an amount in the Amount field
    #And I click on the "Transfer Funds" tab
    #And I click on "From Account"
    #And I select the option Savings(Avail. balance = $ 1000) from the dropdown menu
    #And I click on "To Account"
    #And I select the option Brokerage(Avail. balance = $ 197) from the dropdown menu
    #And I click on "Submit"
    #And I click on "Submit"
    #Then the screen should display the validation message "Complete this field."


