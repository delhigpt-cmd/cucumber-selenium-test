Feature: Login steps for nop commerce

  Scenario Outline: verify logo resence of nop commerece
    Given user launch "<browser>" browser
    When user open url "<url>"
    Then I Verify logo is present 
    And close browser
    

    Examples: 
      | browser | url                      |
      | chrome  | https://www.google.com   |
      | chrome  | https://www.selenium.dev |
