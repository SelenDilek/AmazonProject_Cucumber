Feature : Register Test

  Background:
    Given Navigate to Website
    And click Sign in button
    And type email "frwegfwe@gmail.com"
    And click on Create an Account button

    Scenario: Kisi 1
      And type fistname "selen" and lastname "dilek"
      And type password "sdkljf123"

  Scenario: Kisi 2
    And type Company "technostudy"
    And type address "adana"

    Scenario Outline: Kisi 3

      And type firstname "<firstname>" and lastname "<lastname>"
      And type password "<password>"
      And type Company "<Company>"
      And type adress <adress>
      Examples:
        | firstname | lastname | password | Company | adress |

