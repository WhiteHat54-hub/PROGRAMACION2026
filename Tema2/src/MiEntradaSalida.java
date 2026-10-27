
import java.util.Scanner;

public class MiEntradaSalida {

    public static String leerCadena(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("%s: ", mensaje);
        return sc.nextLine();
    }

    public static int leerEnteros(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.printf("%s: ", mensaje);
            num = Integer.parseInt(sc.nextLine());
        } while (num <= 0);

        return num;
    }

    public static void main(String[] args) {
        String nombre = leerCadena("¿Cómo te llamas?");
        System.out.println("Hola " + nombre);

        int numero = leerEnteros("Introduce un número positivo");
        System.out.println("Has introducido: " + numero);
    }
}
