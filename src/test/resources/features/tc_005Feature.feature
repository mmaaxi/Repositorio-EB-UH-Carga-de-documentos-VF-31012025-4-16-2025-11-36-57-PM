Feature: Validar límite de archivos simultáneos

  Scenario: Cargar archivos dentro del límite permitido
    Given el usuario está en la página de carga de documentos
    When el usuario selecciona el número máximo de documentos permitidos
    Then el sistema debe procesar los documentos seleccionados

  Scenario: Intentar agregar un documento adicional
    Given el usuario tiene el número máximo de documentos seleccionados
    When el usuario intenta agregar un documento adicional
    Then el sistema debe mostrar un mensaje de error indicando la cantidad máxima permitida

  Scenario: Verificar carga dentro del límite
    Given el usuario ha cargado el número permitido de documentos
    When se verifica la cantidad de documentos cargados
    Then la carga debe ser exitosa solo para los documentos dentro del límite