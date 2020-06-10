Feature: Crear proyecto Todoist

  Scenario: Crear proyecto basico

    Given Estoy logueado a Todoist

    When Doy clic en agregar Proyecto
    And Ingreso nombre del proyecto
    And doy clic en aceptar

    Then Se crea el proyecto en Todoist


  Scenario: Crear proyecto con color


    Given Estoy logueado a Todoist

    When Doy clic en agregar Proyecto
    And Ingreso nombre del proyecto
    And Selecciono opción de color
    And doy clic en aceptar

    Then Se crea el proyecto avanzado en Todoist


  Scenario: Crear proyecto favorito

    Given Estoy logueado a Todoist

    When Doy clic en agregar Proyecto
    And Ingreso nombre del proyecto
    And Selecciono opción de color
    And Selecciono agregar Favoritos
    And doy clic en aceptar

    Then Se crea el proyecto favorito en Todoist