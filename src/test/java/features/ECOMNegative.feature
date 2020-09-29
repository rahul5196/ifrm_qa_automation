Feature: Posting Out of Scenarios ECOM Transactions

  Scenario: To Not Perform MonthlySubMcc Breach
    Given I login as supervisor to activate MonthlySubMcc rule for negative scenarios
    And The MonthlySubMcc rule is on for negative scenarios
    And Check the MonthlySubMcc rule is active or not for negative scenarios
    When I post transaction from the specified mcc for MonthlySubMcc for negative scenarios
    And If i get response code as 000 for MonthlySubMcc for negative scenarios
    Then I turn off the MonthlySubMcc rule for negative scenarios
    Then I logout

  Scenario: To Not Perform OddHour Breach
    Given I login as supervisor to activate odd hour rule for ecom for negative scenarios
    And The odd hour rule is on for ecom for negative scenarios
    And Check the odd hour rule is active or not for ecom for negative scenarios
    When I post 2 odd hour transactions for ecom for negative scenarios
    And If i get response code as 000 for OddHour for ecom for negative scenarios
    Then I turn off the odd hour rule for ecom for negative scenarios
    Then I logout

  Scenario: To Not Perform DayMccCount Breach
    Given I login as supervisor to activate DayMccCount rule for negative scenarios
    And The DayMccCount rule is on for negative scenarios
    And Check the DayMccCount rule is active or not for negative scenarios
    When I post transactions from specified mcc for DayMccCount for negative scenarios
    And If i get response code as 000 for DayMccCount for negative scenarios
    Then I turn off the DayMccCount rule for negative scenarios
    Then I logout

  Scenario: To Not Perform CatAMcc Breach
    Given I login as supervisor to activate CatAMcc rule for negative scenarios
    And The CatAMcc rule is on for negative scenarios
    And Check the CatAMcc rule is active or not for negative scenarios
    When I post transactions from specified mcc for CatAMcc and get response code as 000 for negative scenarios
    Then I turn off the CatAMcc rule for negative scenarios
    Then I logout



  Scenario: To Not Perform MidNightTxnECOM Breach
    Given I login as supervisor to activate MidNightTxnECOM rule for negative scenarios
    And The MidNightTxnECOM rule is on for negative scenarios
    And Check the MidNightTxnECOM rule is active or not for negative scenarios
    When I post transactions for MidNightTxnECOM and get response code as 000 for negative scenarios
    Then I turn off the MidNightTxnECOM rule for negative scenarios
    Then I logout

  Scenario: To Not Perform MonthMcc Breach
    Given I login as supervisor to activate MonthMcc rule for negative scenarios
    And The MonthMcc rule is on for negative scenarios
    And Check the MonthMcc rule is active or not for negative scenarios
    When I post transactions for MonthMcc for negative scenarios
    And If i get response code as 000 for MonthMcc for negative scenarios
    Then I turn off the MonthMcc rule for negative scenarios
    Then I logout

  Scenario: To Not Perform CountryCodeTxn Breach for negative scenarios
    Given I login as supervisor to activate CountryCodeTxn rule for negative scenarios
    And The CountryCodeTxn rule is on for negative scenarios
    And Check the CountryCodeTxn rule is active or not for negative scenarios
    When I post transactions from the particular country code and get response code as 000 for negative scenarios
    Then I turn off the CountryCodeTxn rule for negative scenarios
    Then I logout

  Scenario: To Not Perform CardMcc Breach
    Given I login as supervisor to activate CardMcc rule for negative scenarios
    And The CardMcc rule is on for negative scenarios
    And Check the CardMcc rule is active or not for negative scenarios
    When I post transactions for CardMcc for negative scenarios
    And If i get response code as 000 for CardMcc for negative scenarios
    Then I turn off the CardMcc rule for negative scenarios
    Then I logout

  Scenario: To Not Perform MaxMccCount Breach
    Given I login as supervisor to activate MaxMccCount rule for negative scenarios
    And The MaxMccCount rule is on for negative scenarios
    And Check the MaxMccCount rule is active or not for negative scenarios
    When I post transaction for MaxMccCount for negative scenarios
    And If i get response code as 000 for MaxMccCount for negative scenarios
    Then I turn off the MaxMccCount for negative scenarios
    Then I logout

  Scenario: To Not Perform HighCount Breach
    Given I login as supervisor to activate HighCount rule for ecom for negative scenarios
    And The HighCount rule is on for ecom for negative scenarios
    And Check the HighCount rule is active or not for ecom for negative scenarios
    When I post high count transaction for ecom for negative scenarios
    And If i get response code as 000 for HighCount for ecom for negative scenarios
    Then I turn off the HighCount  for ecom for negative scenarios
    Then I logout

  Scenario: Generating Reports and Cleaning the data
    Given I generate the report
    And I truncate the tables