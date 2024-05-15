# lab-solid-iron-hack
Laboratorio - principios de SOLID. Iron hack

# Step 1
Se revisa el pseudocodigo proporcionado y se identifican areas de oportunidad que permite implementar los principios SOLID.

# Step 2
Issues encontrados:
Una clase en la cual se realizan diverdsas operaciones, responsabilidades y se encuentra fuertemente acoplada. La clase no hace uso de ningún patrón de diseño violando los  principios SOLID.
Principio de Responsabilidad Única. La clase SystemManager prácticamente hacía todas las responsabilidades.
Principio Abierto/Cerrado (OCP): Cada cambio o nuevo tipo de pedido, se requeriría hacer cambios a la clase.
Principio de Sustitución de Liskov (LSP): No se hacía uso de este principio ya que no contaba con una super clase o jerarquía de clases que permitieran hacer uso de polimorfismo.
Principio de Segregación de Interfaces (ISP): No hacía uso de este princpio, no se utilizaban interfaces, lo que no permitia no depender de implementaciones o forzar a implementar métodos o funcionalidades que no se usan.
Principio de Inversión de Dependencia (DIP): Dedepencía de una implementación concreta, no permitía extender funcionalidad y el mantenimiento de dicha clase sería complicado a manera que creciera en funcionalidad.

Los beneficios para arquitectura del sistema :
Mantenibilidad: Con las responsabilidades divididas en clases específicas, el código es más fácil de entender, mantener y modificar.
Extensibilidad: Gracias al uso del patrón strategy y a la dependencia de interfaces, es fácil agregar nuevos tipos de pedidos y servicios sin necesidad de modificar el código existente.
Reusabilidad: Las clases de servicio son independientes y pueden ser reutilizadas en otros contextos, promoviendo un diseño modular.
Al alinearnos a los princpios SOLID: Un sistema puedehacer uso de un diseño más robusto, flexible y fácil de mantener.

# Step 3

Documentar cambios
Crear interfaces para los diferentes servicios o responsabilidades:
<img width="1368" alt="Captura de pantalla 2024-05-15 a la(s) 5 41 21 p m" src="https://github.com/ventura-gorostieta/lab-solid-iron-hack/assets/97199485/a5426451-3bec-4ddf-b388-b787fc87bfe2">


Implementar las clases concretas de servicio:
<img width="1363" alt="Captura de pantalla 2024-05-15 a la(s) 5 39 44 p m" src="https://github.com/ventura-gorostieta/lab-solid-iron-hack/assets/97199485/08e004c3-79ca-46c4-a243-e36a6597cb1c">


Refactorizar SystemManager para usar estas interfaces. Ahora SystemManager ya no se encarga de tareas especificas, por lo que ahora se delega la responsabilidad a clases especificas.
<img width="1379" alt="Captura de pantalla 2024-05-15 a la(s) 5 39 58 p m" src="https://github.com/ventura-gorostieta/lab-solid-iron-hack/assets/97199485/ce8db0fd-3ec7-43e2-891a-a302f1b3609d">


SystemManager ahora está abierta a la extensión, lo que permite hacer cambios sin afectar a SystemManager u otros funcionalidades del sistema. Se ha implementado el patrón strategy lo que permite eliminar el uso de sentencias if a medida que crece el sistema, y ahora se implementan interfaces en  lugar de implementaciones concretas.
<img width="1363" alt="Captura de pantalla 2024-05-15 a la(s) 5 43 16 p m" src="https://github.com/ventura-gorostieta/lab-solid-iron-hack/assets/97199485/d900808f-8e59-40c3-9539-7f4e6f5da31d">


#Ejecución.
Se muestra un ejemplo de como ahora podemos hacer uso de la aplicación e invocar las 2 estrategias que se definieron con los cambios: Lenguaje utilizado : Java, en el code se agrega un poco de javadoc.
<img width="934" alt="Captura de pantalla 2024-05-15 a la(s) 5 36 56 p m" src="https://github.com/ventura-gorostieta/lab-solid-iron-hack/assets/97199485/90ff9284-bc90-4934-9ac0-f87329115b1e">

