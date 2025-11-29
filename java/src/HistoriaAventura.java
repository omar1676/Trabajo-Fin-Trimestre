
import java.util.Random;
import java.util.Scanner;

public class HistoriaAventura {

    private static final Scanner sc = new Scanner(System.in);

    private static final String RESET = "\u001B[0m";
    private static final String CYAN  = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW= "\u001B[33m";
    private static final String BOLD  = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String BROWN = "\u001B[38;5;94m";

    public static void main(String[] args) {
        banner();
        introduccion();
        decisiones();
        maquinaDelTiempo();
        actoNumero1();
        colores();
        sigloXVIII();
        laTienda();
        adivinaNumero();
        ahorcado();
        pregunta1();
    }

    public static int leerNumero(int min, int max) {
        while (true) {
            String entrada = sc.nextLine().trim();

            if (entrada.isEmpty()) {
                System.out.println(RED + ">> No has escrito nada." + RESET);
                continue;
            }

            boolean esNumero = true;
            for (int i = 0; i < entrada.length(); i++) {
                char c = entrada.charAt(i);
                if (c < '0' || c > '9') {
                    esNumero = false;
                    break;
                }
            }

            if (esNumero) {

                int numero = Integer.parseInt(entrada);
                if (numero >= min && numero <= max) {
                    return numero;
                } else {
                    System.out.println(YELLOW + ">> Por favor, introduce un número entre " + min + " y " + max + "." + RESET);
                }
            } else {
                System.out.println(RED + ">> Eso no es un número válido. Solo dígitos." + RESET);
            }
        }
    }

    static void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {

        }
    }

    static void reiniciar() {
        final String SI = "1";
        final String NO = "2";

        while (true) {
            String repetir = sc.nextLine().trim();

            if (repetir.equals(SI)) {
                System.out.println(YELLOW + "REINICIAMOS..." + RESET);
                return;
            } else if (repetir.equals(NO)) {
                System.out.println(
                        RED + "Te acostumbras a esa vida y mueres a los 10 años después, por una viruela común. " + RESET + "\n" +
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
            } else {
                System.out.println("Valor no válido. Escribe 1 o 2.");
            }
        }
    }

    public static void escribirLinea(String texto, int pausa) {
        System.out.println(texto);
        esperar(pausa);
    }

    public static void escribirLinea(String texto) {
        escribirLinea(texto, 500);
    }

    public static void escribirLento(String texto, int pausaPorLetra) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            esperar(pausaPorLetra);
        }
        System.out.println();
    }

    public static void separador(String titulo) {
        System.out.println();
        System.out.println("══════════════════════════════════════════════════════════════");
        System.out.println("   " + titulo);
        System.out.println("══════════════════════════════════════════════════════════════");
        System.out.println();
        esperar(500);
    }

    public static void colores() {
        escribirLinea(GREEN + ">> ENERGÍA TEMPORAL ESTABLE" + RESET, 500);
        escribirLinea(RED + ">> ADVERTENCIA: POSIBLE OMISIÓN O AVERÍA DE PIEZAS" + RESET, 600);
        escribirLinea(CYAN + ">> Sincronizando coordenadas espacio-tiempo..." + RESET, 600);
        escribirLinea(BOLD + ">> Sistema intermitente activado" + RESET, 700);
    }

    private static void banner() {
        String title = CYAN + "=== CRONOS-1: PROTOCOLO DE SALTO TEMPORAL ===" + RESET;
        escribirLinea(title, 600);
        System.out.println();
    }

    public static void maquinaDelTiempo() {
        separador("ACTO II · LA MÁQUINA DEL TIEMPO");

        String maquina =
                " _______________________________________\n" +
                        "/---------------------------------------|\n" +
                        "|   ⚙  MÁQUINA TEMPORAL \"CRONOS-1\" ⚙     |\n" +
                        "|-----------------------------------------|\n" +
                        "|   ║█████████████████████████████████║   |\n" +
                        "|   ║     ENERGÍA TEMPORAL:  99%      ║   |\n" +
                        "|   ║     ESTABILIDAD:       OK       ║   |\n" +
                        "|-----------------------------------------|\n" +
                        "|   [::::::|| ACTIVANDO PORTAL ||::::::]  |\n" +
                        "|_________________________________________|\n" +
                        "          /     /      /     /\n" +
                        " ~~~~~~~—~~~~~⚡~~~~~—~~~~~⚡~~~~~—~~~~~\n" +
                        "          ✦   ✦   ✦  ✦   ✦   ✦   ✦\n" +
                        "     >>> INICIO DEL VIAJE TEMPORAL <<<\n";

        System.out.println(maquina);
        esperar(700);
    }

    public static void introduccion() {
        separador("PRÓLOGO");

        escribirLinea(
                "En un centro no muy lejos de Alcorcón Central, un muchacho de DAM (dirigido por Dani)", 650);
        escribirLinea(
                "y un muchacho de ASIR (dirigido por Nuria) crearon una máquina capaz de dar saltos temporales", 650);
        escribirLinea(
                "y surfear los flujos temporales.", 650);
        escribirLinea(
                "Aitor andaba con fiebre y mareos, y Dani debía contestar unas llamadas. Tenían 3 horas libres y,", 700);
        escribirLinea(
                "en vez de trabajar en su proyecto, dudaron si probar la máquina del tiempo y adentrarse en el flujo temporal.", 800);
        System.out.println("________________________________________________________________________________");
        System.out.println();
    }

    public static void decisiones() {
        separador("ACTO I · LA DECISIÓN");

        escribirLinea("Elige entre iniciar (1) o estudiar (2)", 500);
        escribirLinea("¿Qué decides? ¿Escaparte a una aventura como mandan los cánones,", 600);
        escribirLinea("o quedarte avanzando en el proyecto?", 600);
        System.out.print("> ");

        int decision = leerNumero(1, 2);

        if (decision == 1) {
            escribirLinea(GREEN + "Has elegido INICIAR." + RESET, 600);
            System.out.println();
        } else {
            escribirLinea(YELLOW + "Has elegido ESTUDIAR." + RESET, 600);
            escribirLinea("Los chicos decidieron seguir con el proyecto final. Entre tantos ejercicios evaluables,", 650);
            escribirLinea("se olvidaron por completo de la máquina del tiempo. Fin de la historia (por ahora).", 700);
            System.exit(0);
        }
        System.out.println();
    }

    public static void actoNumero1() {

        String[][] alumnosXTART = {
                {"omar", "aitor", "dani", "laura", "ivan", "javier", "sergio", "diego", "juan", "alvaro"},
                {"nuria", "helen", "carlos", "alejandro", "gonzalo", "noemi", "renzo", "clemente", "berta"}
        };

        String claseXtart;

        do {
            System.out.println("¿Cuál es tu curso en el centro? (DAM / ASIR)");
            claseXtart = sc.nextLine().trim();

            if (!claseXtart.equalsIgnoreCase("DAM") &&
                    !claseXtart.equalsIgnoreCase("ASIR")) {

                System.out.println(YELLOW + "Curso no válido. Escribe DAM o ASIR." + RESET);
            }
        } while (!claseXtart.equalsIgnoreCase("DAM") &&
                !claseXtart.equalsIgnoreCase("ASIR"));

        int fila = claseXtart.equalsIgnoreCase("DAM") ? 0 : 1;

        boolean nombreCorrecto = false;
        String nombreAlumno;

        do {
            System.out.println("¿Nombre del que viajará?");
            nombreAlumno = sc.nextLine().trim().toLowerCase();

            for (int i = 0; i < alumnosXTART[fila].length; i++) {
                String alumno = alumnosXTART[fila][i];
                if (alumno.equalsIgnoreCase(nombreAlumno)) {
                    nombreCorrecto = true;
                    break;
                }
            }

            if (!nombreCorrecto) {
                System.out.println(RED + "Ese nombre no está registrado en XTART en ese curso." + RESET);
            }

        } while (!nombreCorrecto);

        System.out.println("¿Cuál es tu año de nacimiento? (1950 - 2010)");
        int anioNacimiento = leerNumero(1950, 2010);

        String maquina =
                " _______________________________________\n" +
                        "/---------------------------------------|\n" +
                        "|   ⚙  MÁQUINA TEMPORAL \"CRONOS-1\" ⚙     |\n" +
                        "|-----------------------------------------|\n" +
                        "|   ║████████████████████████████████ ║   |\n" +
                        "|   ║     ENERGÍA TEMPORAL:  96%      ║   |\n" +
                        "|   ║     ESTABILIDAD:       OSCILA   ║   |\n" +
                        "|-----------------------------------------|\n" +
                        "|   [::::::|| DESVIACIÓN EN EL FLUJO ||::::]|\n" +
                        "|_________________________________________|\n" +
                        "          /     /      /     /\n" +
                        " ~~~~~~~—~~~~~⚡~~~~~—~~~~~⚡~~~~~—~~~~~\n" +
                        "          ✦   ✦   ✦  ✦   ✦   ✦   ✦\n" +
                        "     >>> ¡ANOMALÍA DETECTADA! <<<\n";

        esperar(1000);
        System.out.println();
        System.out.println(
                nombreAlumno + " de " + claseXtart.toUpperCase() +
                        " cogió sus cosas y se aventuró hacia " + anioNacimiento + ".\n" +
                        "Inició su máquina y comenzó a viajar.\n" +
                        "Una ráfaga del flujo temporal desvía la CRONOS-1 exactamente 0,5 cm a la derecha."
        );

        System.out.println(maquina);
        esperar(1500);
    }

    public static void sigloXVIII() {

        separador("ACTO IV · SIGLO XVIII");

        final String OPCION_BAR = "1";
        final String OPCION_TIENDA = "2";
        final String BOTELLA = "3";
        final String MANOS = "4";
        final String SI = "1";
        final String NO = "2";

        String decisiones = "";
        String lucha = "";
        String reiniciar = "";

        do {
            escribirLinea(
                    "Salió de la nave y se puso a investigar sobre qué fallaba, qué pasó y qué había que conseguir.", 650);
            escribirLinea(
                    "La máquina ha sufrido unos daños en algunas piezas casi irreversibles.", 650);
            escribirLinea(
                    "Por suerte, no ha tocado el motor ni la fuente de alimentación; cogió el manual en caso de emergencia y se puso manos a la obra.", 750);
            escribirLinea(
                    "Ves dos tiendas: una es un bar y la otra es una tienda de empeños. ¿Dónde decides entrar?", 700);
            escribirLinea(
                    BOLD + "EL BAR (1) " + RESET + GREEN + "TIENDA EMPEÑOS (2)" + RESET, 650);

            decisiones = sc.nextLine().trim();

            if (decisiones.equals(OPCION_BAR)) {
                do {
                    escribirLinea(
                            "Al entrar al bar te motivas y pides una Coca-Cola. El camarero, atónito por la bebida extraña que has pedido,", 700);
                    escribirLinea(
                            "te sirve un trago de cebada, que era lo que se solía tomar en esa época. Te das cuenta de que el euro no te vale", 750);
                    escribirLinea(
                            "y empiezas a medio escaparte; se dan cuenta y empiezan a amenazarte. No te queda otro remedio que pelear.", 750);
                    escribirLinea(
                            BOLD + "¿QUÉ DECIDES?" + RESET + "  Con una botella (" + BOTELLA + ")   |   Con las manos (" + MANOS + ")", 700);
                    System.out.print("> ");
                    lucha = sc.nextLine().trim();

                    if (lucha.equals(BOTELLA)) {
                        System.out.println(
                                BROWN + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⡤⠂⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⠃⣀⣤⣴⡆⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣶⣿⡿⠋⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⡿⠋⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⣠⡾⠋⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⣰⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⠟⠋⣉⣉⣉⣉⣥⣴⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⣠⣾⣿⣿⣿⠟⢁⣴⠞⠋⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⢠⣶⣾⣿⣿⣿⠟⠁⣠⡿⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⢻⣧⠀⠙⢿⣇⣠⡾⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠻⣷⣤⣀⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠉⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET + "\n" +
                                        "Rompes la botella contra la barra, amenazas con clavársela a alguien y escapas hacia la tienda de empeños.\n" +
                                        "________________________________________________________________________________"
                        );
                        decisiones = OPCION_TIENDA;
                        break;

                    } else if (lucha.equals(MANOS)) {
                        System.out.println(
                                "Intentas ser legal y defenderte a puñetazo limpio, pero estás en el siglo XVIII... ¿qué esperabas?\n" +
                                        RED + "MUEREEEEEEES ACUCHILLADO " + RESET + "\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡤⣤⡀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠴⠶⣄⠀⣸⣷⣄⠛⢦⡀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣄⣳⠀⣤⣸⣿⡁⠈⣻⣷⣶⣿⠆⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⠁⠀⣨⢿⣶⣉⣹⣉⣷⣶⣿⡟⠉⠉⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡞⠉⣳⡀⢿⡀⠉⠀⠁⠀⠈⠻⣿⡄⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣧⡜⠁⠈⠳⣿⢶⡤⣤⣶⠂⠀⠈⠻⡄⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡟⠉⠙⠦⣤⣤⣿⣩⠟⣷⠿⠍⠁⠀⠀⣷⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣾⣷⣄⡀⣹⣶⡤⣔⣪⣧⡜⢳⣾⠃⠀⠀⠀⠀⠀⡇⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣻⣿⣿⣏⡉⠻⣦⣞⣩⠟⣿⢿⡀⠀⠀⠀⠀⠀⡿⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⣯⣌⠻⢿⣿⣶⣿⠿⡁⠀⠘⠈⠁⠀⠀⠀⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⣿⣿⣯⠙⠳⣄⠙⣿⣿⣦⣱⣄⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⣤⠀⠀⠀⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⠞⠕⠛⣿⣿⣿⡏⠀⣰⠟⠁⠀⠀⠀⠀⠀⠀⠀⠙⣦⣀⡤⠖⠉⠀⠀⠀⢀⣾⣷⠀⠀\n" +
                                        "⠀⠀⠀⠀⠀⠀   ⢀⣴⣿⣿⣿⡇⠀⠀⠀⠀⣻⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣿⣆⠀⣠⢾⡻⢦⡳⣜⢮⡻⠆⠀\n" +
                                        "⠀⠀⠀ ⠀⠀⢠⣿⣿⣿⣿⣿⡇⠀⠀⠀⣴⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⣧⣼⠿⣝⢦⡙⢦⡙⢮⠳⣝⠂⠀\n" +
                                        "⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⠇⠀⣠⡾⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⢷⣌⡻⣮⡳⣝⢦⡝⢮⡳⣌⠃⠀\n" +
                                        RED + "⠀⠀⢠⣿⣿⣿⣿⣿⣿⡿⢀⣼⠟                  "  + RESET + "  ⠻⣦⣙⣮⡳⢽⣦⡙⢮⡛⠀\n" +
                                        RED + "⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"  + RESET + "   ⠈⠙⢷⣝⣦⡙⢏⠢⣙⠀\n" +
                                        RED + "⣴⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"   + RESET + "       ⠙⢷⡙⢮⡓⣍⠀\n" +
                                        RED + "⢾⣿⡿⠿⠟⠛⠁"               +   RESET + "                                  ⠙⢦⡙⢿⡇\n" +
                                        RESET +
                                        RED + "⢀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠘⣽⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⡇⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠧⣿⡿⠋⠀" + RESET
                        );

                        reiniciar = "";

                        while (!reiniciar.equals(SI) && !reiniciar.equals(NO)) {
                            escribirLinea("¿Seguro que no quieres jugar?", 600);
                            escribirLinea("Pulsa 1 para que te lo pregunte de nuevo o 2 para rendirte.", 650);
                            reiniciar = sc.nextLine().trim();

                            if (reiniciar.equals(SI)) {
                                escribirLinea("Te lo preguntaré de nuevo entonces.", 600);
                                decisiones = "";
                            } else if (reiniciar.equals(NO)) {
                                escribirLinea(RED + "Te acostumbras a esa vida y mueres 10 años después por una viruela común." + RESET, 700);
                                System.exit(0);
                            } else {
                                escribirLinea(YELLOW + "VALOR NO VÁLIDO." + RESET, 600);
                            }
                        }

                    } else {
                        escribirLinea(YELLOW + "VALOR NO VÁLIDO. Escribe " + BOTELLA + " o " + MANOS + "." + RESET, 600);
                    }
                } while (!lucha.equals(BOTELLA));

            } else if (decisiones.equals(OPCION_TIENDA)) {
                break;
            } else {
                escribirLinea(
                        CYAN + "VALOR INTRODUCIDO NO CORRECTO. Elige 1 para entrar al bar o 2 para ir a la tienda de empeños." + RESET, 650
                );
            }

        } while (!decisiones.equals(OPCION_TIENDA) && !decisiones.equals(OPCION_BAR));
    }

    private static void laTienda() {

        separador("ACTO V · LA TIENDA DE EMPEÑOS");

        final String JUGAR = "1";
        final String NO_JUGAR = "2";

        String decisiones = "";

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        escribirLinea("Entras a la tienda, sabiendo que sigues sin dinero de la época. Sin saber qué hacer, te encuentras a un anciano.", 750);

        escribirLinea(
                "Le explicas la situación. El anciano, cansado de la monotonía de la época, te propone que a cambio de un par de jueguecitos", 750);
        escribirLinea(
                "simples y que nunca han pasado de moda, si los consigues, te dará lo que necesitas gratis.", 750);

        while (!decisiones.equalsIgnoreCase(JUGAR) && !decisiones.equalsIgnoreCase(NO_JUGAR)) {
            escribirLinea("¿Deseas jugar? Pulsa 1 para jugar o 2 para rechazar la oferta.", 700);
            decisiones = sc.nextLine().trim();

            if (decisiones.equalsIgnoreCase(JUGAR)) {
                escribirLinea(YELLOW + "ADELANTE." + RESET, 600);
                break;

            } else if (decisiones.equalsIgnoreCase(NO_JUGAR)) {
                escribirLinea(RED + "¿Estás seguro? Pulsa 1 para que te lo pregunte de nuevo o 2 para rendirte." + RESET, 650);
                reiniciar();
                decisiones = "";
            }
        }
    }

    public static void adivinaNumero() {
        separador("MINI-JUEGO · ADIVINA EL NÚMERO");

        Random aleatorio = new Random();
        boolean reiniciarJuego;

        escribirLinea(
                "El primer juego será: " + CYAN + "ADIVINA EL NÚMERO" + RESET, 650);
        escribirLinea(
                "Sencillo, ¿no? Para que a la segunda prueba has de jugar,", 650);
        escribirLinea(
                "un número del 1 al 10 tendrás que adivinar.", 650);

        do {
            reiniciarJuego = false;

            int secreto = aleatorio.nextInt(10) + 1;
            int intentos = 3;
            int contador = 0;
            boolean acertado = false;

            for (int i = 1; i <= intentos; i++) {
                escribirLinea("Indica el número que crees que es (1-10):", 500);

                int n1 = leerNumero(1, 10);

                contador++;

                if (n1 == secreto) {
                    escribirLinea(
                            GREEN + "ACERTASTEEEEE. Con " + contador + " intentos." + RESET, 650);
                    escribirLinea(
                            "Te falta la última parte para conseguir tu objetivo sin que me pagues, ¿serías capaz?", 700);
                    acertado = true;
                    break;
                } else if (n1 > secreto) {
                    escribirLinea("No no, te has ido alto, joven.", 550);
                } else {
                    escribirLinea("No no, te has ido bajo, muchacho.", 550);
                }
            }

            if (!acertado) {
                escribirLinea(
                        RED + "Has agotado tus " + intentos + " intentos sin acertar." + RESET, 650);
                escribirLinea(
                        "El anciano niega con la cabeza: 'Otro viajero devorado por el tiempo...'", 700);
                escribirLinea(
                        "Te quedas atrapado en el siglo XVIII para siempre.", 700);

                escribirLinea("¿Quieres reiniciar?", 600);
                escribirLinea("Pulsa 1 para reiniciar el juego o 2 para rendirte.", 650);

                reiniciar();
                reiniciarJuego = true;
            }

        } while (reiniciarJuego);
    }

    public static void ahorcado() {
        separador("MINI-JUEGO · EL AHORCADO");

        escribirLinea("Para que la pieza has de adivinar, un pequeño juego has de jugar.", 650);
        escribirLinea("El anciano te mira serio y te propone un último reto...", 700);
        System.out.println();

        String palabra = "talisman";

        juego(palabra, sc);
    }

    public static void juego(String palabra, Scanner sc) {

        boolean reiniciar;

        do {
            char[] progreso = new char[palabra.length()];
            char[] usadas = new char[26];
            int usadasCount = 0;

            boolean adivinado = false;
            int fallos = 0;
            final int MAX_FALLOS = 6;

            for (int i = 0; i < progreso.length; i++) {
                progreso[i] = '_';
            }

            System.out.println("La palabra tiene " + palabra.length() + " letras.\n" +
                    "Se trata de un objeto que te da suerte");

            while (!adivinado && fallos < MAX_FALLOS) {

                System.out.print("Progreso: ");

                for (int i = 0; i < progreso.length; i++) {
                    System.out.print(progreso[i] + " ");
                }

                System.out.println();

                System.out.print("Introduce una letra: ");
                String linea = sc.nextLine().toLowerCase().trim();

                if (linea.isEmpty()) {
                    System.out.println(BROWN + "No has introducido nada." + RESET);
                    continue;
                }

                char letra = linea.charAt(0);

                boolean yaUsada = false;
                for (int i = 0; i < usadasCount; i++) {
                    if (usadas[i] == letra) {
                        yaUsada = true;
                        break;
                    }
                }

                if (yaUsada) {
                    System.out.println(YELLOW + "Esa letra ya la has probado." + RESET);
                    continue;
                }

                usadas[usadasCount] = letra;
                usadasCount++;

                boolean acierto = false;
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra && progreso[i] == '_') {
                        progreso[i] = letra;
                        acierto = true;
                    }
                }

                if (!acierto) {
                    fallos++;
                    System.out.println(RED + "Fallaste. Intentos fallidos: " + fallos + "/" + MAX_FALLOS + RESET);
                    imprimirAhorcado(fallos);
                    System.out.println();
                }

                boolean completa = true;
                for (int i = 0; i < progreso.length; i++) {
                    if (progreso[i] == '_') {
                        completa = false;
                        break;
                    }
                }

                if (completa) {
                    adivinado = true;
                }
            }

            if (adivinado) {
                System.out.println(GREEN + "¡Felicidades! Adivinaste la palabra: " + palabra + RESET);
                System.out.println("El anciano te entrega la pieza para la CRONOS-1.");
                reiniciar = false;

            } else {
                System.out.println(RED + "Has perdido." + RESET);

                System.out.println("El anciano te mira  con ojos de decepción y te indica la salida de la tienda");
                System.out.println("¿Quieres reiniciar? (1 = Sí, 2 = No)");

                reiniciar();
                reiniciar = true;
            }

        } while (reiniciar);
    }

    public static void imprimirAhorcado(int fallos) {

        if (fallos == 1) {
            System.out.println("      ___________");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("     ___        |");
            System.out.println("     |_|        |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("    ____________|_____");

        } else if (fallos == 2) {
            System.out.println("      ___________");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("     ___        |");
            System.out.println("     |_|        |");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("      |         |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("                |");
            System.out.println("    ____________|_____");

        } else if (fallos == 3) {
            System.out.println("           ___________");
            System.out.println("           |         |");
            System.out.println("           |         |");
            System.out.println("          ___        |");
            System.out.println("          |_|        |");
            System.out.println("           |         |");
            System.out.println("      _____|         |");
            System.out.println("           |         |");
            System.out.println("           |         |");
            System.out.println("                     |");
            System.out.println("                     |");
            System.out.println("                     |");
            System.out.println("         ____________|_____");
        } else if (fallos == 4) {
            System.out.println("           ___________");
            System.out.println("           |         |");
            System.out.println("           |         |");
            System.out.println("          ___        |");
            System.out.println("          |_|        |");
            System.out.println("           |         |");
            System.out.println("      _____|_____    |");
            System.out.println("           |         |");
            System.out.println("           |         |");
            System.out.println("                     |");
            System.out.println("                     |");
            System.out.println("                     |");
            System.out.println("         ____________|_____");
        } else if (fallos == 5) {
            System.out.println("         _____________");
            System.out.println("         |         |");
            System.out.println("         |         |");
            System.out.println("        ___        |");
            System.out.println("        |_|        |");
            System.out.println("         |         |");
            System.out.println("    _____|_____    |");
            System.out.println("         |         |");
            System.out.println("         |         |");
            System.out.println("        /          |");
            System.out.println("       /           |");
            System.out.println("      /            |");
            System.out.println("       ____________|_____");
        } else if (fallos == 6) {
            System.out.println("        _____________");
            System.out.println("         |         |");
            System.out.println("         |         |");
            System.out.println("        ___        |");
            System.out.println("        |_|        |");
            System.out.println("         |         |");
            System.out.println("    _____|_____    |");
            System.out.println("         |         |");
            System.out.println("         |         |");
            System.out.println("        / |        |");
            System.out.println("       /  |        |");
            System.out.println("      /   |        |");
            System.out.println("       ____________|_____");
        }
    }

    public static void pregunta1() {

        separador("ACTO VI · EL AMIGO DEL TIEMPO");

        escribirLento("El anciano está orgulloso y apasionado por el viajero.", 35);
        escribirLento("Hacía mucho que no sentía esas emociones en ese pueblo tan aburrido.", 35);
        escribirLento("Decide darte las piezas necesarias para reparar la CRONOS-1.", 35);
        escribirLento("Gracias a lo bien que se lo ha pasado contigo, decide ayudarte aún más.", 35);
        escribirLento("Te presenta a su amigo astrofísico de la época.", 35);

        escribirLinea("-------------------------------------------------------------------------------------------------------------------------------", 400);

        escribirLento("Tras el primer salto temporal, CRONOS-1 sufre un daño grave en el Núcleo de Estabilidad Temporal.", 30);
        escribirLento("Es una pieza que mantiene la máquina conectada al presente real.", 30);
        escribirLento("El científico te explica, serio: \"La máquina está desestabilizada...\"", 30);
        escribirLento("Cada salto temporal que hagas dependerá de que recuerdes y aciertes eventos clave de la historia.", 30);
        escribirLento("Si fallas, CRONOS-1 no podrá encontrar el camino de vuelta y te quedarás atrapado en la época en la que estés.", 30);

        escribirLinea("", 400);
        escribirLento("El anciano y el astrofísico te acompañan hasta una puerta metálica al fondo de la tienda.", 30);
        escribirLento("Detrás de ella, un resplandor azul ilumina un enorme panel lleno de luces y símbolos extraños.", 30);
        escribirLento("Es el corazón del sistema de estabilidad temporal.", 30);

        escribirLinea("", 400);
        escribirLento("Cuando cruzas el umbral, una voz metálica resuena en el laboratorio:", 30);
        escribirLento(BOLD + "\">> PROTOCOLO DE PRUEBA ACTIVADO. RESPONDE CORRECTAMENTE PARA ASEGURAR EL REGRESO. <<\"" + RESET, 25);

        laboratorio();
    }

    public static void laboratorio() {

        separador("ACTO VII · PANEL DE ESTABILIDAD TEMPORAL");

        escribirLento("Llegáis al laboratorio del astrofísico.", 30);
        escribirLento("En la entrada aparece un panel con preguntas de cultura general.", 30);
        escribirLento("Lo que respondas determinará el destino de la CRONOS-1... y el tuyo.", 30);
        System.out.println();

        int aciertos = 0;
        String respuesta;
        boolean valida;

        escribirLinea("Pregunta 1: ¿Cómo se llamaban los reyes del Antiguo Egipto?", 650);
        escribirLinea("A) Faraones", 450);
        escribirLinea("B) Sultanes", 450);

        respuesta = "";
        valida = false;
        while (!valida) {
            System.out.print("Tu respuesta (A/B): ");
            respuesta = sc.nextLine().trim().toUpperCase();

            if (respuesta.equals("A")) {
                escribirLinea(GREEN + "Correcto. El panel se ilumina en verde." + RESET, 650);
                escribirLinea("La CRONOS-1 gana un poco de estabilidad...", 600);
                aciertos++;
                valida = true;
            } else if (respuesta.equals("B")) {
                escribirLinea(RED + "Incorrecto. El panel se vuelve rojo unos segundos." + RESET, 650);
                escribirLinea("Una pequeña vibración recorre el suelo del laboratorio.", 600);
                valida = true;
            } else {
                escribirLinea(YELLOW + "Respuesta no válida. Escribe A o B." + RESET, 600);
            }
        }

        System.out.println();

        escribirLinea(CYAN + "Nivel 1 completado. El Núcleo de Estabilidad recupera un 30% de potencia..." + RESET, 600);
        escribirLinea(YELLOW + "Pero algo no va bien. Las luces internas de CRONOS-1 parpadean demasiado rápido." + RESET, 650);
        escribirLinea(RED + "La máquina está reaccionando a los cambios del tiempo." + RESET, 650);
        System.out.println();

        escribirLinea("Pregunta 2 — INESTABILIDAD TEMPORAL", 650);
        escribirLinea("¿Hace cuántos años se extinguieron los dinosaurios?", 650);
        escribirLinea("A) Hace 93 millones de años", 450);
        escribirLinea("B) Hace 66 millones de años", 450);
        escribirLinea("C) Hace 120 millones de años", 450);

        respuesta = "";
        valida = false;
        while (!valida) {
            System.out.print("Tu respuesta (A/B/C): ");
            respuesta = sc.nextLine().trim().toUpperCase();

            switch (respuesta) {
                case "B":
                    escribirLinea(GREEN + "Correcto. El sistema temporal confirma la referencia histórica." + RESET, 650);
                    escribirLinea(CYAN + "La estabilidad aumenta… pero CRONOS-1 sigue vibrando peligrosamente." + RESET, 650);
                    aciertos++;
                    valida = true;
                    break;

                case "A":
                case "C":
                    escribirLinea(RED + "Incorrecto. El panel se vuelve rojo." + RESET, 650);
                    escribirLinea(RED + "Has perdido parte de la sincronización con la línea temporal." + RESET, 650);
                    valida = true;
                    break;

                default:
                    escribirLinea(YELLOW + "Respuesta no válida. Escribe A, B o C." + RESET, 600);
            }
        }

        System.out.println();

        escribirLinea("Nivel 2 superado. El Núcleo de Estabilidad Temporal alcanza un 50% de estabilidad.", 650);
        escribirLinea("Las luces de CRONOS-1 parpadean con un ritmo extraño.", 650);
        escribirLinea("Pequeñas chispas salen de los laterales del panel. El sistema está muy exigido.", 650);
        System.out.println();

        escribirLinea("Pregunta 3 — FRACTURA CONTINENTAL", 650);
        escribirLinea("¿Quién le dio nombre al continente que conocemos como América?", 650);
        escribirLinea("A) Einstein", 450);
        escribirLinea("B) Carlos III", 450);
        escribirLinea("C) Américo Vespucio", 450);
        escribirLinea("D) Cristóbal Colón", 450);

        respuesta = "";
        valida = false;
        while (!valida) {
            System.out.print("Tu respuesta (A/B/C/D): ");
            respuesta = sc.nextLine().trim().toUpperCase();

            switch (respuesta) {
                case "C":
                    escribirLinea(GREEN + "Correcto. CRONOS-1 reconoce la referencia histórica." + RESET, 650);
                    escribirLinea("El panel gana estabilidad y el flujo temporal se vuelve más claro.", 650);
                    aciertos++;
                    valida = true;
                    break;

                case "A":
                case "B":
                case "D":
                    escribirLinea(RED + "Incorrecto. El panel se vuelve rojo." + RESET, 650);
                    escribirLinea("Has perdido una referencia clave en la cronología.", 650);
                    valida = true;
                    break;

                default:
                    escribirLinea(YELLOW + "Respuesta no válida. Escribe A, B, C o D." + RESET, 600);
            }
        }

        System.out.println();

        escribirLinea("Nivel 3 superado. El Núcleo de Estabilidad Temporal alcanza un 75% de estabilidad.", 650);
        escribirLinea("CRONOS-1 vibra como si fuera a romperse. La inestabilidad avanza rápido.", 650);
        escribirLinea("Solo queda una pregunta más para decidir tu destino.", 650);
        System.out.println();

        escribirLinea("Pregunta 4 ", 650);
        escribirLinea("¿Cuál de estos emperadores fue alumno del filósofo griego Aristóteles?", 650);
        escribirLinea("A) Trajano", 450);
        escribirLinea("B) Alejandro Magno", 450);
        escribirLinea("C) Carlomagno", 450);
        escribirLinea("D) Augusto", 450);

        respuesta = "";
        valida = false;
        while (!valida) {
            System.out.print("Tu respuesta (A/B/C/D): ");
            respuesta = sc.nextLine().trim().toUpperCase();

            switch (respuesta) {
                case "B":
                    escribirLinea(GREEN + "Correcto. CRONOS-1 confirma su propia identidad." + RESET, 650);
                    escribirLinea("El panel emite un brillo blanco que inunda todo el laboratorio.", 650);
                    aciertos++;
                    valida = true;
                    break;

                case "A":
                case "C":
                case "D":
                    escribirLinea(RED + "Incorrecto. Parece que has visto demasiadas pelis y series..." + RESET, 650);
                    escribirLinea("La máquina duda de sí misma por un instante.", 650);
                    valida = true;
                    break;

                default:
                    escribirLinea(YELLOW + "Respuesta no válida. Escribe A, B, C o D." + RESET, 600);
            }
        }

        System.out.println();
        escribirLinea("Has acertado " + aciertos + " de 4 preguntas.", 700);
        System.out.println();

        if (aciertos <= 1) {

            escribirLinea(RED + "Los errores son demasiado graves. El panel entra en modo de emergencia." + RESET, 700);
            escribirLinea("El núcleo de la CRONOS-1 se sobrecalienta sin control.", 700);
            escribirLinea("El astrofísico grita algo sobre 'inestabilidad crítica' pero ya es demasiado tarde.", 700);

            System.out.println("⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠐⠀⠈⠀⢀⠀⠀⠠⠁⠄⢀⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣀⣀⣀⣀⣄⣀⠀⢀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⠶⠚⠋⠉⠁⠉⠉⠀⠉⠉⠻⣯⡉⣙⣳⢦⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡴⠞⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⠯⢿⡿⣷⣄⠀⢤⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⢀⡴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⠄⢨⣳⣶⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣤⣞⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⢤⣄⣠⣤⣤⣤⣬⣿⣿⣿⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡇⠀⢀⣠⠤⠒⠒⠂⠀⠀⠀⠀⠀⠀⠀⡠⠴⠒⠛⠉⠉⠉⠉⠉⠉⠉⠛⠛⠋⠿⠿⣿⣿⡿⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠒⠉⠁⠀⠀⢀⡀⠀⣀⣠⣴⡶⠾⡷⠶⡶⣶⢶⣦⣤⣤⣴⣤⣤⣈⡀⢉⣙⡛⣋⣽⣽⣿⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣷⠋⠀⠀⢘⣡⣶⣿⡙⢤⡈⡕⠱⣌⠣⣕⡸⣫⣿⣿⣿⣿⣿⣶⣿⣿⣷⣮⣽⣿⣿⣿⣿⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠇⣀⣤⣾⣿⣷⢣⠙⢢⠁⠆⡱⢈⠳⠰⢣⠟⣽⢾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⣻⣿⣿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⡟⢩⣿⣿⣿⣫⣤⣭⣤⣴⣡⣀⡣⣰⣷⣿⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⢺⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠛⣿⣿⢻⣿⣿⣿⣿⣿⣧⢛⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⣷⠩⡙⣟⠻⣩⡇⢺⣿⣿⣿⢫⢯⡽⡘⣆⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⡀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣧⡱⢈⣶⡿⣁⢸⣿⣿⣿⣦⡏⡴⣓⣾⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⣿⣿⣧⣾⣿⣀⣇⣼⣿⣯⣿⣿⣿⣷⣭⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠄⠐⠀⡀⠀⠀⠠⠀⢀⠐⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⠄⠀⡐⠊⠁⠄⠁⠠⠐⡀⠂⡀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣿⣿⣿⣿⣿⣿⠿⣿⣿⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠀⢂⡐⢀⠂⡄⠈⢄⠃⡀⢈⠀⠄⠀⠂⢀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⡿⣿⣿⣿⣿⣿⣿⣷⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠇⣷⡀⠀⡁⠄⡌⠠⢁⠎⠐⠤⢁⠂⣄⠠⠁⠂⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣤⠶⠛⠁⢀⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠃⣿⢿⣿⠿⡶⢾⣶⣶⣮⣜⣀⡂⠐⠤⠡⠆⢁⠀⠄⡀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⠴⠛⠉⠀⠀⠀⠀⢻⡟⣹⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡧⠁⢹⣯⢻⡿⣦⡃⠀⠈⠉⠙⠻⠿⣿⡃⣱⠠⢌⠠⠁⠄\n" +
                    "⠀⠀⠀⠀⠀⢀⠀⣀⣠⡞⠋⠉⠀⠀⠐⠀⠀⠀⠀⠈⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠸⣷⡀⢹⢾⣳⡄⠀⠀⠀⠀⠀⠀⠹⢷⠉⠓⣤⠇⡎\n" +
                    "⠀⠀⠀⠀⠀⢸⣶⢿⡟⠁⠀⠀⡠⠴⠒⡀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡏⡆⠀⢻⣧⡈⠈⢯⡳⡄⠀⠀⠀⠀⠀⠀⠸⡆⠀⢹⠰⢧\n" +
                    "⠀⠀⠀⢀⡴⠋⠉⠀⠈⡵⡞⠃⠀⠀⠀⢳⡀⠀⠀⠀⠘⣿⣟⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣧⠀⠀⠈⢳⡹⡄⢆⠙⣿⡆⠀⠀⠀⠀⠀⠀⢻⠀⠀⠆⠈\n" +
                    "⠀⠀⣰⠋⠀⠀⠀⢠⠋⠀⠈⠳⡄⠀⠀⠀⢷⠀⠀⠀⠀⢻⣇⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣟⣆⠀⠀⠀⠹⣌⠈⢣⠈⣿⠀⢰⡅⠀⠀⠀⢸⠀⠀⠀⠀"
            );

            escribirLinea(RED + "La CRONOS-1 explota en un destello de luz. No queda ni rastro de ti en la línea temporal." + RESET, 800);
            System.out.println(
                    BROWN +
                            "⠀⠀⢀⣠⣴⣶⠾⠿⣯⣭⣿⣛⡒⠶⢤⣄⡀⠀⠀⠀\n" +
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
                            "REST IN PEACE" + RESET
            );
            System.exit(0);

        } else if (aciertos <= 3) {

            escribirLinea(CYAN + "La CRONOS-1 intenta compensar tus errores y abre un portal inestable." + RESET, 700);
            escribirLinea("El astrofísico duda, pero ya estás dentro de la máquina.", 700);
            escribirLinea("Un destello te lanza a través del tiempo y el espacio...", 700);

            escribirLento("Despiertas en una playa de arena blanca, con un sol extraño en el cielo.", 35);
            escribirLento("No hay ciudades, no hay tecnología... solo naturaleza y silencio.", 35);
            escribirLento("Has quedado atrapado en una isla remota, fuera de cualquier línea temporal conocida.", 35);
            System.out.println();

            System.out.println(
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠈⠉⠛⢷⣦⡀⠀⣀⣠⣤⠤⠄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⣀⣻⣿⣿⣿⣋⣀⡀⠀⠀⢀⣠⣤⣄⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⣠⠾⠛⠛⢻⣿⣿⣿⠟⠛⠛⠓⠢⠀⠀⠉⢿⣿⣆⣀⣠⣤⣀⣀⠀⠀⠀\n" +
                            "⠀⠀⠘⠁⠀⠀⣰⡿⠛⠿⠿⣧⡀⠀⠀⢀⣤⣤⣤⣼⣿⣿⣿⡿⠟⠋⠉⠉⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠠⠋⠀⠀⠀⠀⠘⣷⡀⠀⠀⠀⠀⠹⣿⣿⣿⠟⠻⢶⣄⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⣧⠀⠀⠀⠀⢠⡿⠁⠀⠀⠀⠀⠈⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡄⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⠀⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⣤⣤⣤⣤⣤⣤⡤⠄⠀⠀⣀⡀⢸⡇⢠⣤⣁⣀⠀⠀⠠⢤⣤⣤⣤⣤⣤⣤⠀\n" +
                            "⠀⠀⠀⠀⠀⠀⣀⣤⣶⣾⣿⣿⣷⣤⣤⣾⣿⣿⣿⣿⣷⣶⣤⣀⠀⠀⠀⠀⠀⠀\n" +
                            "⠀⠀⠀⣠⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⣄⠀⠀⠀\n" +
                            "⠀⠀⠼⠿⣿⣿⠿⠛⠉⠉⠉⠙⠛⠿⣿⣿⠿⠛⠛⠛⠛⠿⢿⣿⣿⠿⠿⠇⠀⠀\n" +
                            "⠀⢶⣤⣀⣀⣠⣴⠶⠛⠋⠙⠻⣦⣄⣀⣀⣠⣤⣴⠶⠶⣦⣄⣀⣀⣠⣤⣤⡶⠀\n" +
                            "⠀⠀⠈⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀⠀⠉⠉⠉⠉⠀⠀⠀⠀"
            );

            escribirLento("Con el tiempo, aprendes a sobrevivir allí… pero nadie recordará jamás tu viaje temporal.", 35);
            System.exit(0);

        } else {
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣠⣤⣤⡤⠶⠶⠶⠶⠛⠛⠻⣷⠀⠀⠀⠀\n" +
                    "⠀⢀⣀⣤⣤⣴⠶⠶⠟⠛⠛⠉⣉⣉⣀⣤⣤⣤⣴⣶⣶⣶⣶⣾⡀⢻⡀⠀⠀⠀\n" +
                    "⠀⠘⣿⠉⣠⣤⣤⣶⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠸⡇⠀⠀⠀\n" +
                    "⠀⠀⣿⡀⣿⣿⣛⣉⣉⣉⣽⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⣷⠀⠀⠀\n" +
                    "⠀⠀⢸⡇⢻⣿⣿⣿⣿⠿⠿⠟⠛⠛⠋⣉⣉⣿⣿⣿⣿⣿⣿⣿⣿⡆⢹⡀⠀⠀\n" +
                    "⠀⠀⠸⡇⢸⣿⣧⣤⣤⣴⠶⠶⠾⠛⢻⣿⣿⣿⠟⢉⣁⣤⣄⡉⢻⣇⢸⡇⠀⠀\n" +
                    "⠀⠀⠀⣧⠈⣿⣿⣁⣤⣤⣤⣶⣶⣾⣿⣿⣿⡏⠰⣿⣿⣿⣿⡗⠀⣿⠈⣿⠀⠀\n" +
                    "⠀⠀⠀⢹⠀⢿⣿⣿⣿⣿⣿⣿⣿⡿⠿⠿⠟⠛⠀⠙⠛⠛⠛⠁⠀⣥⣤⣿⡄⠀\n" +
                    "⠀⠀⠀⢸⡆⠸⠛⠛⠋⣉⣉⣠⣤⣤⣴⡶⠶⠿⠟⠀⢸⣷⣿⣿⡀⠉⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠈⡷⠶⠶⠛⠛⠋⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠘⣿⣿⣿⣧⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⡆⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢿⡿⠉⠛⠿⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠀⠀⠀⠀⠀⠀⠀⠀");
            escribirLinea(GREEN + "El panel marca una estabilidad temporal del 100%." + RESET, 700);
            escribirLinea("El astrofísico te mira impresionado: No muchos viajeros llegan tan lejos...", 750);
            escribirLinea("Ajusta los controles de la CRONOS-1 y te marca un destino especial en la consola.", 750);

            separador("EPÍLOGO · DOS AÑOS DESPUÉS");

            escribirLento("Apareces de golpe en la puerta del XTART.", 35);
            escribirLento("Miras el móvil: han pasado dos años exactos.", 35);
            escribirLento("Llevas en la mano tu título, proyecto final presentado y aprobado.", 35);
            escribirLento("Dani y Nuria hablan en la sala de profesores sobre 'aquel alumno que siempre iba un poco adelantado al tiempo'.", 35);

            System.out.println();
            escribirLinea(CYAN + "CRONOS-1 ha cumplido su cometido... por ahora." + RESET, 700);
            escribirLinea(BOLD + "FIN DEL VIAJE (O EL PRINCIPIO DE OTRO)." + RESET, 800);

            System.exit(0);
        }
    }

}
