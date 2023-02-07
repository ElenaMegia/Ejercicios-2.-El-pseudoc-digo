//¿Qué veremos al ejecutar el siguiente algoritmo?
//
//Algo QueVeremos
//# ¿Qué veremos al ejecutar el siguiente algoritmo?
//Variable valor1, valor2: entero
//Variable cadena1: texto
//Constante CST: real <- 49,78
//Inicio
//   valor1 <- 92 % 8
//   valor2 <- 2 * valor1
//   cadena1 <- "Test"
//   escribir(cadena1 & " , valor2 = " & valor2)
//   escribir(valor1 & " # " & CST)
//Fin


public class Ejercicio2 {
    public static void main(String[] args) {
        int valor1, valor2;
        String cadena1;
        final double CST = 49.78;
        valor1 = 92 % 8;
        valor2 = 2 * valor1;
        cadena1 = "Test";
        System.out.println(cadena1 + " , valor2 = " + valor2);
        System.out.println(valor1 + " # " + CST);
    }
}
