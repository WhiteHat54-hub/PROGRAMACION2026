
import java.util.Scanner;

public class arraysTres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las posiciones del array");
        int cantidad = sc.nextInt();

        int[] numeros = new int[cantidad];

        // Pedimos los números
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca el número " + (i + 1) + ":");
            numeros[i] = sc.nextInt();
        }

        // Inicializamos el mayor y el menor
        int mayor = numeros[0];
        int menor = numeros[0];

        int contadorMayor = 0;
        int contadorMenor = 0;
        int suma = 0;

        // Buscamos el mayor, el menor y calculamos la suma
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }

            suma = suma + numeros[i];
        }

        // Contamos las repeticiones
        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] == mayor) {
                contadorMayor++;
            }

            if (numeros[i] == menor) {
                contadorMenor++;
            }
        }

        // Calculamos la media
        double media = (double) suma / cantidad;

        // Mostramos los resultados
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        System.out.println("La media es: " + media);

        System.out.println("El mayor se repite " + contadorMayor + " veces.");
        System.out.println("El menor se repite " + contadorMenor + " veces.");

        sc.close();
    }
}
