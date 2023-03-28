@smoketest
Feature: google search

  Scenario Outline: title testing
    Given open "<browser-name>" browser
    When i launch "http://www.google.co.in" site
    Then title should be "Google"
    When i entered a value and verify title
      | word       |
      | Ratan Tata |
      | steve jobs |
      | tcs        |
      | apple      |
    And close site

    Examples: 
      | browser-name |
      | chrome       |
      | edge         |
      | firefox      |
