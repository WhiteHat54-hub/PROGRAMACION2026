public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            int hora;
            int minutos;
            int segundos;

            int horasSumar;
            int minutosSumar;
            int segundosSumar;

            System.out.print("Introduce la hora base: ");
            hora = teclado.nextInt();

            System.out.print("Introduce los minutos base: ");
            minutos = teclado.nextInt();

            System.out.print("Introduce los segundos base: ");
            segundos = teclado.nextInt();

            System.out.print("¿Cuántas horas quieres sumar?: ");
            horasSumar = teclado.nextInt();

            System.out.print("¿Cuántos minutos quieres sumar?: ");
            minutosSumar = teclado.nextInt();

            System.out.print("¿Cuántos segundos quieres sumar?: ");
            segundosSumar = teclado.nextInt();

            // Convertir todo a segundos
            int totalSegundos = hora * 3600
                    + minutos * 60
                    + segundos
                    + horasSumar * 3600
                    + minutosSumar * 60
                    + segundosSumar;

            // Tener en cuenta el cambio de día
            totalSegundos = totalSegundos % 86400;

            // Convertir los segundos a horas, minutos y segundos
            hora = totalSegundos / 3600;
            minutos = (totalSegundos % 3600) / 60;
            segundos = totalSegundos % 60;

            System.out.printf("La hora resultante es: %02d:%02d:%02d%n",
                    hora, minutos, segundos);
        }
