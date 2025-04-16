Feature: Validar carga de documento con formato incorrecto

  Scenario: Intentar cargar un archivo con formato no soportado
    Given Estoy en la página de carga de documentos
    When Selecciono un archivo con formato EXE
    Then El sistema me notifica que el formato no es soportado
    When Intento cargar el archivo
    Then La carga es impedida y muestra una notificación de error
    Then Verifico que el documento no se registra en la base de datos