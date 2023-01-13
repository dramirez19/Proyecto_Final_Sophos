#Autor d.ramirez.0109@gmail.com

Feature: Automatizacion de Alerts, Frame & Windows
  Yo como automatizador de pruebas
  Necesito ingresar a la página
  Para evaluar ciertas funcionalidades

  Background: Ingresar a la pagina web
    Given "Actor" Desea navegar a la pagina web "https://demoqa.com/"

  Scenario: Automatizar funcionalidades de Alerts, Frame & Windows -> Alerts
    When Probar las alertas y agregar el nombre "Daniel"
    #Then Validar que se haya agregado el nombre "Daniel"