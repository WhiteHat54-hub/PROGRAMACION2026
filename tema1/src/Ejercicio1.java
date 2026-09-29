import java.util.Scanner;

public class Ejercicio1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        if (numero % 2 == 0){
            System.out.println("El número es par");
        }
        else {
            System.out.println("El número es impar");
        }
    }
}
