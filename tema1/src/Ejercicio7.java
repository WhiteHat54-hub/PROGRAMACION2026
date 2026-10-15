import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);

    int cantidad;

            do {
                System.out.print("Cuántos números quieres introducir? ");
                cantidad = teclado.nextInt();

                if (cantidad <= 0) {
                    System.out.println("Error: introduce una cantidad mayor que 0");
                }
            } while (cantidad <= 0);

            double suma = 0;
                    for (int i = 1; i <= cantidad; i++) {
                        System.out.print("introduce el número " + i + ": ");
                        double numero = teclado.nextDouble();

                        suma = suma + numero;
                    }
    double media = suma / cantidad;
     System.out.println("La media de los números es: " + media);
     teclado.close();
           }
    }
