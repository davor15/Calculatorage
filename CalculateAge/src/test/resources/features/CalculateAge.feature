Feature: Calculate Age
  Scenario: User calculates age based on birthdate
    Given the user provides a birthdate "1990-01-15"
    When the user calculates the age
    Then the age in days should be 12000