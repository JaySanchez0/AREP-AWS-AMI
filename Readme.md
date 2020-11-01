# Lectura de archivo de 10 millones de plabras

### Presentado por:

Jeisson G. Sanchez R.

### Docker Hub 

[ver](https://hub.docker.com/repository/docker/jsanchez0/service-complex)

### Instalacion del servicio de docker

~~~
    sudo yum install docker
~~~

### Abrimos el archivo Crontab

~~~
    crontab -e
~~~

### Editamos el archivo crontab y ponemos lo siguiente

![img](img/crontab.PNG)

### Algunas pruebas

**Broser Test**

![img](img/browsertest.PNG)

**Pruebas de carga usando JMETER**

1. Creacion de un grupo de hilos para peticiones

![img](img/threads.PNG)

En esta imagen podemos ver que en cada iteracion envia 100 peticiones, en 30 iteraciones, por lo tanto tenemos un total de 3000 usuarios por el total de la prueba.

2. Creamos la peticion http

![img](img/httprequest.PNG)

Le estamos diciendo al programa que le solicite a nuestro programa que consulte cuantas oaciones aparece la palabra "york".

3. Creamos un listener para este ejemplo un "result view tree"

![img](img/tree.PNG)

4. Corremos las pruebas y esperamos se sature la memoria o la cpu

![img](img/peticiones.PNG)

![img](img/recursos1.PNG)

![img](img/recursos2.PNG)


### Creamos una imagen de la maquina virtual actual

Seleccionamos la maquina virtual sobre la cual realizamos la configuracion

![img](img/crearImagen.jpg)


Luego ponemos el nombre de la imagen y esperemos a que sea creada.


![img](img/imageCreateView.PNG)


Ahora creamos una maquina virtual con nuestra imagen.

![img](instanceImage.PNG)

### Creacion de Template

Seleccionamos la maquina sobre la cual queremos crear el template para depliegue

![img](img/Template/1.jpg)

Llenamos el nombre, la descripcion del template, y que nos ayude con la creacion del grupo de auto escalado.

![img](img/Template/Captura.PNG)

Seleccionamos VPC para nuestra networking

![img](img/Template/Captura2.PNG)

Modificamos en opciones avanzadas los sisguientes items

![img](img/Template/Captura3.PNG)

Ingresamos a nuestro Template y en el item acciones seleccionamos crear instancia para template

![img](img/Template/FileTemplate.PNG)

![img](img/Template/launchInstance.PNG)


Vamos a la instancia

![img](img/Template/goInstance.PNG)

Vamos a probar que nuestra instancia funcione

![img](img/Template/test.PNG)


### Creacion de Grupo de Auto Escalamiento

Ingresamos los datos del Template en que Se desea crear unicamente modificamos el template, y las subredes, en los demas se puede saltar.

![img](img/AutoScaling/1.PNG)

![img](img/AutoScaling/2.PNG)


### Ahora sobre la Marcha vamos a modificarlo


Seleccionamos el numero de  instancias minimo y maximo (Inicio del grupo de escalamiento)

![img](img/AutoScaling/size.PNG)

Por facilidad utilizamos un balanceador de carga (Inicio del grupo de escalamiento)

![img](img/AutoScaling/loadBalancer.PNG)

Ahora vamos a la seccion autoscaling de nuestro grupo y definimos una regla de escalamiento

![img](img/AutoScaling/policy.PNG)




### Video evidencia de auto escalado

[Ver](https://www.youtube.com/watch?v=hua5Cfj6vzE&feature=youtu.be)