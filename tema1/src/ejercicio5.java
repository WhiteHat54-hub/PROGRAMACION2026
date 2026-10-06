import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[4];
        double suma = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }

        double media = suma / 4;

        System.out.println("La media es: " + media);
        System.out.println("Números superiores a la media:");

        for (double numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }
        sc.close();
    }


}
