package Ejemploejercicioclase;

import java.util.Scanner;

public class ejercicio2 {
    static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            System.out.print("Introduce el primer número: ");
            int numero1 = teclado.nextInt();

            System.out.print("Introduce el segundo numero: ");
            int numero2 = teclado.nextInt();

            if (numero1 == numero2){
                System.out.println("Los dos números son iguales.");
            }
            else if (numero1 > numero2) {
                System.out.println("El primer número es mayor que el segundo.");
            } else {
                System.out.println("El primer número es menor que el segundo.");
        }

            teclado.close();
    }
}
