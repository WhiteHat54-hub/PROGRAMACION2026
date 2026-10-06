import java.util.Scanner;

public class EJERCICIO4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 0 && edad <= 12) {
            System.out.println("Es una niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Es un adolescente");
        } else if (edad >= 18 && edad <= 29) {
            System.out.println("Es un joven");
        } else {
            System.out.println("Es un adulto");
        }
    }
}
