Feature: Validar interacción con base de datos durante la carga

  Scenario: Cargar un documento y verificar inserción en la base de datos
    Given el documento está listo para ser cargado
    When se carga el documento
    Then se registra un nuevo registro con los metadatos correspondientes en la base de datos

  Scenario: Verificar campos obligatorios y datos integrados en la BD
    Given el documento se ha cargado correctamente
    Then todos los datos se guardan de forma correcta y consistente en la base de datos

  Scenario: Realizar una consulta posterior a la carga
    Given el documento se ha cargado y registrado en la base de datos
    When se realiza una consulta SQL para verificar el documento
    Then el documento y sus metadatos aparecen en los resultados de la consulta