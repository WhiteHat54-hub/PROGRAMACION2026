import java.util.Scanner;

public class Ejercicio8RelacionProblemas2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double numero;
        double menor;
        char respuesta;

        System.out.print("Introduce un número: ");
        numero = teclado.nextDouble();

        menor = numero;

        do {
            System.out.print("¿Desea introducir más números (S/N)? ");
            respuesta = teclado.next().toUpperCase().charAt(0);

            while (respuesta != 'S' && respuesta != 'N') {
                System.out.print("Respuesta incorrecta. Introduce S o N: ");
                respuesta = teclado.next().toUpperCase().charAt(0);
            }

            if (respuesta == 'S') {
                System.out.print("Introduce un número: ");
                numero = teclado.nextDouble();

                if (numero < menor) {
                    menor = numero;
                }
            }

        } while (respuesta == 'S');

        System.out.println("El menor de los números introducidos es: " + menor);

        teclado.close();
    }
}