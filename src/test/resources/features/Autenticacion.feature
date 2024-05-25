  Feature: Autenticación de usuarios
    Como un usuario registrado
    Quiero acceder a un sistema de login
    Para confirmar mi identidad y acceder a los servicios de la aerolínea.

  Scenario: Iniciar sesion con credenciales validas
    Given que estoy en la pagina de inicio de sesion
    When ingreso nombre de usuario y contrasena validos
    Then deberia ver la pagina de bienvenida

  Scenario: Iniciar sesion mediante servicios de terceros
    Given que el usuario prefiere usar una cuenta externa para autenticarse
    When elige autenticarse con una cuenta de Google u otro servicio
    Then el sistema le permite usar otros servicios de cuentas para acceder

  Scenario: Iniciar sesion con credenciales invalidas
    Given que estoy en la pagina de inicio de sesion
    When ingreso nombre de usuario y contrasena invalidos
    Then deberia ver un mensaje de error indicando credenciales invalidas

  Scenario: Intentos de inicio de sesión excedidos
    Given que he intentado iniciar sesión sin exito tres veces
    When intento iniciar sesion por cuarta vez con credenciales invalidas
    Then deberia ver un mensaje de error indicando que he excedido el limite de intentos
    And deberia recibir un correo para confirmar mi identidad
