//leer entero positivo (String mensaje)
//leerDouble (String mensaje)
//leerEnteroEnRango (String mensaje, int min, int max)
//leerCaracter (String mensaje)
//leerCaracter(String mensaje)
//leerSiNo(String mensaje)

//leer entero positivo (String mensaje)

import java.util.Scanner;

public class MiEntradaSalida {

    public static int leerNumeroEnteroPositivo(String mensaje) {

        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);
        int leerNumeroEnteroPositivo;
        leerNumeroEnteroPositivo = Integer.parseInt(sc.nextLine());
        return leerNumeroEnteroPositivo;
    }

    static void main(String[] args) {
        int n = leerNumeroEnteroPositivo("Introduce un número");
    }

    //leerDouble (String mensaje)
    public static double leerDouble(String mensaje) {
        Scanner sc = new Scanner(System.in);
        System.out.println(mensaje);

        double leerDouble;
        leerDouble = Double.parseDouble(sc.nextLine());

        return leerDouble;
    }
}
