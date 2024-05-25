Scenario: registrar usuario con informacion valida
  Given que el usuario desea registrarse en el sistema de la aerolinea
  And se encuentra en la pagina de registro
  When ingresa su informacion al crear la cuenta
  Then el sistema indica que el usuario ha sido creado

Scenario: registrar usuario con informacion invalida
  Given que el usuario desea registrarse en el sistema de la aerolinea
  And se encuentra en la pagina de registro
  When ingresa informacion invalida al crear la cuenta
  Then el sistema indica que ha habido un error en los datos ingresados

Scenario: registrar usuario con una cuenta de google
  Given que el usuario desea registrarse en el sistema de la aerolinea con una cuenta de google
  And se encuentra en la pagina de registro
  When selecciona registrarse con su cuenta de google
  Then el sistema indica que el usuario ha sido creado
