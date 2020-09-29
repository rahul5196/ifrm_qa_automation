Feature: Posting IBMB Transactions

  Scenario: Perform DormantAcc Breach
    Given I login as supervisor to activate DormantAcc rule
    And The DormantAcc rule is on
    And Check the DormantAcc rule is active or not
    When I post transaction for DormantAcc
    And If i get action as "stop" for DormantAcc
    Then I turn off the DormantAcc rule
    Then I logout

  Scenario: Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule
    And The MultipleBeneficiary rule is on
    And Check the MultipleBeneficiary rule is active or not
    When I post transaction for MultipleBeneficiary
    And If i get action as "stop" for MultipleBeneficiary
    Then I turn off the MultipleBeneficiary rule
    Then I logout

  Scenario: Perform SameBeneficiary Breach
    Given I login as supervisor to activate SameBeneficiary rule
    And The SameBeneficiary rule is on
    And Check the SameBeneficiary rule is active or not
    When I post transaction for SameBeneficiary
    And If i get action as "stop" for SameBeneficiary
    Then I turn off the SameBeneficiary rule
    Then I logout

  Scenario: Perform DormantAcc Breach
    Given I login as supervisor to activate UnusedIP rule
    And The UnusedIP rule is on
    And Check the UnusedIP rule is active or not
    When I post transaction and get action as "stop" for UnusedIP
    Then I turn off the UnusedIP rule
    Then I logout

  Scenario: Perform IBMBHighCount Breach
    Given I login as supervisor to activate IBMBHighCount rule
    And The IBMBHighCount rule is on
    And Check the IBMBHighCount rule is active or not
    When I post transaction for IBMBHighCount
    And If i get action as "stop" for IBMBHighCount
    Then I turn off the IBMBHighCount rule
    Then I logout

  Scenario: Perform IBMBHighAmount Breach
    Given I login as supervisor to activate IBMBHighAmount rule
    And The IBMBHighAmount rule is on
    And Check the IBMBHighAmount rule is active or not
    When I post transaction for IBMBHighAmount
    And If i get action as "stop" for IBMBHighAmount
    Then I turn off the IBMBHighAmount rule
    Then I logout

  Scenario: Perform IBMBOddHour Breach
    Given I login as supervisor to activate IBMBOddHour rule
    And The IBMBOddHour rule is on
    And Check the IBMBOddHour rule is active or not
    When I post transaction for IBMBOddHour
    And If i get action as "stop" for IBMBOddHour
    Then I turn off the IBMBOddHour rule
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables