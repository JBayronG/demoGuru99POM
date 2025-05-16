Proyecto de Automatización con Serenity BDD, Cucumber y POM

Este proyecto automatiza el inicio de sesión en el sitio de pruebas Guru99 Demo, utilizando Serenity BDD, Cucumber, Selenium y el patrón de diseño Page Object Model (POM).

Tabla de contenido

Estructura del Proyecto

Dependencias y Configuraciones

Diseño del Flujo de Automatización

Explicación del Código

Feature

Runner

Step Definitions

Steps

PageObjects

Models

Patrón de Diseño POM

Estructura del Proyecto

project-root
|-- src
|   |-- main
|   |-- test
|       |-- java
|       |   |-- models
|       |   |-- pageObjects
|       |   |-- steps
|       |   |-- runners
|       |   |-- stepDefinitions
|       |   
|       |-- resources
|           |-- features
|           |-- drivers
|-- Gradle
|-- serenity.conf / serenity.properties
|-- README.md

Dependencias y Configuraciones

Archivo serenity.properties:

webdriver.driver=chrome
webdriver.chrome.driver=src/test/resources/drivers/chromedriver.exe
serenity.project.name = Demo project using Serenity and Cucumber on the Guru99 Demo
chrome.switches=--start-maximized
webdriver.driver.silent=true
serenity.verbose.steps=FALSE
serenity.report.encoding=UTF8
feature.file.encoding=UTF8
serenity.test.root=net.thucydides.showcase.cucumber.junit

Diseño del Flujo de Automatización

Se define el escenario en un archivo .feature con Gherkin.

Se implementan los step definitions, que son la traducción del lenguaje natural a métodos Java.

Los step definitions usan clases "Steps" que contienen anotaciones @Step de Serenity.

Las clases "Steps" llaman a métodos de los PageObjects, donde se encuentra el código real de interacción con los elementos de la página.

Un runner ejecuta el escenario, usando Cucumber y Serenity.

Se generan reportes automáticos con Serenity.

Patrón de Diseño POM

El Page Object Model (POM) es un patrón que separa la lógica de automatización de la lógica de interfaz gráfica. Sus ventajas incluyen:

Reutilización de código.

Mantenimiento más sencillo.

Mayor claridad en la separación de responsabilidades.

En este proyecto:

LoginPage es el Page Object.

LoginSteps es la clase que orquesta las acciones del flujo.

LoginStepDefinition vincula los pasos en lenguaje natural con el código.

Conclusión

Este proyecto demuestra un enfoque estructurado de automatización con buenas prácticas, como el uso de Serenity BDD, Cucumber y el patrón POM. Esta arquitectura permite escalar los tests, mejorar la legibilidad y mantener una separación clara entre las capas de lógica, interfaz y definición de escenarios.

