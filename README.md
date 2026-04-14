<h1 align="center">Selenium & Java Automation Suite</h1>

<p align="center">
  <img src="https://img.shields.io/github/actions/workflow/status/Jhonnatan738/Selenium-java/maven.yml?style=for-the-badge" />
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" />
  <img src="https://img.shields.io/badge/-selenium-%2343B02A?style=for-the-badge&logo=selenium&logoColor=white" />
  <img src="https://img.shields.io/badge/Serenity%20BDD-61B15A?style=for-the-badge&logo=serenitybdd&logoColor=white" />
</p>

## 📝 Sobre el Proyecto

Este repositorio consiste en un **framework de automatización robusto diseñado y construido desde cero**. A diferencia de las herramientas convencionales, esta solución ha sido estructurada pieza a pieza seleccionando librerías específicas para crear un ecosistema de pruebas escalable, profesional y orientado a resultados visuales.

## 🛠️ Tech Stack

| Herramienta | Tecnología |
| :--- | :--- |
| **Lenguaje** | ![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white) v21 |
| **Automatización** | ![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=flat-square&logo=selenium&logoColor=white) v4.13.0 |
| **Estrategia** | ![Cucumber](https://img.shields.io/badge/Cucumber-232121?style=flat-square&logo=cucumber&logoColor=white) BDD |
| **Gestión** | ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white) |
| **Pipeline** | ![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat-square&logo=github-actions&logoColor=white) |
| **Reporting** | Extent Reports & Serenity BDD |

---

## 🏗️ Arquitectura del Framework

La arquitectura sigue el patrón de diseño **Page Object Model (POM)** integrado con **BDD**, garantizando mantenibilidad y legibilidad:

* **Núcleo de Automatización:** Construido sobre Selenium WebDriver para una manipulación precisa del DOM.
* **Motor de BDD:** Implementación completa con Cucumber, permitiendo que los escenarios técnicos se traduzcan en lenguaje de negocio (**Gherkin**).
* **Gestión de Binarios:** Integración de `WebDriverManager` para automatizar la compatibilidad de drivers.
* **Reportería Avanzada:** Sistema personalizado mediante **Extent Reports**, configurado para generar dashboards interactivos y capturas de pantalla automáticas.

## 🥒 Escenarios de Prueba (Gherkin)

El framework valida flujos críticos de usuario en plataformas de prueba como **DemoQA**:

- ✅ **Validación de Formulario:** Verificación de campos obligatorios y estados de error.
- ✅ **Integridad de Datos:** Validación de formatos de email y límites de caracteres.
- ✅ **Lógica de Negocio:** Verificación de cambios de fecha y cálculos dinámicos.
- ✅ **Confirmación de Envío:** Validación cruzada (*Data Comparison*) entre inputs y modales.

## ⚙️ CI/CD & Evidencia

> [!TIP]
> **Integración Continua:** El proyecto se ejecuta automáticamente en cada `push` mediante GitHub Actions.

* **Capturas de pantalla:** Se adjuntan automáticamente al reporte (exitosos y fallidos).
* **Artefactos:** Los reportes HTML quedan disponibles como artefactos descargables en el historial de ejecuciones del Pipeline.

## 🚀 Ejecución Local

1. **Clona el repositorio:**
   ```bash
   git clone https://github.com/Jhonnatan738/Selenium-Java.git

Ejecuta las pruebas desde la terminal:
    Bash

    mvn clean install
    mvn test

    Resultados: Revisa la carpeta reports/ 

<p align="center">
Desarrollado por <a href="https://www.jhonnatanposada.com/" target="_blank">Jhonnatan Posada</a>
</p>
