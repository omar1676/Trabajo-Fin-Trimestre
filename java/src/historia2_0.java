import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class historia2_0{

    private static final Scanner sc = new Scanner(System.in);

    private static final String RESET = "\u001B[0m";
    private static final String CYAN  = "\u001B[36m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW= "\u001B[33m";
    private static final String BOLD  = "\u001B[1m";
    public static final String RED = "\u001B[31m";
    public static final String BROWN = "\u001B[38;5;94m";

    public static void main(String[] args) throws InterruptedException {

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
        elAmigo();
        primeraPregunta();
        segundaPregunta();
        cuartaPregunta();
        quintaPregunta();
        sextaPregunta();
        septimaPregunta();

    }

    private static void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
        }
    }

    private static void escribirLinea(String texto, int pausa) {
        System.out.println(texto);
        esperar(pausa);
    }

    private static void escribirLento(String texto, int pausaPorLetra) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            esperar(pausaPorLetra);
        }
        System.out.println();
    }

    private static void separador(String titulo) {
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

        String maquina = """
                 _______________________________________
                /---------------------------------------|
               |   ⚙  MÁQUINA TEMPORAL "CRONOS-1" ⚙     |
               |-----------------------------------------|
               |   ║█████████████████████████████████║   |
               |   ║     ENERGÍA TEMPORAL:  99%      ║   |
               |   ║     ESTABILIDAD:       OK       ║   |
               |-----------------------------------------|
               |   [::::::|| ACTIVANDO PORTAL ||::::::]  |
               |_________________________________________|
                         /     /      /     /
              ~~~~~~~—~~~~~⚡~~~~~—~~~~~⚡~~~~~—~~~~~
                       ✦   ✦   ✦  ✦   ✦   ✦   ✦
                  >>> INICIO DEL VIAJE TEMPORAL <<<
                """;

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

        final String INICIAR = "1";
        final String ESTUDIAR = "2";

        escribirLinea("Elige entre iniciar (1) o estudiar (2)", 500);
        escribirLinea("¿Qué decides? ¿Escaparte a una aventura como mandan los cánones,", 600);
        escribirLinea("o quedarte avanzando en el proyecto?", 600);

        String decision = "";

        while (!decision.equals(INICIAR) && !decision.equals(ESTUDIAR)) {
            System.out.print("> ");
            decision = sc.nextLine().trim();

            if (decision.equals(INICIAR)) {
                escribirLinea(GREEN + "Has elegido INICIAR." + RESET, 600);
                System.out.println();
                break;
            } else if (decision.equals(ESTUDIAR)) {
                escribirLinea(YELLOW + "Has elegido ESTUDIAR." + RESET, 600);
                escribirLinea("Los chicos decidieron seguir con el proyecto final. Entre tantos ejercicios evaluables,", 650);
                escribirLinea("se olvidaron por completo de la máquina del tiempo. Fin de la historia (por ahora).", 700);
                System.exit(0);
            } else {
                escribirLinea(RED + "Entrada no válida. Escribe 1 para INICIAR o 2 para ESTUDIAR." + RESET, 600);
            }
        }

        System.out.println();
    }

    public static void actoNumero1() throws InterruptedException {


            String[][] alumnosXTART = {
                    {"omar", "aitor", "dani", "laura", "ivan", "javier", "sergio", "diego", "juan", "alvaro"}, // DAM
                    {"nuria", "helen", "carlos", "alejandro", "gonzalo", "noemi", "renzo", "clemente", "berta"} // ASIR
            };

            String clase_xtart;

            do {
                System.out.println("¿Cuál es tu curso en el centro? (DAM / ASIR)");
                clase_xtart = sc.nextLine().trim();

                if (!clase_xtart.equalsIgnoreCase("DAM") &&
                        !clase_xtart.equalsIgnoreCase("ASIR")) {

                    System.out.println(YELLOW + "Curso no válido. Escribe DAM o ASIR." + RESET);
                }
            } while (!clase_xtart.equalsIgnoreCase("DAM") &&
                    !clase_xtart.equalsIgnoreCase("ASIR"));

            int fila = clase_xtart.equalsIgnoreCase("DAM") ? 0 : 1;

            boolean nombreCorrecto = false;
            String nombre_alumno;

            do {
                System.out.println("¿Nombre del que viajará?");
                nombre_alumno = sc.nextLine().trim().toLowerCase();

                for (String alumno : alumnosXTART[fila]) {
                    if (alumno.equalsIgnoreCase(nombre_alumno)) {
                        nombreCorrecto = true;
                        break;
                    }
                }

                if (!nombreCorrecto) {
                    System.out.println(RED + "Ese nombre no está registrado en XTART en ese curso." + RESET);
                }

            } while (!nombreCorrecto);

            // Aquí seguiría tu código del año de nacimiento ↓↓



    boolean añoBien = false;
    int año_nacimiento = 0;

        while (!añoBien) {
        System.out.println("¿Cuál es tu año de nacimiento? (1950 - 2010)");
        String entrada = sc.nextLine().trim();

        boolean esNumero = true;
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            if (c < '0' || c > '9') {
                esNumero = false;
                break;
            }
        }

        if (esNumero && !entrada.isEmpty()) {
            año_nacimiento = Integer.parseInt(entrada);

            if (año_nacimiento >= 1950 && año_nacimiento <= 2010) {
                añoBien = true;
            }
        } else {
            añoBien = false;
        }

        if (!añoBien) {
            System.out.println(RED + "Año no válido. Debe estar entre 1950 y 2010." + RESET);
        }
    }

    String maquina = """
             _______________________________________
            /---------------------------------------|
           |   ⚙  MÁQUINA TEMPORAL "CRONOS-1" ⚙     |
           |-----------------------------------------|
           |   ║████████████████████████████████ ║   |
           |   ║     ENERGÍA TEMPORAL:  96%      ║   |
           |   ║     ESTABILIDAD:       OSCILA   ║   |
           |-----------------------------------------|
           |   [::::::|| DESVIACIÓN EN EL FLUJO ||::::]|
           |_________________________________________|
                     /     /      /     /
          ~~~~~~~—~~~~~⚡~~~~~—~~~~~⚡~~~~~—~~~~~
                   ✦   ✦   ✦  ✦   ✦   ✦   ✦
              >>> ¡ANOMALÍA DETECTADA! <<<
            """;

        Thread.sleep(1000);
        System.out.println();
        System.out.println(
    nombre_alumno + " de " + clase_xtart.toUpperCase() +
            " cogió sus cosas y se aventuró hacia " + año_nacimiento + ".\n" +
            "Inició su máquina y comenzó a viajar.\n" +
            "Una ráfaga del flujo temporal desvía la CRONOS-1 exactamente 0,5 cm a la derecha."
            );

        System.out.println(maquina);
        Thread.sleep(1500);
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
        final String SI = "3";
        final String NO = "4";
        String decisiones = "";
        String reiniciar = "";

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
                escribirLinea(RED + "¿Estás seguro? Escribe 3 si quieres reiniciar o 4 para rendirte." + RESET, 650);

                while (true) {
                    reiniciar = sc.nextLine().trim();

                    if (reiniciar.equalsIgnoreCase(SI)) {
                        escribirLinea("Te lo preguntaré de nuevo entonces.", 600);
                        decisiones = "";
                        break;
                    } else if (reiniciar.equalsIgnoreCase(NO)) {
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
                        escribirLinea(YELLOW + "VALOR NO VÁLIDO. Escribe 3 o 4." + RESET, 600);
                    }
                }
            }
        }
    }

    public static void adivinaNumero() {
        separador("MINI-JUEGO · ADIVINA EL NÚMERO");

        Random aleatorio = new Random();
        final String SI = "1";
        final String NO = "2";

        boolean reiniciar;

        escribirLinea(
                "El primer juego será: " + CYAN + "ADIVINA EL NÚMERO" + RESET, 650);
        escribirLinea(
                "Sencillo, ¿no? Para que a la segunda prueba has de jugar,", 650);
        escribirLinea(
                "un número del 1 al 10 tendrás que adivinar.", 650);

        do {
            int secreto = aleatorio.nextInt(10) + 1;
            int intentos = 3;
            int contador = 0;
            boolean acertado = false;

            for (int i = 1; i <= intentos; i++) {
                escribirLinea("Indica el número que crees que es (1-10):", 500);
                contador++;

                int n1 = sc.nextInt();
                sc.nextLine();

                if (n1 < 1 || n1 > 10) {
                    escribirLinea(YELLOW + "VALOR FUERA DE RANGO. Cuenta como intento por gracioso y chistoso." + RESET, 600);
                } else if (n1 == secreto) {
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
            }

            if (!acertado) {
                String repetir;
                do {
                    escribirLinea("¿Quieres reiniciar?", 600);
                    escribirLinea("Pulsa 1 para reiniciar el juego o 2 para rendirte.", 650);
                    repetir = sc.nextLine().trim();

                    if (repetir.equals(SI)) {
                        escribirLinea(YELLOW + "REINICIAMOS EL MINI-JUEGO..." + RESET, 650);
                        reiniciar = true;
                    } else if (repetir.equals(NO)) {
                        System.out.println(
                                RED + "Te acostumbras a esa vida y mueres a los 10 años después, por una viruela común.\n" + RESET +
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
                        escribirLinea(YELLOW + "VALOR NO VÁLIDO. Escribe 1 o 2." + RESET, 600);
                        reiniciar = false;
                    }
                } while (!repetir.equals(SI) && !repetir.equals(NO));
            } else {
                reiniciar = false;
            }

        } while (reiniciar);
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

        final String SI = "1";
        final String NO = "2";

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

            System.out.println("La palabra tiene  letras.");

            while (!adivinado && fallos < MAX_FALLOS) {

                System.out.print("Progreso: ");
                for (char c : progreso) {
                    System.out.print(c + " ");
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
                for (char c : progreso) {
                    if (c == '_') {
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

                String repetir;
                reiniciar = false;

                do {
                    System.out.println("El anciano te mira  con ojos de decepción y te indica la salida de la tienda\n" +
                            "¿Quieres reiniciar? (1 = Sí, 2 = No)");
                    repetir = sc.nextLine().trim();

                    if (repetir.equals(SI)) {
                        System.out.println(YELLOW + "REINICIAMOS..." + RESET);
                        reiniciar = true;
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
                        System.out.println("Valor no válido.");
                    }

                } while (!repetir.equals(SI) && !repetir.equals(NO));
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
     public static void elAmigo() {
         System.out.println("El anciano estaba orgulloso y apasionado por el viajero, debido  que hacía mucho que no sentía \n" +
                 "emociones en ese pueblo aburrido. Gracias a que el anciano se lo pasó tan bien decidió ayudar al joven. \n" +
                 "Le presentó a su amigo astrofísico de la época. Pero para acceder a su laboratorio, tenían que pasar una serie de \n" +
                 "preguntas para que ningún inculto se acerque a la base del laboratorio,\n" +
                 "");

         System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
     }

    public static void primeraPregunta() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Llegáis al laboratorio. \n" +
        "En la entrada aparece un panel con preguntas de cultura general.\n" +
        "Esto decidirá si llegarás bien a tu tiempo o quedarás atrapado en el siglo XVIII.");

        System.out.println("Pregunta 1: ¿Cuál es el planeta más cercano al Sol?");
        System.out.println("A) Venus");
        System.out.println("B) Mercurio");
        System.out.println("C) Marte");

        System.out.print("Tu respuesta: ");
        String respuesta = sc.nextLine().trim().toUpperCase();

        switch (respuesta) {
            case "B":
                System.out.println("\n✔ Correcto. El panel se ilumina en verde.");
                System.out.println("UN");

                break;

            case "A":
            case "C":
                System.out.println("\n Incorrecto. El panel se vuelve rojo.");
                System.out.println("Te has quedado atrapado en el siglo XVIII.\n");

                break;

            default:
                System.out.println("Respuesta no válida. Inténtalo de nuevo.\n");
                primeraPregunta();
        }
    }
    public static void segundaPregunta() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Llegáis al laboratorio. \n" +
                "En la entrada aparece un panel con preguntas de cultura general.\n" +
                "Esto decidirá si llegarás bien a tu tiempo o quedarás atrapado en el siglo XVIII.");

        System.out.println("Pregunta 1: ¿Cuál es el planeta más cercano al Sol?");
        System.out.println("A) Venus");
        System.out.println("B) Mercurio");
        System.out.println("C) Marte");

        System.out.print("Tu respuesta: ");
        String respuesta = sc.nextLine().trim().toUpperCase();

        switch (respuesta) {
            case "B":
                System.out.println(" Correcto. El panel se ilumina en verde.");
                System.out.println("La puerta del laboratorio se abre...");

                break;

            case "A":
            case "C":
                System.out.println("Incorrecto. El panel se vuelve rojo.\n" +
                        RED +"Te has quedado atrapado en el siglo XVIII." + RESET);

                break;

            default:
                System.out.println(YELLOW +"Respuesta no válida. Inténtalo de nuevo." + RESET);
               segundaPregunta();
        }
    }
}

