import java.util.Scanner;

public class EjercicioSinEnunciado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numero;
        int original;
        int inverso = 0;
        int cifra;

        System.out.print("Introduce un numero positivo: ");
        numero = teclado.nextInt();

        original = numero;

        while (numero > 0) {
            cifra = numero % 10;
            inverso = inverso * 10 + cifra;
            numero = numero / 10;
        }

        if (original == inverso) {
            System.out.println("El numero es capicua.");
        } else {
            System.out.println("El numero no es capicua.");
        }
    }
}