<h2>Cerveceria sistema Productor - Consumidor</h2>
<br>

- Para que el stock llegue a 0 es necesario como minimo 1 consumidor, aunque pueden utilizarse más.

- Los bloques synchronized deben utilizarse para garantizar la exclusion mutua, su funcion es 
evitar que 2 o mas hilos accedan al mismo tiempo al recurso compartido sobre el cual se esta trabajando.

- El recurso compartido es la seccion sobre la cual trabajaran los hilos, que contiene los datos
que manejan estos mismos. Si no se cumple que acceda solo 1 hilo a la vez a este recurso, puede
generar problemas en el manejo de los datos.

- Formas de instanciar un Thread:

  - Extender de la clase Thread: puede realizarse solo si la clase no debe heredar nada de otra clase padre
  
    Ejemplo: class Person extends Thread ...
    
  - Implementar la interfaz Runnable: si la clase debe extener de otra clase padre, y no puede hacerlo de Thread,
  se implementa la interfaz Runnable para poder seguir utilizando hilos.
  
    Ejemplo: class Viking extends Human implements Runnable ...
    
  - Instanciar directamente un nuevo Thread: dentro de este se instancia una clase que utilice Threads
    
    Ejemplo: Thread hilo = new Thread( new Class() );
