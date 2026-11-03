public class arrays {

    public static void main(String[] args) {

        int[] numeros = {5, -3, 8, -1, 0, -7, 4, -2};

        int contador = 0;

        for (int i = 0; i < numeros.length; i++) {

            if (numeros [i] < 0){
                contador++;

                System.out.println("Hay " + contador + " numeros negativos en el array");
            }
        }
    }
}

