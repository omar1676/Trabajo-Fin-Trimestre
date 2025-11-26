


import java.util.Random;
import java.util.Scanner;

public class adivinaNumeroJuego {

    private static Scanner sc = new Scanner(System.in);

    private static final String RESET = "\u001B[0m";
    private static final String CYAN  = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW= "\u001B[33m";
    private static final String BOLD  = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String BROWN = "\u001B[38;5;94m";
    public static void main(String[] args) {


        Random aleatorio = new Random();
        final String SI = "1";
        final String NO = "2";

        boolean reiniciar;

        System.out.println("El primer juego será: " + CYAN + "ADIVINA EL NÚMERO\n" + RESET +
                "Sencillo, ¿no? Para que a la segunda prueba has de jugar,\n" +
                "un número del 1 al 10 tendrás que adivinar."
        );

        do {
            int secreto = aleatorio.nextInt(10) + 1;
            int intentos = 3;
            int contador = 0;
            boolean acertado = false;

            for (int i = 1; i <= intentos; i++) {
                System.out.println("Indica el número que crees que es (1-10):");
                contador++;


                int n1 = sc.nextInt();
                sc.nextLine();

                if (n1 < 1 || n1 > 10) {
                    System.out.println(YELLOW + "VALOR FUERA DE RANGO. Cuenta como intento por gracioso y chistoso." + RESET);
                } else if (n1 == secreto) {
                    System.out.println(GREEN + "ACERTASTEEEEE. Con " + contador + " intentos.\n" + RESET +
                            "Te falta la última parte para conseguir tu objetivo sin que me pagues, ¿serías capaz?"
                    );
                    acertado = true;
                    break;
                } else if (n1 > secreto) {
                    System.out.println("No no, te has ido alto, joven.");
                } else {
                    System.out.println("No no, te has ido bajo, muchacho.");
                }
            }

            if (!acertado) {
                System.out.println(
                        RED + "Has agotado tus " + intentos + " intentos sin acertar.\n" +
                                "El anciano niega con la cabeza: 'Otro viajero devorado por el tiempo...'\n" +
                                "Te quedas atrapado en el siglo XVIII para siempre." + RESET
                );
            }


            if (!acertado) {
                String repetir;
                do {
                    System.out.println("¿Quieres reiniciar?");
                    System.out.println("Pulsa 1 para reiniciar el juego o 2 para rendirte.");
                    repetir = sc.nextLine().trim();

                    if (repetir.equals(SI)) {
                        System.out.println(YELLOW + "REINICIAMOS EL MINI-JUEGO..." + RESET);
                        reiniciar = true;
                    } else if (repetir.equals(NO)) {
                        System.out.println(RED + "Te acostumbras a esa vida y mueres a los 10 años después, por una viruela común.\n" + RESET +
                                BROWN + "⠀⠀⢀⣠⣴⣶⠾⠿⣯⣭⣿⣛⡒⠶⢤⣄⡀⠀⠀⠀\n" +
                                "⢠⡾⠋⠉⠀⠀⠀⠀⠀⠀⠈⠉⠙⠻⣾⣿⣿⣷⣦⡀\n" +
                                "⢿⡈⠂⢀⣀⣀⠀⢀⠀⠀⢀⣀⣀⠀⠀⠙⣿⣯⡽⣷\n" +
                                "⠸⡇⠀⡍⠀⢈⡇⠀⡏⠁⢸⠀⠈⣷⠀⢀⡾⣽⣿⠃\n" +
                                "⠀⣿⠀⢣⠶⣞⠁⠀⡇⠀⢸⣤⠴⠋⡀⣾⣿⣿⠃⠀\n" +
                                "⠀⢹⡄⠘⡄⠘⣧⢀⣇⡀⢸⡇⠀⠀⢸⢿⣿⠏⠀⠀\n" +
                                "⠀⠸⣇⠀⠁⢀⣀⣀⣉⣁⣈⠀⠀⠀⣿⣽⡿⠀⠀⠀\n" +
                                "⠀⠀⣿⠀⠀⠀⠤⠤⠤⠤⠀⠀⠀⢸⣿⣿⡇⠀⠀⠀\n" +
                                "⠀⢀⣹⣀⣂⣀⣈⣀⣀⣒⣂⡀⠀⣸⣸⡿⢳⡀⠀⠀\n" +
                                "⠀⡎⠚⠒⠂⣠⣤⣬⠭⠭⠭⠭⠭⠭⣵⣚⡿⢻⡆⠀\n" +
                                "⠸⠤⠴⠶⣶⣶⣀⣀⣐⣂⣀⣈⣁⣀⣸⠿⠛⠉⠀⠀\n" +
                                "REST IN PEACE  " + RESET
                        );
                        System.exit(0);
                        reiniciar = false;
                    } else {
                        System.out.println(YELLOW + "VALOR NO VÁLIDO. Escribe 1 o 2." + RESET);
                        reiniciar = false;
                    }
                } while (!repetir.equals(SI) && !repetir.equals(NO));
            } else {

                reiniciar = false;
            }

        } while (reiniciar);
    }


      public class Ahorcado {


        private static final String[] ESTADOS = {

                """
                  ___________
                  |         |
                  |         |
                            |
                            |
                            |
                            |
                            |
                            |
                            |
                            |
                            |
                ____________|_____
            """,


                """
                  ___________
                  |         |
                  |         |
                 ___        |
                 |_|        |
                            |
                            |
                            |
                            |
                            |
                            |
                            |
                ____________|_____
            """,


                """
                  ___________
                  |         |
                  |         |
                 ___        |
                 |_|        |
                  |         |
                  |         |
                  |         |
                  |         |
                            |
                            |
                            |
                ____________|_____
            """,


                """
                       ___________
                       |         |
                       |         |
                      ___        |
                      |_|        |
                       |         |
                  _____|         |
                       |         |
                       |         |
                                 |
                                 |
                                 |
                ____________|_____
            """,


                """
                     _____________
                     |         |
                     |         |
                    ___        |
                    |_|        |
                     |         |
                _____|_____    |
                     |         |
                     |         |
                    /          |
                   /           |
                  /            |
                 ____________|_____
            """,


                """
                     _____________
                     |         |
                     |         |
                    ___        |
                    |_|        |
                     |         |
                _____|_____    |
                     |         |
                     |         |
                    / |        |
                   /  |        |
                  /   |        |
                 ____________|_____
            """
        };

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Para que la pieza has de adivinar, el último juego has de jugar.");
            System.out.println("El anciano te mira serio y señala la horca del pueblo...\n");

            String palabra = "talisman";

            juego(palabra, sc);
        }

        public static void juego(String palabra, Scanner sc) {

            char[] progreso = new char[palabra.length()];
            boolean adivinado = false;
            int fallos = 0;
            final int MAX_FALLOS = ESTADOS.length; // 6 estados (0-5)


            for (int i = 0; i < progreso.length; i++) {
                progreso[i] = '_';
            }

            System.out.println("La palabra tiene " + palabra.length() + " letras.");
            System.out.println();

            while (!adivinado && fallos < MAX_FALLOS) {


                System.out.println(ESTADOS[fallos]);


                System.out.print("Progreso: ");
                for (char c : progreso) {
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.print("Introduce una letra: ");
                String linea = sc.nextLine().toLowerCase().trim();
                if (linea.isEmpty()) {
                    System.out.println("No has introducido nada.");
                    System.out.println();
                    continue;
                }
                char letra = linea.charAt(0);

                boolean acierto = false;

                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        if (progreso[i] == '_') { // solo si aún no estaba descubierta
                            progreso[i] = letra;
                            acierto = true;
                        }
                    }
                }

                if (!acierto) {
                    fallos++;
                    System.out.println("Fallaste. Intentos fallidos: " + fallos + "/" + MAX_FALLOS);
                }


                adivinado = true;
                for (char c : progreso) {
                    if (c == '_') {
                        adivinado = false;
                        break;
                    }
                }

                System.out.println();
            }


            if (!adivinado && fallos >= MAX_FALLOS) {
                System.out.println(ESTADOS[ESTADOS.length - 1]);
            }

            if (adivinado) {
                System.out.println("¡Felicidades! Adivinaste la palabra: " + palabra);
                System.out.println("El anciano asiente en silencio y te entrega la pieza para la CRONOS-1.");
            } else {
                System.out.println("Has perdido. La palabra era: " + palabra);
                System.out.println("Tu cuerpo queda colgando en la plaza del siglo XVIII...");
            }
        }
    }

}