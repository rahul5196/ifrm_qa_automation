Feature: Posting ECOM Transactions

  Scenario: Perform MonthlySubMcc Breach
    Given I login as supervisor to activate MonthlySubMcc rule
    And The MonthlySubMcc rule is on
    And Check the MonthlySubMcc rule is active or not
    When I post transaction from the specified mcc for MonthlySubMcc
    And If i get response code as 202 for MonthlySubMcc
    Then I turn off the MonthlySubMcc rule
    Then I logout

  Scenario: Perform OddHour Breach
    Given I login as supervisor to activate odd hour rule for ecom
    And The odd hour rule is on for ecom
    And Check the odd hour rule is active or not for ecom
    When I post 2 odd hour transactions for ecom
    And If i get response code as 202 for OddHour for ecom
    Then I turn off the odd hour rule for ecom
    Then I logout

  Scenario: Perform DayMccCount Breach
    Given I login as supervisor to activate DayMccCount rule
    And The DayMccCount rule is on
    And Check the DayMccCount rule is active or not
    When I post transactions from specified mcc for DayMccCount
    And If i get response code as 202 for DayMccCount
    Then I turn off the DayMccCount rule
    Then I logout

  Scenario: Perform CatAMcc Breach
    Given I login as supervisor to activate CatAMcc rule
    And The CatAMcc rule is on
    And Check the CatAMcc rule is active or not
    When I post transactions from specified mcc for CatAMcc and get response code as 202
    Then I turn off the CatAMcc rule
    Then I logout


  Scenario: Perform MidNightTxnECOM Breach
    Given I login as supervisor to activate MidNightTxnECOM rule
    And The MidNightTxnECOM rule is on
    And Check the MidNightTxnECOM rule is active or not
    When I post transactions for MidNightTxnECOM and get response code as 202
    Then I turn off the MidNightTxnECOM rule
    Then I logout

  Scenario: Perform MonthMcc Breach
    Given I login as supervisor to activate MonthMcc rule
    And The MonthMcc rule is on
    And Check the MonthMcc rule is active or not
    When I post transactions for MonthMcc
    And If i get response code as 202 for MonthMcc
    Then I turn off the MonthMcc rule
    Then I logout

  Scenario: Perform CountryCodeTxn Breach
    Given I login as supervisor to activate CountryCodeTxn rule
    And The CountryCodeTxn rule is on
    And Check the CountryCodeTxn rule is active or not
    When I post transactions from the particular country code and get response code as 202
    Then I turn off the CountryCodeTxn rule
    Then I logout

  Scenario: Perform CardMcc Breach
    Given I login as supervisor to activate CardMcc rule
    And The CardMcc rule is on
    And Check the CardMcc rule is active or not
    When I post transactions for CardMcc
    And If i get response code as 202 for CardMcc
    Then I turn off the CardMcc rule
    Then I logout

  Scenario: Perform MaxMccCount Breach
    Given I login as supervisor to activate MaxMccCount rule
    And The MaxMccCount rule is on
    And Check the MaxMccCount rule is active or not
    When I post transaction for MaxMccCount
    And If i get response code as 202 for MaxMccCount
    Then I turn off the MaxMccCount
    Then I logout

  Scenario: Perform HighCount Breach
    Given I login as supervisor to activate HighCount rule for ecom
    And The HighCount rule is on for ecom
    And Check the HighCount rule is active or not for ecom
    When I post high count transaction for ecom
    And If i get response code as 202 for HighCount for ecom
    Then I turn off the HighCount  for ecom
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables