import java.util.Scanner;

public class ejercicio6 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();

        int divisor = 2;

        while (numero % divisor != 0) {
            divisor++;
        }

        System.out.println("El primer divisor es: " + divisor);
    }

}
