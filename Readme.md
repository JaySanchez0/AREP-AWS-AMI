# Lectura de archivo de 10 millones de plabras

### Presentado por:

Jeisson G. Sanchez R.

### Docker Hub 

[ver](https://hub.docker.com/repository/docker/jsanchez0/service-complex)

### Instalacion del servicio de docker

~~~
    sudo yum install docker
~~~

### Nota:

Los pasos que no se especifican se pueden omitir dando en el boton siguiente en la configuracion.

### Abrimos el archivo Crontab

~~~
    crontab -e
~~~

### Editamos el archivo crontab y ponemos lo siguiente

![img](img/crontab.PNG)

### Prueba en el browser

![img](img/browsertest.PNG)

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

### Creacion de un balanceador de carga

Vamos a la seccion balanceadores de carga y damos clic en el boton crear

![img](img/LoadBalancer/1.PNG)

Seleccionamos http/https

Ingresamos el nombre del balanceador de carga

![img](img/LoadBalancer/2.PNG)

Seleccionamos las zonas de disponibilidad

![img](img/LoadBalancer/3.PNG)

En configure Routing ingresamos el nombre

![img](img/LoadBalancer/4.PNG)


En la seccion review damos clic sobre crear

![img](img/LoadBalancer/5.PNG)


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