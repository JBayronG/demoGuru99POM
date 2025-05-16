🧪 Proyecto de Automatización: Serenity BDD + Cucumber + POM
Este proyecto implementa la automatización del proceso de inicio de sesión en el sitio de pruebas Guru99 Demo, utilizando Serenity BDD, Cucumber, Selenium WebDriver y el patrón de diseño Page Object Model (POM). La arquitectura aplicada promueve la escalabilidad, reutilización de código y separación de responsabilidades.

📚 Tabla de Contenido
📁 Estructura del Proyecto

🔧 Dependencias y Configuraciones

🧩 Diseño del Flujo de Automatización

🧠 Explicación de Componentes

📐 Patrón de Diseño POM

✅ Conclusión

📁 Estructura del Proyecto
bash
Copiar
Editar
project-root
│
├── src
│   └── test
│       ├── java
│       │   ├── models
│       │   ├── pageObjects
│       │   ├── steps
│       │   ├── runners
│       │   └── stepDefinitions
│       └── resources
│           ├── features
│           └── drivers
│
├── serenity.properties / serenity.conf
├── build.gradle
└── README.md
🔧 Dependencias y Configuraciones
Archivo serenity.properties:

properties
Copiar
Editar
webdriver.driver=chrome
webdriver.chrome.driver=src/test/resources/drivers/chromedriver.exe
serenity.project.name=Demo project using Serenity and Cucumber on the Guru99 Demo
chrome.switches=--start-maximized
webdriver.driver.silent=true
serenity.verbose.steps=false
serenity.report.encoding=UTF-8
feature.file.encoding=UTF-8
serenity.test.root=net.thucydides.showcase.cucumber.junit

✅ Asegúrate de tener el chromedriver.exe correcto para tu versión de Chrome.

🧩 Diseño del Flujo de Automatización
El escenario se describe en un archivo .feature utilizando Gherkin.

Las Step Definitions traducen los pasos escritos en lenguaje natural a código Java.

Las clases de Steps contienen métodos con la anotación @Step provista por Serenity.

Los Steps interactúan con los Page Objects, donde se define la lógica de interacción con los elementos del DOM.

Un Runner ejecuta los escenarios usando Cucumber y genera reportes automáticos con Serenity.

🧠 Explicación de Componentes
Features: Escenarios en lenguaje natural.

Runner: Configura la ejecución con Cucumber y Serenity.

Step Definitions: Traducción de pasos Gherkin a métodos Java.

Steps: Lógica modular con anotaciones @Step.

Page Objects: Representación de páginas con sus elementos y acciones.

Models: Estructuras de datos o representaciones de entidades.

📐 Patrón de Diseño POM
El Page Object Model (POM) es un patrón de diseño que favorece la separación entre la lógica de pruebas y la interfaz de usuario.

Ventajas:
🔄 Reutilización de componentes.

🛠️ Mantenimiento más simple.

📖 Mejor claridad y organización.

En este proyecto:
LoginPage.java: Contiene los elementos y acciones de la pantalla de login.

LoginSteps.java: Orquesta el flujo de acciones.

LoginStepDefinition.java: Conecta los pasos Gherkin con el flujo de pruebas.

✅ Conclusión
Este proyecto ejemplifica buenas prácticas en la automatización de pruebas mediante Serenity BDD, Cucumber y el patrón Page Object Model. La arquitectura aplicada facilita el mantenimiento, la escalabilidad de pruebas y la claridad en la estructura del código.
