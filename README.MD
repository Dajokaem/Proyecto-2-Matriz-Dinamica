Proyecto II del Curso de Programacion III, parte del quinto semestre de la Carrera de Ingenieria en Sistemas. 
El proyecto es una matriz ortogonal, en otras palabras una matriz dinamica, que unicamente ocupe la memoria que realmente sea necesaria. 
Utilizar el programa es simple, es un programa de consola que se basa en menu de opciones, 
Para elegir una opcion, se ingresa el numero correspondiente para cada una de estas, 
Es un programa tipado, por lo que si se ingresa un caracter donde solicita un entero o viceversa, el programa finalizara su funcion, 
Este programa esta escrito en el lenguaje JAVA usando la version SE 19 para funcionar, pero puede correr sin problemas en JAVA 17, 
Es requerimiento tener instalado por lo menos la version 17 de JDK para que funcione, 

-Registrar un nuevo vehiculo, 
    Esta opcion se vera al principio, se mostrara como "estacionar un vehiculo", procedera a preguntarte la informacion sobre este, todo esto se mantiene en forma de Cadenas, 
    Luego, solicitara las coordenadas, horizontales y luego las verticales, 
    Procedera a crear los espacios necesarios para llegar a esa coordenada especifica, 
    El programa es dinamico, por lo que si se ingresa la coordenada (10, 10) no se crearan 100 espacios vacios, sino, solo los necesarios para llegar a tal coordenada, 
-Busqueda de un Vehiculo, 
    La busqueda de un Vehiculo funciona de dos maneras, la primer opcion es buscar las coordenadas especificas de un vehiculo o varios, realmente esta funcion es para saber donde puede o esta un vehiculo segun su placa, color, propietario etc. Esto lo hace recorriendo cada espacio lleno en la matriz, y compara el valor que necesitamos con el que nos fue dado, una vez encontrada una coincidencia, almacenara en una lista las coordenadas en pares (x, y) y las mostrara al usuario, sin importar si solo es una, y si esta vacio, el programa te lo dira
    Ya con las coordendas, la funcion Buscar coordenadas, de estar ocupadas desplegara en pantalla toda la informacion correspondiente al vehiculo estacionado en ese espacio. 
-Eliminar, 
    La eliminacion es simple, se hace mediante coordenadas que se pueden obtener usando la funcion buscar, una vez con estas, el programa ira directamente al espacio ingresado y eliminara los datos que se encuentren ahi, si esta vacio, te lo dira. 
Eso seria todo, 