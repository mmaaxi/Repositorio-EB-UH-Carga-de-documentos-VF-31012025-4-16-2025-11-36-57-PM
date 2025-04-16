Feature: Validar recuperación de documento en error

  Scenario: Recuperación de carga de documento en error
    Given un usuario está cargando un documento
    When simula un error de red durante la carga
    Then el sistema debería detectar el error y cancelar la carga
    When restaura la conexión y reintenta la carga del documento
    Then el sistema debería permitir reintentar la carga del documento fallido
    When confirma que la carga es exitosa
    Then el sistema debería notificar el éxito de la carga