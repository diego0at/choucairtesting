# Reto Técnico de automatización

Proyecto en el que se crea una automatización, la cual se encarga de ingresar a la 
página de utest.com, acceder al formulario de registro y procede a llenarlo
para crear un nuevo usuario

## Comenzando 🚀

* Java - Importante instalar la versión 8 del Jdk (problemas con otras versiones)
* Gradle
* Instalar la última versión de IntelliJ.

### Pre-requisitos 📋

* Asegurarse de tener las variables de entorno configuradas
```
gradle -v
------------------------------------------------------------
Gradle 5.4.1
------------------------------------------------------------
```
* Al configurar el proyecto importante seleccionar la versión instalada en caso de tener más versión del jdk


## Ejecutando las pruebas ⚙️

### ¡ importante !
### Para que una prueba sea exitosa debemos tener en cuenta los siguientes detalles:

1. Asegurarnos de que el correo no esté registrado en la página, para esto modificamos el feature.
2. Completar el formulario al menos una vez - (desbloquear el detector de robots).
   * Probablemente este activado el Captcha y la prueba no está diseñada para desbloquearlo
   * Desbloquearlo manualmente una vez dejara pasar la prueba para las siguientes ejecuciones.
3. La automatización utiliza el autocompletado en el formulario de ubicación y dispositivos - verificar que el navegador cuenta con permisos para esta sección, generalmente estan activados por defecto.
4. Los principales inconvenientes fueron solventados (autocompletado del formulario - captcha) - Aun así, si falla a la primera podemos realizar un segundo intento revisando los pasos anteriores

## Construido con 🛠️

*   Descarga IntelliJ IDEA Community

*   Descarga Java JDK 1.8

*   Descarga GRADLE

## Versionado 📌

[SemVer](http://semver.org/) para el versionado.

## Autor ✒️

Proyecto elaborado por [diego0at](https://diego.iniciarweb.online/#BodySectionSkills).
___
* **Proyecto Utest** - *Elaborado bajo el material de* - [Choucair acadmey](https://operacion.choucairtesting.com/)
---