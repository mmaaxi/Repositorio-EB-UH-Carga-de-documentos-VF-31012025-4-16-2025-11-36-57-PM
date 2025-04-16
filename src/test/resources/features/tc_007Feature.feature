Feature: Validar notificaciones de éxito

  Scenario: El sistema procesa un documento exitosamente y notifica al usuario
    Given el usuario carga un documento con formato correcto y dentro del tamaño permitido
    When la operación se completa
    Then el sistema muestra una notificación de éxito en pantalla
    And el email de confirmación es enviado al usuario