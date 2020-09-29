Feature: Posting IBMB Negative Transactions

  Scenario: To Not Perform DormantAcc Breach
    Given I login as supervisor to activate DormantAcc rule for negative scenarios
    And The DormantAcc rule is on for negative scenarios
    And Check the DormantAcc rule is active or not for negative scenarios
    When I post transaction for DormantAcc for negative scenarios
    And If i get action as "stop" for DormantAcc for negative scenarios
    Then I turn off the DormantAcc rule for negative scenarios
    Then I logout

  Scenario: To Not Perform MultipleBeneficiary Breach
    Given I login as supervisor to activate MultipleBeneficiary rule for negative scenarios
    And The MultipleBeneficiary rule is on for negative scenarios
    And Check the MultipleBeneficiary rule is active or not for negative scenarios
    When I post transaction for MultipleBeneficiary for negative scenarios
    And If i get action as "stop" for MultipleBeneficiary for negative scenarios
    Then I turn off the MultipleBeneficiary rule for negative scenarios
    Then I logout

  Scenario: To Not Perform SameBeneficiary Breach
    Given I login as supervisor to activate SameBeneficiary rule for negative scenarios
    And The SameBeneficiary rule is on for negative scenarios
    And Check the SameBeneficiary rule is active or not for negative scenarios
    When I post transaction for SameBeneficiary for negative scenarios
    And If i get action as "stop" for SameBeneficiary for negative scenarios
    Then I turn off the SameBeneficiary rule for negative scenarios
    Then I logout

  Scenario: To Not Perform DormantAcc Breach
    Given I login as supervisor to activate UnusedIP rule for negative scenarios
    And The UnusedIP rule is on for negative scenarios
    And Check the UnusedIP rule is active or not for negative scenarios
    When I post transaction and get action as "stop" for UnusedIP for negative scenarios
    Then I turn off the UnusedIP rule for negative scenarios
    Then I logout

  Scenario: To Not Perform IBMBHighCount Breach
    Given I login as supervisor to activate IBMBHighCount rule for negative scenarios
    And The IBMBHighCount rule is on for negative scenarios
    And Check the IBMBHighCount rule is active or not for negative scenarios
    When I post transaction for IBMBHighCount for negative scenarios
    And If i get action as "stop" for IBMBHighCount for negative scenarios
    Then I turn off the IBMBHighCount rule for negative scenarios
    Then I logout

  Scenario: To Not Perform IBMBHighAmount Breach
    Given I login as supervisor to activate IBMBHighAmount rule for negative scenarios
    And The IBMBHighAmount rule is on for negative scenarios
    And Check the IBMBHighAmount rule is active or not for negative scenarios
    When I post transaction for IBMBHighAmount for negative scenarios
    And If i get action as "stop" for IBMBHighAmount for negative scenarios
    Then I turn off the IBMBHighAmount rule for negative scenarios
    Then I logout

  Scenario: To Not Perform IBMBOddHour Breach
    Given I login as supervisor to activate IBMBOddHour rule for negative scenarios
    And The IBMBOddHour rule is on for negative scenarios
    And Check the IBMBOddHour rule is active or not for negative scenarios
    When I post transaction for IBMBOddHour for negative scenarios
    And If i get action as "stop" for IBMBOddHour for negative scenarios
    Then I turn off the IBMBOddHour rule for negative scenarios
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables