//Inicia array de 6 posiciones, recoger el valor devuelto por el metodo y mostrarlo por pantalla

public class sumaPosicionesPares {
    public static void main(String[] args) {

        int[] miArrayDeEnteros = {5,1,2,6,4,9};
        int resultado = sumaPosicionesPares(miArrayDeEnteros);
        System.out.println("La suma es: " + resultado);
    }

    static int sumaPosicionesPares(int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                suma = suma + array[i];
            }

        }
        return suma;
    }
}


