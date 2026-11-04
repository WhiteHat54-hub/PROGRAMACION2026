public class arrayEjercicio5 {

        public static void main(String[] args) {

            // Llamamos al metodo y le pasamos el tamaño del array
            generarArray(10);

        }

        // Metodo que genera y muestra un array
        public static void generarArray(int tamaño) {

            // Creamos el array con el tamaño indicado
            int[] numeros = new int[tamaño];

            // Rellenamos el array con numeros aleatorios
            for (int i = 0; i < tamaño; i++) {

                numeros[i] = (int) (Math.random() * 1001);

            }

            // Mostramos el contenido del array
            for (int i = 0; i < tamaño; i++) {

                System.out.println(numeros[i]);

            }

        }
    }

