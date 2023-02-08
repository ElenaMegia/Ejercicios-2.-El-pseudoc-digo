//Algo QueHace
//# ¿Qué hace este algoritmo?
//Variable valor1, valor2: real
//Inicio
//   valor1 <- enter("Introduza un valor: ")
//   valor2 <- enter("Introduza otro valor: ")
//   # tratamiento
//   valor1 <- valor2
//   valor2 <- valor1
//   escribir("valor1 = " & valor1 & "; valor2 = " & valor2)
//Fin


import java.util.Scanner;

public class Ejercicio3 {
    //Crear scanner
    static Scanner sc = new Scanner(System.in);
    public static void Ejercicio3metodo() {
        double valor1, valor2;
        System.out.println("Introduza un valor: ");
        valor1 = sc.nextDouble();
        System.out.println("Introduza otro valor: ");

        valor2 = sc.nextDouble();
        // tratamiento
        valor1 = valor2;
        valor2 = valor1;
        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
    }
}
