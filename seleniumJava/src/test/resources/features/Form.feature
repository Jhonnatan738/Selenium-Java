Feature: Acceso y verificacion del formulario
 	Se requiere el acceso a la pagina solicitada
 	Para Verificar los campos del Formulario
 	Entonces se efectuara una verificacion correctamente 

  Background:
    Given el usuario está en la página de DemoQA
    And navega a la sección de formularios

  Scenario: Validación de campos obligatorios al enviar formulario vacío
    Given El usuario accede al formulario
    When El usuario da click sobre el botón Submit
    Then Los campos Name, Last Name y Number se muestran resaltados

  Scenario: Se podran validaran los inputs obligatorios del formulario
    Given El usuario podra ingresar tanto el nombre como el apellido
    When El usuario dara click sobre el boton Submit del formulario
    And El usuario podrá seguir visualizando el formulario aun con la información previamente ingresada
    And El usuario intentará agregar más de 10 caracteres "alfabéticos" y visualizar la información errónea
    And El usuario intentará agregar más de 10 caracteres "alfanuméricos" y visualizar la información errónea
    And El usuario ingresará un número de contacto válido
    Then Se podrá visualizar que el campo Input fue ingresado correctamente

  Scenario: Se podra verificar el ingreso correcto de un correo electronico
    Given El usuario podra borrar la informacion ingresada previamente
    When El usuario intentara ingresar un email sin el caracter @ pero con la extension correcta
    And se podra visualizar que el input se marca erroneo
    And El usuario intentara ingresar un email con el @ pero sin la extension
    And se podra visualizar que el input se marca erroneo
    And El usuario intentara ingresar un email correctamente
    Then se podra visualizar que el input se marca correcto

  Scenario: El usuario podra ingresar una fecha correcta
    Given El usuario podra visualizar la fecha del dia de hoy por defecto
    When El usuario podra seleccionar la fecha correspondiente al dia de hoy del año anterior mas un dia
    Then Se podra visualizar el cambio de fecha exitosamente

  Scenario: Se Validara el envio de los datos del formulario
    Given El usuario podra dar click en el boton Submit
    When El usuario podra visualizar la aparicion de un pop up informativo
    And se comparara la informacion ingresada con la mostrada en el pop up
    Then el usuario podra dar click en el boton Close del pop up
