Feature: Cash Withdrawal

  Scenario Outline: Successful withdrawal from a wallet in credit
    Given I have deposited $ <deposit> in my wallet
    When I request $ <amount>
    Then $ <amount> should be dispensed
    And The balance of my wallet should be $ <balance>
    Examples:
      | deposit | amount | balance |
      | 200 | 30 | 170             |
      | 200 | 100 | 100            |
      | 200 | 200 | 0              |
      | 200 | 0 | 200              |
      | 200 | 250 | 200            |

