import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    Scanner teclado = new Scanner(System.in);

    //Crear metodo principal
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.ejercicios();
    }

    public void ejercicios() {
        int opcion = 0;

        do {
            try {
                menu();
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        Ejercicio1 ejercicio1 = new Ejercicio1();
                        ejercicio1.Ejercicio1metodo();
                        break;
                    case 2:
                        Ejercicio2 ejercicio2 = new Ejercicio2();
                        ejercicio2.Ejercicio2metodo();
                        break;
                    case 3:

                        Ejercicio3 ejercicio3 = new Ejercicio3();
                        ejercicio3.Ejercicio3metodo();
                        break;
                    case 4:
                        Ejercicio4 ejercicio4 = new Ejercicio4();
                        ejercicio4.Ejercicio4metodo();
                        break;
                    case 5:
                        System.out.println("Gracias.");
                        break;
                    default:
                        System.out.println("Intente otra vez.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduzca una de las opciones señaladas.");
                teclado.nextLine();
            }
        } while (opcion != 5);

    }

    private void menu() {
        System.out.println("¿Qué quieres hacer?");
        System.out.println("1 - Ejercicio1");
        System.out.println("2 - Ejercicio2");
        System.out.println("3 - Ejercicio3");
        System.out.println("4 - Ejercicio4");
        System.out.println("5 - Salir");
    }
}