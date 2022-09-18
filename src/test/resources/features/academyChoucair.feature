#Autor: Diego Andres T
  @stories
  Feature: Academy choucair
    Enter the utest.com website and proceed to click on the registration option and fill out the form in order to create a new user
  @RegistrationScenario
  Scenario: create a new user
    Given than diego wants to register at the utest.com
      | strOption  |
      | Join Today |
    When go to the Join Today registration option
      | strFirstName  |  strLastName  | strMail               | strMonth  | strDay   |  strYear | strLanguages  | strPassword           |
      | diego         |  andres       | newMail01@gmail.com     | December  | 3        |  1999    | Spanish       | mySecurityPassword01  |
    Then fill in the form and create a new user
      | strWelcomeMessage |
      | Welcome to the    |
