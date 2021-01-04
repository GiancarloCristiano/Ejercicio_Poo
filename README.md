## Ejercicio teórico Programa de Talento Junior 2020-2021
## Enunciado:
Crear las clases necesarias para administrar los Empleados de una Empresa. Cada empleado puede ser de distinto tipo como ser, Programador, Diseñador.

Estructura de clases:
-	Empresa: [Id, Nombre, Empleados]
-	Programador: [Id, Nombre, Apellido, Edad, Lenguaje en el que programa (pueden ser: PHP, NET o Python)]
-	Diseñador: [Id, Nombre, Apellido, Edad, Tipo de diseñador (pueden ser: Gráfico o Web)]

En Empresa, tengo que poder:
-	Agregar Empleados
-	Obtener un listado de todos los Empleados
-	Buscar por Id y obtener un Empleado
-	Obtener el promedio de edad de los empleados
---
- Nota: Demostrar conocimientos en el manejo de objetos. No es necesario realizar el ejercicio en un framework, solo las clases necesarias en conjunto con un ejemplo de instanciacíon. Una archivo por clase.
- Opcional: Esquema de Base de datos, Diagrama de clases.

-------


## Comentarios del autor

#### El ejercicio se realizó en JAVA, aplicando estructura de clases, herencia, enum, etc.
- Clase Empleado: Se utiliza como molde para crear los programadores y diseñadores. Es una clase concreta debido a que no se precisó que debía ser abstracta.
- Clase Programador y Diseñador: Incorporan enum para sólo dar las 3 y 2 opciones predefinidas en el enunciado.
- Clase Empresa: por seguridad, se retorna una copia de la lista de empleados. En el caso de querer devolver la original, el código sería:
```
    return this.empleados;
```
#### Otras observaciones:
- Para evitar problemas de codifación, se evitó en ciertos casos el uso de caracteres especiales como la Ñ o tildes.
- Por razones de seguridad, sólo se emplearon los métodos necesarios para cumplir con el enunciado. Por lo que se omitieron varios getter y setter, etc.