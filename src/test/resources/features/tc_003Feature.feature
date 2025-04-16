Feature: Validar carga sin documento

  Scenario: Intento de carga sin seleccionar documento
    Given el campo de carga está vacío
    When presiono el botón 'Cargar documento'
    Then el sistema debería mostrar un mensaje de advertencia solicitando un archivo
    And no debería intentar cargar datos inexistentes