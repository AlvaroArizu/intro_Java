# Modulo 1
## Objetivos
1. ¿Qué es Java y para qué sirve?
2. JDK y JVM.
3. IDE.
4. Sintaxis.
5. Bloques y sentencias.
6. Variables.
7. Operadores.
## ¿Qué es Java?
Es una tecnología pensada para desarrollar aplicaciones de gran envergadura, altamente escalables, de gran integración con otras tecnologías y muy robustas.

### Principales características
- Lenguaje orientado a objetos
  - Respeta el paradigma de orientación a objetos, permitiendo utilizar sus fundamentos: herencia, polimorfismo, abstracción, encapsulamiento, etc.
- Sintaxis basada en C/C++
- Es multiplataforma
- Manejo automático de memoria
  - No hay que preocuparse por liberar memoria manualmente, ya que es un proceso que la misma tecnología se encarga de monitorear y, así, eliminar el espacio ocupado que no está siendo usado. Este proceso se denomina Garbage Collector.
- Evolución permanente

### Organización - Java está organizada en tres grandes áreas
1. Java Micro Edition (JME) - Mobile / Wireless
   - Este área tiene como objetivo el desarrollo de aplicaciones móviles tales como GPS, Handhelds (por ejemplo, la conocida Palm), celulares y otros dispositivos móviles programables.
2. Java Standard Edition (JSE)- Core / Desktop
   - Su propósito es el desarrollo de aplicaciones de escritorio, similares a las aplicaciones tipo ventanas creadas con Visual Basic o Delphi. Incluye la funcionalidad básica del lenguaje como manejo de clases, colecciones, entrada/salida, acceso a base de datos, manejo de sockets, hilos de ejecución, etc.
3. Java Enterprise Edition (JEE) - Enterprise / Server
   - Su objetivo es el desarrollo de aplicciones empresariales de gran envergadura. Contempla ambientes Web, como los manejados por servidores de aplicación. Las tecnologías principales incluidas en este área son Servlets, JSP y EJB, entre otras.

## Siglas
- J2ME = Java2 Micro Edition
- J2SE = Java2 Standard Edition
- J2EE = Java2 Enterprise Edition
- JRE = Java Runtime Environment
- JVM = Java Virtual Machine
- SDK = Software Development Kit
- JDK = Java Development Kit

## El compilador
- Incluido en el JDK
- Comando javac.exe
- Transforma archivos .java en .class

## Java Virtual Machine (JVM)
- No es un compilador, es un intérprete de Java.
- Archivos .class se denominan bytecodes.
- Bytecodes: instrucciones de máquina para la JVM.
- Interpreta el bytecode y lo convierte a código propio del CPU.
- JRE solo para ejecutar aplicaciones Java.
- Comando java.exe.