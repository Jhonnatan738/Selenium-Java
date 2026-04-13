![Build Status](https://github.com/Jhonnatan738/Selenium-java/actions/workflows/maven.yml/badge.svg)


Custom QA Automation Framework (Selenium & Cucumber)

Este proyecto consiste en un framework de automatización robusto diseñado y construido desde cero. A diferencia de usar herramientas "out-of-the-box", esta solución ha sido estructurada pieza a pieza seleccionando librerías específicas para crear un ecosistema de pruebas escalable, profesional y orientado a resultados visuales.
Arquitectura del Framework (Built from Scratch)

La arquitectura sigue el patrón de diseño Page Object Model (POM) integrado con BDD, utilizando un stack tecnológico moderno:

Núcleo de Automatización: Construido sobre Selenium WebDriver (v4.13.0) para una manipulación precisa del DOM.

Motor de BDD: Implementación completa con Cucumber (Java & TestNG), permitiendo que los escenarios técnicos se traduzcan en lenguaje de negocio (Gherkin).

Gestión Dinámica de Binarios: Integración de WebDriverManager para eliminar la gestión manual de drivers y asegurar compatibilidad entre entornos.

Reportería Avanzada: Sistema de reportes personalizado mediante Extent Reports, configurado para generar dashboards interactivos y capturas de pantalla automáticas en caso de fallo.

Gestión de Dependencias: Estructurado totalmente con Maven, garantizando un ciclo de vida de compilación y pruebas limpio y reproducible.

Escenarios de Prueba (Gherkin)

El framework valida flujos críticos de usuario en la plataforma de pruebas DemoQA:

Validación de Formulario: Verificación de campos obligatorios y estados de error.

Integridad de Datos: Validación de formatos de email y límites de caracteres.

Lógica de Negocio: Verificación de cambios de fecha y cálculos de tiempo (Año anterior + 1 día).

Confirmación de Envío: Validación cruzada (Data Comparison) entre inputs y modales informativos.

Tech Stack

    Lenguaje: Java 17

    Automatización: Selenium WebDriver (v4.13.0)

    Framework de Pruebas: TestNG & Cucumber (BDD)

    Gestión de Drivers: WebDriverManager

    Reportes: Extent Reports (Spark Reporter)

    CI/CD: GitHub Actions

Configuración del Pipeline (CI/CD)

El proyecto está integrado con GitHub Actions, permitiendo que las pruebas se ejecuten automáticamente en cada push.

Reportes y Evidencia

El framework genera reportes detallados después de cada ejecución mediante Extent Reports, Cucumber Reports.

Capturas de pantalla: Se adjuntan automáticamente al reporte sea de resultado exitoso o fallido.

Dashboard: Visualización del porcentaje de éxito de los escenarios.

Ubicación: reports/ o en caso de querer visualizarlos mediante pipelines estos quedan como artefactos adjuntos para descargar 

Cómo ejecutar localmente

Clona el repositorio:

    git clone https://github.com/tu-usuario/tu-repo.git

Asegúrate de tener instalados Java 17 y Maven.

Ejecuta las pruebas desde la terminal:

    mvn clean test

Revisa los resultados en la carpeta reports/.


![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Selenium](https://img.shields.io/badge/-selenium-%2343B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Cucumber](https://img.shields.io/badge/Cucumber-232121?style=for-the-badge&logo=cucumber&logoColor=white)
![GitHub Actions](https://img.shields.io/badge/github%20actions-%232088FF.svg?style=for-the-badge&logo=githubactions&logoColor=white)
![Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
