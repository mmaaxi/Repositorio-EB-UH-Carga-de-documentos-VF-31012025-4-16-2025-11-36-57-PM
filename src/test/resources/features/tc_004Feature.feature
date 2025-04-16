Feature: Validar tamaño de documento permitido

  Scenario: Intentar cargar un documento cuya dimensión exceda el máximo permitido
    Given el usuario está en la página de carga de documentos
    When selecciona un documento que excede el tamaño permitido
    Then el sistema rechaza el documento y muestra advertencia de tamaño

  Scenario: Intentar cargar el documento grande
    Given el usuario ya ha intentado seleccionar un documento excedido
    When intenta cargar el documento grande
    Then no se permite la carga y se registra un error en el log

  Scenario: Seleccionar un documento dentro del límite permitido
    Given el usuario está en la página de carga de documentos
    When selecciona un documento dentro del límite permitido
    Then el sistema acepta el documento y continúa con la carga