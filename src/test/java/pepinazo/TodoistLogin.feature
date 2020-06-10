Feature: Todoist login


  Scenario Outline: Hacer login con credenciales
    Given I navigate to <url>
    When I log into todoist with valid credentials
    And ingreso <user> and <password>
    Then I should see the home page
    And The list of projects will be visible
    Examples:
      |url |user | password |
      |https://todoist.com/ | jomarnavarro@gmail.com |Test@1234|



 Scenario Outline: Hacer login con facebook
  Given I navigate to <url>
    When I log into todoist with facebook account <facebookUser> and <facebookPass>
    Then I should see the home page
    And The list of projects will be visible

    Examples:
      |url|facebookUser|facebookPass|
      |https://todoist.com/|jomarnavarro@gmail.com|123|

  Scenario: Hacer login con cuenta de google

   # Inviable por el two factor authentification
  #Scenario: Login con cuenta de apple

  Scenario: Login with facebook account that has same email as regular credentials


