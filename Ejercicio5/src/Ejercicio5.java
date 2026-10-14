import java.util.Scanner;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int N;
        int contador = 0;

        do {
            System.out.print("Introduce un número (negativo para terminar): ");
            N = teclado.nextInt();

            if (N >= 0) {
                contador++;
            }
        } while (N >= 0);

        System.out.println("Has introducido " + contador + " números positivos");

        teclado.close();
        }
    }
