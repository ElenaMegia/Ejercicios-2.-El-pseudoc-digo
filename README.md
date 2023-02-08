# Ejercicios-2. El pseudocódigo
Ejercicios de Técnicas de Programación Practica 2


https://github.com/ElenaMegia/Ejercicios-2.-El-pseudoc-digo.git

## Ejercicio 1


**¿Cuáles serán los valores de las variables a y b después de cada línea del siguiente algoritmo?**

~~~~~~~~~~~~~~~~~~
Algo ValoresDeLasVariables
variable a, b: entero
Inicio
a <- 3  
escribir("a = " & a)  
b<-a+5  
escribir("a = " & a & " y b = " & b)  
a<-7  
escribir("a = " & a & " y b = " & b)  
Fin 
~~~~~~~~~~~~~~~~~~
__Solución:__

a = 3
a = 3 y b = 8
a = 7 y b = 8

## Ejercicio 2

**¿Qué veremos al ejecutar el siguiente algoritmo?**
~~~~~~
Algo QueVeremos 
# ¿Qué veremos al ejecutar el siguiente algoritmo?  
Variable valor1, valor2: entero  
Variable cadena1: texto  
Constante CST: real <- 49,78  
Inicio  
   valor1 <- 92 % 8  
   valor2 <- 2 * valor1  
   cadena1 <- "Test"  
   escribir(cadena1 & " , valor2 = " & valor2)  
   escribir(valor1 & " # " & CST)  
Fin
~~~~~~
__Solución:__
Test , valor2 = 8
4 # 49.78

## Ejercicio 3

**¿Qué hace este algoritmo?**

~~~~~~
Algo QueHace  
# ¿Qué hace este algoritmo?  
Variable valor1, valor2: real  
Inicio  
   valor1 <- enter("Introduza un valor: ")  
   valor2 <- enter("Introduza otro valor: ")  
   # tratamiento 
   valor1 <- valor2  
   valor2 <- valor1  
   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)  
Fin 
~~~~~~
__Solución:__
Imprime los valores que se han introducido.

## Ejercicio 4

**Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.**

A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

Introduzca la distancia recorrida (km).

370

Introduzca el tiempo del recorrido (min).

240

Se ha desplazado a una velocidad de 92,5 km/h.

~~~~
static Scanner sc = new Scanner(System.in);
//Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.
public static void main(String[] args) {
double distancia, tiempo, velocidad;
System.out.println("Introduzca la distancia recorrida (km).");
distancia = sc.nextDouble();
System.out.println("Introduzca el tiempo del recorrido (min).");
tiempo = sc.nextDouble();
tiempo = tiempo / 60;
velocidad = distancia / tiempo;
System.out.println("Se ha desplazado a una velocidad de " + velocidad + " km/h.");
}
~~~~


