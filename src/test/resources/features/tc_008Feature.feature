Feature: Seguridad en el proceso de carga de documentos
  Validar que el sistema maneje correctamente los intentos de carga no autorizados.

  Scenario: Intentar cargar un documento sin autenticarse
    Given el usuario abre la página de carga de documentos
    When intenta cargar un documento
    Then el sistema impide la carga y redirige a la página de autenticación

  Scenario: Intentar acceder a la URL de carga directamente sin autenticación
    Given el usuario navega a la URL directa de carga de documentos
    Then el acceso es denegado y se muestra un mensaje de error

  Scenario: Verificar registro de actividad sospechosa en logs
    Given existen intentos de acceso no autorizados
    When se revisan los logs del sistema
    Then la actividad sospechosa está registrada en el log del sistema