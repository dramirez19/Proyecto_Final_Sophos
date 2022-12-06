#Autor d.ramirez.0109@gmail.com

  Feature: Automatizacion de Elements -> Web Tables
    Yo como automatizador de pruebas
    Necesito ingresar a la página
    Para evaluar ciertas funcionalidades


    Scenario: Ingresar a Elements -> Web Tables de la página web
      Given "Actor" Desea navegar a la pagina web "https://demoqa.com/"
      When Crear nuevo registro en la opcion Web Tables
      | First_Name | Daniel             |
      | Last_Name  | Ramirez            |
      | Email      | prueba@gmail.com   |
      | Age        | 28                 |
      | Salary     | 2000               |
      | Department | QA Automation      |







