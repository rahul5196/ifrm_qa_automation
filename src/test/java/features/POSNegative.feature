Feature: Posting Out of Scenario POS Transactions


  Scenario: To Not Perform OddHour Breach
    Given I login as supervisor to activate odd hour rule for pos for negative scenarios
    And The odd hour rule is on for pos for negative scenarios
    And Check the odd hour rule is active or not for pos for negative scenarios
    When I post 2 odd hour transactions for pos for negative scenarios
    And If i get response code as 202 for OddHour for pos for negative scenarios
    Then I turn off the odd hour rule for pos for negative scenarios
    Then I logout

  Scenario: To Not Perform EndingWith99Txn Breach
    Given I login as supervisor to activate EndingWith99Txn rule for negative scenarios
    And The EndingWith99Txn rule is on for negative scenarios
    And Check the EndingWith99Txn rule is active or not for negative scenarios
    When I post transactions ending with 99 for negative scenarios
    And If i get response code as 202 for EndingWith99Txn for negative scenarios
    Then I turn off the EndingWith99Txn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform DuplicateTxn Breach
    Given I login as supervisor to activate DuplicateTxn rule for negative scenarios
    And The DuplicateTxn rule is on for negative scenarios
    And Check the DuplicateTxn rule is active or not for negative scenarios
    When I post duplicate transactions for negative scenarios
    And If i get response code as 202 for DuplicateTxn for negative scenarios
    Then I turn off the DuplicateTxn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform MaxMcc Breach
    Given I login as supervisor to activate MaxMcc rule for negative scenarios
    And The MaxMcc rule is on for negative scenarios
    And Check the MaxMcc rule is active or not for negative scenarios
    When I post transactions from different mcc for negative scenarios
    And If i get response code as 202 for MaxMcc for negative scenarios
    Then I turn off the MaxMcc rule for negative scenarios
    Then I logout

  Scenario: To Not Perform PosEntryModeTxn Breach
    Given I login as supervisor to activate PosEntryModeTxn rule for negative scenarios
    And The PosEntryModeTxn rule is on for negative scenarios
    And Check the PosEntryModeTxn rule is active or not for negative scenarios
    When I post transactions from the particular pos entry mode for negative scenarios
    And If i get response code as 202 for PosEntryModeTxn for negative scenarios
    Then I turn off the PosEntryModeTxn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform HighAmtTxn Breach
    Given I login as supervisor to activate HighAmtTxn rule for pos for negative scenarios
    And The HighAmtTxn rule is on for pos for negative scenarios
    And Check the HighAmtTxn rule is active or not for pos for negative scenarios
    When I post high amount transaction for pos for negative scenarios
    And If i get response code as 202 for HighAmtTxn for pos for negative scenarios
    Then I turn off the HighAmtTxn  for pos for negative scenarios
    Then I logout

  Scenario: Perform HighCountTxn Breach
    Given I login as supervisor to activate HighCountTxn rule for pos for negative scenarios
    And The HighCountTxn rule is on for pos for negative scenarios
    And Check the HighCountTxn rule is active or not for pos for negative scenarios
    When I post 8 transaction for pos for negative scenarios
    And If i get response code as 202 for HighCountTxn for pos for negative scenarios
    Then I turn off the HighCountTxn  for pos for negative scenarios
    Then I logout

  Scenario: To Not Perform LowAmtMcc Breach
    Given I login as supervisor to activate LowAmtMcc rule for negative scenarios
    And The LowAmtMcc rule is on for negative scenarios
    And Check the LowAmtMcc rule is active or not for negative scenarios
    When I post low amount transaction from particular mcc for negative scenarios
    And If i get response code as 202 for LowAmtMcc for negative scenarios
    Then I turn off the LowAmtMcc for negative scenarios
    Then I logout

  Scenario: To Not Perform HighCount Breach
    Given I login as supervisor to activate HighCount rule for pos for negative scenarios
    And The HighCount rule is on for pos for negative scenarios
    And Check the HighCount rule is active or not for pos for negative scenarios
    When I post high count transaction for pos for negative scenarios
    And If i get response code as 202 for HighCount for pos for negative scenarios
    Then I turn off the HighCount  for pos for negative scenarios
    Then I logout

  Scenario: To Not Perform HourMcc Breach
    Given I login as supervisor to activate HourMcc rule for negative scenarios
    And The HourMcc rule is on for negative scenarios
    And Check the HourMcc rule is active or not for negative scenarios
    When I post a transaction from particular mcc for negative scenarios
    And If i get response code as 202 for HourMcc for negative scenarios
    Then I turn off the HourMcc for negative scenarios
    Then I logout

  Scenario: To Not Perform NewMcc Breach
    Given I login as supervisor to activate NewMcc rule for negative scenarios
    And The NewMcc rule is on for negative scenarios
    And Check the NewMcc rule is active or not for negative scenarios
    When I post transactions from new mcc and get response code as 202 for negative scenarios
    Then I turn off the NewMcc rule for negative scenarios
    Then I logout

  Scenario: To Not Perform HighAmtMcc Breach
    Given I login as supervisor to activate HighAmtMcc rule for negative scenarios
    And The HighAmtMcc rule is on for negative scenarios
    And Check the HighAmtMcc rule is active or not for negative scenarios
    When I post high amount mcc transaction for negative scenarios
    And If i get response code as 202 for HighAmtMcc for negative scenarios
    Then I turn off the HighAmtMcc for negative scenarios
    Then I logout

  Scenario: To Not Perform CDGMccTxn Breach
    Given I login as supervisor to activate CDGMccTxn rule for negative scenarios
    And The CDGMccTxn rule is on for negative scenarios
    And Check the CDGMccTxn rule is active or not for negative scenarios
    When I post transaction from gaming or dating or casino mcc for negative scenarios
    And If i get response code as 202 for CDGMccTxn for negative scenarios
    Then I turn off the CDGMccTxn rule for negative scenarios
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables