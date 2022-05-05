@RegistroTutela
Feature: Realizar el registro de la acción de tutela en el SIUGJ

  @tag1
  Scenario: Registro de demanda lineal
    Given Que tengo mis datos de ingreso
    When Ingreso el usuario "correoactor2021@gmail.com" y contraseña "123456"
    Then compruebo el acceso


  #@tag2
  #Scenario: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples:
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
