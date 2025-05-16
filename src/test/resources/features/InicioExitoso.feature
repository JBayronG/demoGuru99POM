Feature: Inicio de sesion

  @Test1
  Scenario: inicio de sesion exitoso
    Given que estoy en la pagina de Guru99 Demo
    When ingreso mis credenciales
      | txtUser     | txtPass    |
      | mngr622585  | AvumYjU    |
    Then se visualiza el mensaje
      | txtMensaje               |
      | Manger Id : mngr622585   |
