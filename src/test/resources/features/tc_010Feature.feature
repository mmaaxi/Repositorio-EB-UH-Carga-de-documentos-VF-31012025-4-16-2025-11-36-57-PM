Feature: Validar integración con sistema externo

  Scenario: Cargar documento y verificar integración
    Given el sistema simula la comunicación con un sistema externo al cargar el documento
    When el sistema envía los datos al sistema externo
    Then el sistema externo debe responder confirmando la transacción
    And el proceso de carga debe continuar sin errores
    And la integración debe gestionarse de forma transparente