import java.util.Scanner;

public class EjercicioProgramacionEstructurada2Ejercicio10 {

    public static void main(String[] args){

    Scanner teclado = new Scanner(System.in);

    int numero;

    do {
        System.out.println("Introduce un número entero positivo o cero");

        while (!teclado.hasNextInt()) {
            teclado.next();
            System.out.print("Introduce un número positivo o cero");
        }

        numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("Error: el número no puede ser negativo");
        }

    } while (numero < 0);

            long factorial = 1;

            for (int i = 1; i <= numero; i++){
                factorial = factorial * i;
            }
                System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
