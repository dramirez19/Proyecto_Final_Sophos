# Proyecto Final Bootcamp Sophos

Este proyecto ha sido realizado con las siguientes características:

- Patrón de diseño o Arquetipo: Screenplay
- Metología BDD o HU: Cucumber
- Lenguaje de Dominio (DSL): Gherkin
- Tipo de proyecto: Gradle
- Lenguaje de programación: Java
- Tipo de reporte: Serenity Reports

Versiones de herramientas:
- Serenity: 2.4.34
- Cucumber: 2.4.34
- Gradle: 7.5.1
- Java: 17

Para clonar repositorio:
- git clone git@github.com:dramirez19/Proyecto_Final_Sophos.git

Información SonarQube

- El proyecto en este momento tiene la configuración para realizarle análisis de código con SonarQube y enviar los resultados a un SonarQube remoto. Si Sophos tiene uno, sería posible realizar esto con la URL y el Token.

Informacion acerca del flujo #3

- En este flujo era necesario interactuar con alertas, las cuales no eran de la pagina como tal, sino del sistema. Usando Serenity no fue posible interactuar con estas, ya que nunca me funcionó el código recomendado en la documentación de Serenity "Switch.toAlert().andAccept()". Por esta razón, fue necesario usar unas líneas de código usando Selenium para poder interactuar con dichas alertas y poder cumplir con el flujo correctamente.


