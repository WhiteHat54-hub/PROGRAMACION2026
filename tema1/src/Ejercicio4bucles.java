import java.util.Scanner;

public class Ejercicio4bucles {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N;

        System.out.print("Introduce un número estrictamente positivo");
        N = teclado.nextInt();

        while (N <= 0) {
            System.out.print("Número incorrecto. Introduce un número positivo: ");
            N = teclado.nextInt();
        }

        int suma = 0;

        for (int i = 1; i <= N; i++) {
            suma = suma + i;
        }

// Mostrar el resultado
        System.out.println("La suma de los " + N
                + " primeros números es: " + suma);

        teclado.close();
    }
}