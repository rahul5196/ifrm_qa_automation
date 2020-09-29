Feature: Posting POS Transactions

  Scenario: Perform CDGMccTxn Breach
    Given I login as supervisor to activate CDGMccTxn rule
    And The CDGMccTxn rule is on
    And Check the CDGMccTxn rule is active or not
    When I post transaction from gaming or dating or casino mcc and get response code as 202 for CDGMccTxn
    Then I turn off the CDGMccTxn rule
    Then I logout

  Scenario: Perform OddHour Breach
    Given I login as supervisor to activate odd hour rule for pos
    And The odd hour rule is on for pos
    And Check the odd hour rule is active or not for pos
    When I post 2 odd hour transactions for pos
    And If i get response code as 202 for OddHour for pos
    Then I turn off the odd hour rule for pos
    Then I logout

  Scenario: Perform EndingWith99Txn Breach
    Given I login as supervisor to activate EndingWith99Txn rule
    And The EndingWith99Txn rule is on
    And Check the EndingWith99Txn rule is active or not
    When I post transactions ending with 99
    And If i get response code as 202 for EndingWith99Txn
    Then I turn off the EndingWith99Txn rule
    Then I logout

  Scenario: Perform DuplicateTxn Breach
    Given I login as supervisor to activate DuplicateTxn rule
    And The DuplicateTxn rule is on
    And Check the DuplicateTxn rule is active or not
    When I post duplicate transactions
    And If i get response code as 202 for DuplicateTxn
    Then I turn off the DuplicateTxn rule
    Then I logout

  Scenario: Perform MaxMcc Breach
    Given I login as supervisor to activate MaxMcc rule
    And The MaxMcc rule is on
    And Check the MaxMcc rule is active or not
    When I post transactions from different mcc
    And If i get response code as 202 for MaxMcc
    Then I turn off the MaxMcc rule
    Then I logout

  Scenario: Perform PosEntryModeTxn Breach
    Given I login as supervisor to activate PosEntryModeTxn rule
    And The PosEntryModeTxn rule is on
    And Check the PosEntryModeTxn rule is active or not
    When I post transactions from the particular pos entry mode
    And If i get response code as 202 for PosEntryModeTxn
    Then I turn off the PosEntryModeTxn rule
    Then I logout

  Scenario: Perform NewMcc Breach
    Given I login as supervisor to activate NewMcc rule
    And The NewMcc rule is on
    And Check the NewMcc rule is active or not
    When I post transactions from new mcc and get response code as 202
    Then I turn off the NewMcc rule
    Then I logout

  Scenario: Perform HighAmtTxn Breach
    Given I login as supervisor to activate HighAmtTxn rule for pos
    And The HighAmtTxn rule is on for pos
    And Check the HighAmtTxn rule is active or not for pos
    When I post high amount transaction for pos
    And If i get response code as 202 for HighAmtTxn for pos
    Then I turn off the HighAmtTxn  for pos
    Then I logout

  Scenario: Perform HighCountTxn Breach
    Given I login as supervisor to activate HighCountTxn rule for pos
    And The HighCountTxn rule is on for pos
    And Check the HighCountTxn rule is active or not for pos
    When I post 8 transaction for pos
    And If i get response code as 202 for HighCountTxn for pos
    Then I turn off the HighCountTxn  for pos
    Then I logout

  Scenario: Perform LowAmtMcc Breach
    Given I login as supervisor to activate LowAmtMcc rule
    And The LowAmtMcc rule is on
    And Check the LowAmtMcc rule is active or not
    When I post low amount transaction from particular mcc
    And If i get response code as 202 for LowAmtMcc
    Then I turn off the LowAmtMcc
    Then I logout

  Scenario: Perform HighCount Breach
    Given I login as supervisor to activate HighCount rule for pos
    And The HighCount rule is on for pos
    And Check the HighCount rule is active or not for pos
    When I post high count transaction for pos
    And If i get response code as 202 for HighCount for pos
    Then I turn off the HighCount  for pos
    Then I logout


  Scenario: Perform HighAmtMcc Breach
    Given I login as supervisor to activate HighAmtMcc rule
    And The HighAmtMcc rule is on
    And Check the HighAmtMcc rule is active or not
    When I post high amount mcc transaction
    And If i get response code as 202 for HighAmtMcc
    Then I turn off the HighAmtMcc
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables