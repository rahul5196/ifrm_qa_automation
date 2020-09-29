Feature: Posting ATM Transactions

  Scenario: Perform HighTxnAmt Breach
    Given I login as supervisor to activate high amount rule
    And The high amount rule is on
    And Check the high amount rule is active or not
    When I post high amount transaction
    And If i get response code as 202 for HighTxnAmt
    Then I turn off the high amount rule
    Then I logout

  Scenario: Perform HighCount Breach
    Given I login as supervisor to activate high count rule
    And The high count rule is on
    And Check the high count rule is active or not
    When I post 3 transactions
    And If i get response code as 202 for HighCount
    Then I turn off the high count rule
    Then I logout

  Scenario: Perform OddHour Breach
    Given I login as supervisor to activate odd hour rule
    And The odd hour rule is on
    And Check the odd hour rule is active or not
    When I post 2 odd hour transactions
    And If i get response code as 202 for OddHour
    Then I turn off the odd hour rule
    Then I logout

  Scenario: Perform BalanceEnquiry Breach
    Given I login as supervisor to activate balance enquiry rule
    And The balance enquiry rule is on
    And Check the balance enquiry rule is active or not
    When I post one balance enquiry transaction followed by withdrawal transaction
    And If i get response code as 202 for BalanceEnquiry
    Then I turn off the balance enquiry rule
    Then I logout

  Scenario: Perform PinChange Breach
    Given I login as supervisor to activate pin change rule
    And The pin change rule is on
    And Check the pin change rule is active or not
    When I post one pin change transaction followed by withdrawal transaction
    And If i get response code as 202 for PinChange
    Then I turn off the pin change rule
    Then I logout

  Scenario: Perform DailyLimit Breach
    Given I login as supervisor to activate daily limit rule
    And The daily limit rule is on
    And Check the daily limit rule is active or not
    When I post daily limit transaction
    And If i get response code as 202 for DailyLimit
    Then I turn off the daily limit rule
    Then I logout

  Scenario: Perform Chargeback Breach
    Given I login as supervisor to activate chargeback rule
    And The chargeback rule is on
    And Check the chargeback rule is active or not
    When I post a withdrawal transaction from customer with chargeback and get response code as 202
    Then I turn off the chargeback rule
    Then I logout

  Scenario: Perform LimitReset Breach
    Given I login as supervisor to activate limit reset rule
    And The limit reset rule is on
    And Check the limit reset rule is active or not
    When I post a limit reset withdrawal transaction and get response code as 202
    Then I turn off the limit reset rule
    Then I logout

  Scenario: Perform MaxCount Breach
    Given I login as supervisor to activate max count rule
    And The max count rule is on
    And Check the max count rule is active or not
    When I post 8 withdrawal transactions
    And If i get response code as 202 for MaxCount
    Then I turn off the max count rule
    Then I logout

  Scenario: Perform BinCountTxn Breach
    Given I login as supervisor to activate bin count txn rule
    And The txn count rule is on
    And Check the bin count txn rule is active or not
    When I post with specific bin 8 withdrawal transaction
    And If i get response code as 202 for BinCountTxn
    Then I turn off the bin count txn rule
    Then I logout

  Scenario: Perform MaxAmount Breach
    Given I login as supervisor to activate max amount rule
    And The max amount rule is on
    And Check the max amount rule is active or not
    When I post max amount transaction
    And If i get response code as 202 for MaxAmount
    Then I turn off the max amount rule
    Then I logout

  Scenario: Perform Txn with Specific Bin Breach
    Given I login as supervisor to activate bin txn rule
    And The bin txn rule is on
    And Check the bin txn rule is active or not
    When I post high amount with specific bin withdrawal transaction
    And If i get response code as 202 for BinTxn
    Then I turn off the bin txn rule
    Then I logout

  Scenario: Perform HighRiskCustomer Breach
    Given I login as supervisor to activate high risk customer rule
    And The high risk rule is on
    And Check the high risk customer rule is active or not
    When I post a withdrawal transaction from High Risk Customer
    And If i get response code as 202 for HighRiskCustomer
    Then I turn off the high risk rule
    Then I logout

  Scenario: Perform ClonedCard Breach
    Given I login as supervisor to activate cloned card rule
    And The cloned card rule is on
    And Check the cloned card rule is active or not
    When I post 2 withdrawal transactions from different Terminal ID
    And If i get response code as 202 for ClonedCard
    Then I turn off the cloned card rule
    Then I logout

  Scenario: Perform TxnRange Breach
    Given I login as supervisor to activate txn range rule
    And The txn range rule is on
    And Check the txn range rule is active or not
    When I post multiple low amount transactions
    And If i get response code as 202 for TxnRange
    Then I turn off the txn range rule
    Then I logout

  Scenario: Perform Txn from inactive Customer Breach
    Given I login as supervisor to activate monthly txn rule
    And The monthly txn rule is on
    And Check the monthly txn rule is active or not
    When I post a withdrawal transaction from inactive customer and get response code as 202
    Then I turn off the monthly txn rule
    Then I logout

  Scenario: Perform Unsuccessful Pin Change Count Breach
    Given I login as supervisor to activate unsucsseful pinchange count rule
    And The pinchange count rule is on
    And Check the unsuccessful pinchnge count rule is active or not
    When I post 2 pin change transactions followed by withdrawal transaction
    And If i get response code as 202 for UnsuccessfulPinChangeCount
    Then I turn off the unsuccessful pinchange count rule
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables