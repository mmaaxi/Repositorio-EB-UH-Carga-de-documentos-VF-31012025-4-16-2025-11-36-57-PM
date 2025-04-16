Feature: Validación de carga de documento

  Scenario: Validar carga de documento con formato correcto
    Given el usuario selecciona un archivo con formato admitido
    When el usuario hace clic en el botón 'Cargar documento'
    Then el sistema muestra el mensaje 'Documento cargado exitosamente'