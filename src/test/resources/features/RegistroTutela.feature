@RegistroTutela
Feature: Realizar el registro de la acción de tutela en el SIUGJ

  @tag1
  Scenario: Registro de demanda lineal
    Given Que tengo mis datos de ingreso
    When Ingreso el usuario "correoactor2021@gmail.com" y contraseña "123456"
    Then compruebo el acceso
