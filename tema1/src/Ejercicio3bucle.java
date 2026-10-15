import java.util.Scanner;

public class Ejercicio3bucle {
        public static void main(String[] args){
            Scanner teclado = new Scanner(System.in);

            int cantidad;

            System.out.print("¿Cuántos números quieres introducir? ");
            cantidad = teclado.nextInt();

            while (cantidad <=0){
                System.out.print("La cantidad debe ser mayor que 0. inténtelo de nuevo");
            }
        }
}
