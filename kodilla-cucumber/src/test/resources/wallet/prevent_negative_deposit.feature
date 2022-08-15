Feature: Prevent users from making deposits below 0
  Scenario: User try to deposit -100
    Given there is 100 in my wallet
    When I try to deposit -100
    Then The deposit is not made
    And I get an error message - negative deposit