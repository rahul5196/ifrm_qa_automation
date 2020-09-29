Feature: Posting UPI Transactions

  Scenario: Perform SingleDayHighAmt Breach
    Given I login as supervisor to activate SingleDayHighAmt rule
    And The SingleDayHighAmt rule is on
    And Check the SingleDayHighAmt rule is active or not
    When I post transaction for SingleDayHighAmt
    And If i get action as "stop" for SingleDayHighAmt
    Then I turn off the SingleDayHighAmt rule
    Then I logout

  Scenario: Perform MultipleDayHighAmt Breach
    Given I login as supervisor to activate MultipleDayHighAmt rule
    And The MultipleDayHighAmt rule is on
    And Check the MultipleDayHighAmt rule is active or not
    When I post transaction for MultipleDayHighAmt
    And If i get action as "stop" for MultipleDayHighAmt
    Then I turn off the MultipleDayHighAmt rule
    Then I logout

  Scenario: Perform MaxCountUPI Breach
    Given I login as supervisor to activate MaxCountUPI rule
    And The MaxCountUPI rule is on
    And Check the MaxCountUPI rule is active or not
    When I post transaction for MaxCountUPI
    And If i get action as "stop" for MaxCountUPI
    Then I turn off the MaxCountUPI rule
    Then I logout

  Scenario: Perform HighCountUPI Breach
    And Check the HighCountUPI rule is active or not
    When I post transaction for HighCountUPI
    And If i get action as "stop" for HighCountUPI
    Then I turn off the HighCountUPI rule
    Then I logout

  Scenario: Perform HighAmtUPI Breach
    Given I login as supervisor to activate HighAmtUPI rule
    And The HighAmtUPI rule is on
    And Check the HighAmtUPI rule is active or not
    When I post transaction for HighAmtUPI
    And If i get action as "stop" for HighAmtUPI
    Then I turn off the HighAmtUPI rule
    Then I logout

  Scenario: Perform OddHourAmount Breach
    Given I login as supervisor to activate OddHourAmount rule
    And The OddHourAmount rule is on
    And Check the OddHourAmount rule is active or not
    When I post transaction for OddHourAmount
    And If i get action as "stop" for OddHourAmount
    Then I turn off the OddHourAmount rule
    Then I logout

  Scenario: Perform OddHourCount Breach
    Given I login as supervisor to activate OddHourCount rule
    And The OddHourCount rule is on
    And Check the OddHourCount rule is active or not
    When I post transaction for OddHourCount
    And If i get action as "stop" for OddHourCount
    Then I turn off the OddHourCount rule
    Then I logout

  Scenario: Perform MultipleDayLimit(BankPSP) Breach
    Given I login as supervisor to activate MultipleDayLimit(BankPSP) rule
    And The MultipleDayLimit(BankPSP) rule is on
    And Check the MultipleDayLimit(BankPSP) rule is active or not
    When I post transaction for MultipleDayLimit(BankPSP)
    And If i get action as "stop" for MultipleDayLimit(BankPSP)
    Then I turn off the MultipleDayLimit(BankPSP) rule
    Then I logout

  Scenario: Perform HighCount(BankPSP) Breach
    Given I login as supervisor to activate HighCount(BankPSP) rule
    And The HighCount(BankPSP) rule is on
    And Check the HighCount(BankPSP) rule is active or not
    When I post transaction for HighCount(BankPSP)
    And If i get action as "stop" for HighCount(BankPSP)
    Then I turn off the HighCount(BankPSP) rule
    Then I logout

  Scenario: Perform MultipleDayCount(BankPSP) Breach
    Given I login as supervisor to activate MultipleDayCount(BankPSP) rule
    And The MultipleDayCount(BankPSP) rule is on
    And Check the MultipleDayCount(BankPSP) rule is active or not
    When I post transaction for MultipleDayCount(BankPSP)
    And If i get action as "stop" for MultipleDayCount(BankPSP)
    Then I turn off the MultipleDayCount(BankPSP) rule
    Then I logout

  Scenario: Perform MultipleCollectReq Breach
    Given I login as supervisor to activate MultipleCollectReq rule
    And The MultipleCollectReq rule is on
    And Check the MultipleCollectReq rule is active or not
    When I post transaction for MultipleCollectReq
    And If i get action as "stop" for MultipleCollectReq
    Then I turn off the MultipleCollectReq rule
    Then I logout

  Scenario: Perform MultipleDayCollectReq Breach
    Given I login as supervisor to activate MultipleDayCollectReq rule
    And The MultipleDayCollectReq rule is on
    And Check the MultipleDayCollectReq rule is active or not
    When I post transaction for MultipleDayCollectReq
    And If i get action as "stop" for MultipleDayCollectReq
    Then I turn off the MultipleDayCollectReq rule
    Then I logout

  Scenario: Perform MultipleCollectReq(AcrossPSP) Breach
    Given I login as supervisor to activate MultipleCollectReq(AcrossPSP) rule
    And The MultipleCollectReq(AcrossPSP) rule is on
    And Check the MultipleCollectReq(AcrossPSP) rule is active or not
    When I post transaction for MultipleCollectReq(AcrossPSP)
    And If i get action as "stop" for MultipleCollectReq(AcrossPSP)
    Then I turn off the MultipleCollectReq(AcrossPSP) rule
    Then I logout

  Scenario: Perform MultipleDeclines Breach
    Given I login as supervisor to activate MultipleDeclines rule
    And The MultipleDeclines rule is on
    And Check the MultipleDeclines rule is active or not
    When I post transaction for MultipleDeclines
    And If i get action as "stop" for MultipleDeclines
    Then I turn off the MultipleDeclines rule
    Then I logout

  Scenario: Perform FirstTxn Breach
    Given I login as supervisor to activate FirstTxn rule
    And The FirstTxn rule is on
    And Check the FirstTxn rule is active or not
    When I post transaction for FirstTxn
    And If i get action as "stop" for FirstTxn
    Then I turn off the FirstTxn rule
    Then I logout

  Scenario: Perform PinDecline Breach
    Given I login as supervisor to activate PinDecline rule
    And The PinDecline rule is on
    And Check the PinDecline rule is active or not
    When I post transaction for PinDecline
    And If i get action as "stop" for PinDecline
    Then I turn off the PinDecline rule
    Then I logout

  Scenario: Perform HighAmtAppTxn Breach
    Given I login as supervisor to activate HighAmtAppTxn rule
    And The HighAmtAppTxn rule is on
    And Check the HighAmtAppTxn rule is active or not
    When I post transaction for HighAmtAppTxn
    And If i get action as "stop" for HighAmtAppTxn
    Then I turn off the HighAmtAppTxn rule
    Then I logout

  Scenario: Perform OtpDecline Breach
    Given I login as supervisor to activate OtpDecline rule
    And The OtpDecline rule is on
    And Check the OtpDecline rule is active or not
    When I post transaction for OtpDecline
    And If i get action as "stop" for OtpDecline
    Then I turn off the OtpDecline rule
    Then I logout

  Scenario: Perform MultipleCollectReqSameDebitAcc Breach
    Given I login as supervisor to activate MultipleCollectReqSameDebitAcc rule
    And The MultipleCollectReqSameDebitAcc rule is on
    And Check the MultipleCollectReqSameDebitAcc rule is active or not
    When I post transaction for MultipleCollectReqSameDebitAcc
    And If i get action as "stop" for MultipleCollectReqSameDebitAcc
    Then I turn off the MultipleCollectReqSameDebitAcc rule
    Then I logout

    //FOR UNDEFINED SCENARIOS

  Scenario: Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule
    And The MultipleBeneficiary rule is on
    And Check the MultipleBeneficiary rule is active or not
    When I post transaction for MultipleBeneficiary
    And If i get action as "stop" for MultipleBeneficiary
    Then I turn off the MultipleBeneficiary rule
    Then I logout

  Scenario: Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule
    And The MultipleBeneficiary rule is on
    And Check the MultipleBeneficiary rule is active or not
    When I post transaction for MultipleBeneficiary
    And If i get action as "stop" for MultipleBeneficiary
    Then I turn off the MultipleBeneficiary rule
    Then I logout

  Scenario: Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule
    And The MultipleBeneficiary rule is on
    And Check the MultipleBeneficiary rule is active or not
    When I post transaction for MultipleBeneficiary
    And If i get action as "stop" for MultipleBeneficiary
    Then I turn off the MultipleBeneficiary rule
    Then I logout

  Scenario: Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule
    And The MultipleBeneficiary rule is on
    And Check the MultipleBeneficiary rule is active or not
    When I post transaction for MultipleBeneficiary
    And If i get action as "stop" for MultipleBeneficiary
    Then I turn off the MultipleBeneficiary rule
    Then I logout

  Scenario: Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule
    And The MultipleBeneficiary rule is on
    And Check the MultipleBeneficiary rule is active or not
    When I post transaction for MultipleBeneficiary
    And If i get action as "stop" for MultipleBeneficiary
    Then I turn off the MultipleBeneficiary rule
    Then I logout