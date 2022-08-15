Feature: Is it divisible for 3 or 5 (or both)?

  Scenario Outline: Number is or isn't divisible for 3 or 5 or both
    Given Number is <number>
    When I ask whether it's divisible for 3 or 5 or both
    Then It should be <result>
    Examples:
      | number | result |
      | 10 | "Buzz" |
      |6 | "Fizz" |
      |14 | "None" |
      |25 | "Buzz" |
      |12 | "Fizz" |
      |17 | "None" |
      |15 | "FizzBuzz" |
      |34 | "None" |
      |75 | "FizzBuzz" |
