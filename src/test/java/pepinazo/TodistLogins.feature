Feature: Todoist Login
  Scenario: Login mediante correo


    Given Tengo un usuario(correo electronico) y contraseña (cuenta de usuario en todoist)

    When Ingreso credenciales

    And hago click en iniciar sesión

    Then Acceso a la aplicación de todoist


  Scenario: Login mediante facebook

    Given Tengo cuenta de todoist asociada a facebook

    When Doy click en iniciar con Facebook
    And agrego credenciales de Facebook
    And hago click en iniciar sesión

    Then Ingreso a la aplicación de todoist


  Scenario: Login con cuenta de  google

 # Scenario: Login con cuenta de  apple