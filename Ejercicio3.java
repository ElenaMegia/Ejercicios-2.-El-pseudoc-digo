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


import javax.swing.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        double valor1, valor2;
        valor1 = Double.parseDouble(JOptionPane.showInputDialog("Introduza un valor: "));
        valor2 = Double.parseDouble(JOptionPane.showInputDialog("Introduza otro valor: "));
        // tratamiento
        valor1 = valor2;
        valor2 = valor1;
        System.out.println("valor1 = " + valor1 + "; valor2 = " + valor2);
    }
}
