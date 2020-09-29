Feature: Posting ATM Out of Scenario Transactions

  Scenario: To Not Perform HighTxnAmt Breach
    Given I login as supervisor to activate high amount rule for negative scenarios
    And The high amount rule is on for negative scenarios
    And Check the high amount rule is active or not for negative scenarios
    When I post out of scenario high amount transaction for negative scenarios
    And If i get response code as 000 for HighTxnAmt for negative scenarios
    Then I turn off the high amount rule for negative scenarios
    Then fdf
    Then I logout

  Scenario: To Not Perform HighCount Breach
    Given I login as supervisor to activate high count rule for negative scenarios
    And The high count rule is on for negative scenarios
    And Check the high count rule is active or not for negative scenarios
    When I post out of scenario 2 transactions for negative scenarios
    And If i get response code as 000 for HighCount for negative scenarios
    Then I turn off the high count rule for negative scenarios
    Then I logout

  Scenario: To Not Perform OddHour Breach
    Given I login as supervisor to activate odd hour rule for negative scenarios
    And The odd hour rule is on for negative scenarios
    And Check the odd hour rule is active or not for negative scenarios
    When I post out of scenario 2 odd hour transactions for negative scenarios
    And If i get response code as 000 for OddHour for negative scenarios
    Then I turn off the odd hour rule for negative scenarios
    Then I logout

  Scenario: To Not Perform BalanceEnquiry Breach
    Given I login as supervisor to activate balance enquiry rule for negative scenarios
    And The balance enquiry rule is on for negative scenarios
    And Check the balance enquiry rule is active or not for negative scenarios
    When I post out of scenario one balance enquiry transaction followed by withdrawal transaction for negative scenarios
    And If i get response code as 000 for BalanceEnquiry for negative scenarios
    Then I turn off the balance enquiry rule for negative scenarios
    Then I logout

  Scenario: To Not Perform PinChange Breach
    Given I login as supervisor to activate pin change rule for negative scenarios
    And The pin change rule is on for negative scenarios
    And Check the pin change rule is active or not for negative scenarios
    When I post out of scenario one pin change transaction followed by withdrawal transaction for negative scenarios
    And If i get response code as 000 for PinChange for negative scenarios
    Then I turn off the pin change rule for negative scenarios
    Then I logout

  Scenario: To Not Perform DailyLimit Breach
    Given I login as supervisor to activate daily limit rule for negative scenarios
    And The daily limit rule is on for negative scenarios
    And Check the daily limit rule is active or not for negative scenarios
    When I post out of scenario daily limit transaction for negative scenarios
    And If i get response code as 000 for DailyLimit for negative scenarios
    Then I turn off the daily limit rule for negative scenarios
    Then I logout

  Scenario: To Not Perform Chargeback Breach
    Given I login as supervisor to activate chargeback rule for negative scenarios
    And The chargeback rule is on for negative scenarios
    And Check the chargeback rule is active or not for negative scenarios
    When I post out of scenario withdrawal transaction from customer with chargeback and get response code as 000 for negative scenarios
    Then I turn off the chargeback rule for negative scenarios
    Then I logout

  Scenario: To Not Perform Unsuccessful Pin Change Count Breach
    Given I login as supervisor to activate unsucsseful pinchange count rule for negative scenarios
    And The pinchange count rule is on for negative scenarios
    And Check the unsuccessful pinchnge count rule is active or not for negative scenarios
    When I post out of scenario 2 pin change transactions followed by withdrawal transaction for negative scenarios
    And If i get response code as 000 for UnsuccessfulPinChangeCount for negative scenarios
    Then I turn off the unsuccessful pinchange count rule for negative scenarios
    Then I logout

  Scenario: To Not Perform Txn from inactive Customer Breach
    Given I login as supervisor to activate monthly txn rule for negative scenarios
    And The monthly txn rule is on for negative scenarios
    And Check the monthly txn rule is active or not for negative scenarios
    When I post out of scenario withdrawal transaction from inactive customer and get response code as 000 for negative scenarios
    Then I turn off the monthly txn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform MaxCount Breach
    Given I login as supervisor to activate max count rule for negative scenarios
    And The max count rule is on for negative scenarios
    And Check the max count rule is active or not for negative scenarios
    When I post out of scenario 7 withdrawal transactions for negative scenarios
    And If i get response code as 000 for MaxCount for negative scenarios
    Then I turn off the max count rule for negative scenarios
    Then I logout

  Scenario: To Not Perform BinCountTxn Breach
    Given I login as supervisor to activate bin count txn rule for negative scenarios
    And The txn count rule is on for negative scenarios
    And Check the bin count txn rule is active or not for negative scenarios
    When I post out of scenario with specific bin 7 withdrawal transaction for negative scenarios
    And If i get response code as 000 for BinCountTxn for negative scenarios
    Then I turn off the bin count txn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform MaxAmount Breach
    Given I login as supervisor to activate max amount rule for negative scenarios
    And The max amount rule is on for negative scenarios
    And Check the max amount rule is active or not for negative scenarios
    When I post out of scenario max amount transaction for negative scenarios
    And If i get response code as 000 for MaxAmount for negative scenarios
    Then I turn off the max amount rule for negative scenarios
    Then I logout


  Scenario: To Not Perform Txn with Specific Bin Breach
    Given I login as supervisor to activate bin txn rule for negative scenarios
    And The bin txn rule is on for negative scenarios
    And Check the bin txn rule is active or not for negative scenarios
    When I post out of scenario high amount with specific bin withdrawal transaction for negative scenarios
    And If i get response code as 000 for BinTxn for negative scenarios
    Then I turn off the bin txn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform HighRiskCustomer Breach
    Given I login to IFRM
    Given I login as supervisor to activate high risk customer rule for negative scenarios
    And The high risk rule is on for negative scenarios
    And Check the high risk customer rule is active or not for negative scenarios
    When I post out of scenario withdrawal transaction from High Risk Customer for negative scenarios
    And If i get response code as 000 for HighRiskCustomer for negative scenarios
    Then I turn off the high risk rule for negative scenarios
    Then I logout

  Scenario: To Not Perform ClonedCard Breach
    Given I login as supervisor to activate cloned card rule for negative scenarios
    And The cloned card rule is on for negative scenarios
    And Check the cloned card rule is active or not for negative scenarios
    When I post out of scenario 2 withdrawal transactions from different Terminal ID for negative scenarios
    And If i get response code as 000 for ClonedCard for negative scenarios
    Then I turn off the cloned card rule for negative scenarios
    Then I logout

  Scenario: To Not Perform TxnRange Breach
    Given I login as supervisor to activate txn range rule for negative scenarios
    And The txn range rule is on for negative scenarios
    And Check the txn range rule is active or not for negative scenarios
    When I post out of scenario multiple low amount transactions for negative scenarios
    And If i get response code as 000 for TxnRange for negative scenarios
    Then I turn off the txn range rule for negative scenarios
    Then I logout

  Scenario: To Not Perform LimitReset Breach
    Given I login as supervisor to activate limit reset rule for negative scenarios
    And The limit reset rule is on for negative scenarios
    And Check the limit reset rule is active or not for negative scenarios
    When I post out of scenario limit reset withdrawal transaction and get response code as 000 for negative scenarios
    Then I turn off the limit reset rule

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables