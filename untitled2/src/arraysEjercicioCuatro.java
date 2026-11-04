public class arraysEjercicioCuatro {

    public static void main(String[] args) {

                // 1. Creamos una constante con la cantidad de numeros
                final int CANTIDAD = 6000;

                // 2. Creamos los arrays
                int[] numeros = new int[CANTIDAD];
                int[] contadores = new int[10];

                // 3. Variables para los calculos
                int suma = 0;
                int mayor = 0;
                double sumaPorcentajes = 0;

                // 4. Generamos los numeros aleatorios
                for (int i = 0; i < CANTIDAD; i++) {

                    numeros[i] = (int) (Math.random() * 101);

                    // Sumamos todos los numeros
                    suma += numeros[i];

                    // Obtenemos el ultimo digito
                    int digito = numeros[i] % 10;

                    // Contamos cuantas veces aparece
                    contadores[digito]++;

                }

                // 5. Calculamos la media
                double media = (double) suma / CANTIDAD;

                System.out.println("La media es: " + media);

                // 6. Buscamos el digito que mas se repite
                for (int i = 0; i < 10; i++) {

                    if (contadores[i] > mayor) {
                        mayor = contadores[i];
                    }
                }

                System.out.println("\nDigitos que mas se repiten:");

                for (int i = 0; i < 10; i++) {

                    if (contadores[i] == mayor) {
                        System.out.println("Digito: " + i);
                    }
                }

                // 7. Mostramos los digitos que no han aparecido
                System.out.println("\nDigitos que no han aparecido:");

                for (int i = 0; i < 10; i++) {

                    if (contadores[i] == 0) {
                        System.out.println("Digito: " + i);
                    }
                }

                // 8. Mostramos los contadores y porcentajes
                System.out.println("\nCONTADORES Y PORCENTAJES");

                for (int i = 0; i < 10; i++) {

                    double porcentaje = (double) contadores[i] * 100 / CANTIDAD;

                    sumaPorcentajes += porcentaje;

                    System.out.printf(
                            "El numero %d se ha repetido %d veces. Esto equivale a un %.2f%%\n",
                            i, contadores[i], porcentaje
                    );

                }

                // 9. Calculamos la media de porcentajes
                double mediaPorcentajes = sumaPorcentajes / 6;

                System.out.printf("\nLa suma de los porcentajes es: %.2f%%\n",
                        sumaPorcentajes);

                System.out.printf("La media de porcentajes es: %.2f%%\n",
                        mediaPorcentajes);

            }
        }



