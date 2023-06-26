@author:LizehtMuñoz

  Feature: el ingresa a la pagina
    automationtesting y realiza una compra

  Background: cargar la pagina automationtesting
    Given el usuario ingresa a la pagina de automationtesting

  Scenario:el usuario realiza una compra
    When el usuario selecciona los productos que desea comprar
    And ingresa sus datos personales

    Then EL usuario finaliza la compra
