
import java.util.Random;
import java.util.Scanner;

public class Historia {

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


    }

    public static void colores() {
        System.out.println(GREEN + ">> ENERGÍA TEMPORAL ESTABLE" + RESET);
        System.out.println( RED + ">> ADVERTENCIA: OMISIÓN Y O AVERÍA DE PIEZAS " + RESET);
        System.out.println(CYAN + ">> Sincronizando coordenadas espacio-tiempo..." + RESET);
        System.out.println(BOLD + ">> PONER INTERMITENTE" + RESET);
    }

    private static void banner() throws InterruptedException {
        String title =  CYAN + "=== CRONOS-1: PROTOCOLO DE SALTO TEMPORAL ===" + RESET;
        System.out.println(title);
        Thread.sleep(400);
        System.out.println();
    }

    public static void maquinaDelTiempo() throws InterruptedException {
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
        Thread.sleep(600);
    }

    public static void introduccion() {
        System.out.println(
                "En un centro no muy lejos de Alcorcón Central, un muchacho de DAM (dirigido por Dani) \n " +
                        "y un muchacho de ASIR (dirigido por Nuria) crearon una máquina capaz de dar saltos temporales \n " +
                        "y surfear los flujos temporales.\n" +
                        "Aitor andaba con fiebre/mareos y Dani debía contestar unas llamadas. Tenían 3 horas libres y, \n " +
                        "en vez de trabajar en su proyecto, dudaron si probar la máquina del tiempo y adentrarse en el flujo temporal.\n" +
                        "_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________"
        );

        System.out.println();
    }

    public static void decisiones() {
        final String INICIAR = "1";
        final String ESTUDIAR = "2";

        System.out.println("Elige entre iniciar (1) o estudiar (2)");
        System.out.println("¿Qué decides? ¿Escaparte a una aventura como mandan los cánones,");
        System.out.println("o quedarte avanzando en el proyecto?");

        String decision = "";


        while (!decision.equals(INICIAR) && !decision.equals(ESTUDIAR)) {
            System.out.print("> ");
            decision = sc.nextLine().trim();

            if (decision.equals(INICIAR)) {
                System.out.println(GREEN + "Has elegido INICIAR." + RESET);
                System.out.println();
                break;
            } else if (decision.equals(ESTUDIAR)) {
                System.out.println(YELLOW + "Has elegido ESTUDIAR." + RESET);
                System.out.println("Los chicos decidieron seguir con el proyecto final. Entre tantos ejercicios evaluables,");
                System.out.println("se olvidaron por completo de la máquina del tiempo. Fin de la historia (por ahora).");
                System.exit(0);
            } else {
                System.out.println(RED + "Entrada no válida. Escribe 1 para INICIAR o 2 para ESTUDIAR." + RESET);
            }
        }

        System.out.println();
    }

    public static void actoNumero1() throws InterruptedException {


        final String clase_xtart;
        final String nombre_alumno;
        final String año_nacimiento;
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



        System.out.println(
                "Los chicos bajaron al sótano, destaparon la sábana sobre la máquina y se quedaron maravillados de su creación.\n" +
                        "La máquina tiene un mecanismo mediante la introducción de un formulario, donde indicas tu nombre para que la máquina pueda dictaminar que eres tú,\n" +
                        "y la fecha en la que quieres viajar.\n" +
                        "¿Cuál es tu curso en el centro?"
        );

        clase_xtart = sc.nextLine();
        System.out.println("¿Nombre del que viajara?");
        nombre_alumno = sc.nextLine().trim();
        System.out.println("¿Cuál es tu año de nacimiento?");
        año_nacimiento = sc.nextLine().trim();

        Thread.sleep(1000);
        System.out.println();
        System.out.println(
                nombre_alumno + " de " + clase_xtart +
                        " cogió sus cosas y necesidades y se aventuró hacia " + año_nacimiento +
                        ", el año nació.\n" +
                        "Inició su máquina y empezó a viajar.\n" +
                        "Una ráfaga del flujo temporal desvía la CRONOS-1 exactamente 0,5 cm a la derecha."
        );

        System.out.println(maquina);
        Thread.sleep(1500);

        System.out.println(
                "Se oye un chasquido: tornillos vibran, una tuerca sale disparada, "
                        + "la máquina ha chocado con la pared tridimensional causando daños severos.\n"
                        + RED + "NOOOOOOOOOOO " + RESET + YELLOW + "BOMMMMMMMMMMM" + RESET + "\n"
                        + "Parte del módulo mecánico ha fallado.\n"
                        + "Para volver a casa, debe recuperar piezas, rehacer la máquina pero sin ayuda.\n"
                        + YELLOW + "CHAN CHAN CHAAAAAAAANNNNNN" + RESET + "\n"
        );
        System.out.println("_________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________________-");
    }

    public static void sigloXVIII() {



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

            System.out.println(
                    "Salió de la nave y se puso a investigar sobre qué fallaba, qué pasó y qué había que conseguir.\n" +
                            "La máquina ha sufrido unos daños en algunas piezas casi irreversibles.\n" +
                            "Por suerte, no ha tocado el motor ni la fuente de alimentación; cogió el manual en caso de emergencia y se puso manos a la obra.\n" +
                            "Ves dos tiendas: una es un bar  y la otra es una tienda de empeños. ¿Dónde decides entrar? \n" +
                            BOLD + "EL BAR (1) " + RESET + GREEN + "TIENDA EMPEÑOS (2)" + RESET
            );


            decisiones = sc.nextLine();



            if (decisiones.equals(OPCION_BAR)) {





                do {
                    System.out.println(
                            "Al entrar al bar te motivas y pides un coca-cola. El camarero, atónito por la bebida extraña que has pedido,\n" +
                                    "te sirve un trago de cebada, que era lo que se solía tomar en esa época. Te das cuenta de que el euro no te vale\n" +
                                    "y empiezas a medio escaparte; se dan cuenta y empiezan a amenazarte. No te queda otro remedio que pelear.\n\n" +
                                    BOLD + "¿QUÉ DECIDES?" + RESET + "  Con una botella (" + BOTELLA + ")   |   Con las manos (" + MANOS + ")\n"
                    );
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
                                "Rompes la botella contra la barra, amenazas con clavársela a alguien y escapas hacía la tienda de empeños. \n" +
                                "_______________________________________________________________________________________________________________________________________________________________"

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
                                  RED + "⠀⠀⢠⣿⣿⣿⣿⣿⣿⡿⢀⣼⠟                  "  + RESET +           "  ⠻⣦⣙⣮⡳⢽⣦⡙⢮⡛⠀\n" +
                                  RED + "⠀⢠⣿⣿⣿⣿⣿⣿⣿⣿⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"  + RESET +           "⠀ ⠀⠈⠙⢷⣝⣦⡙⢏⠢⣙⠀\n" +
                                  RED + "⣴⣿⣿⣿⣿⣿⡿⠟⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"   + RESET +                "       ⠙⢷⡙⢮⡓⣍⠀\n" +
                                  RED + "⢾⣿⡿⠿⠟⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠀⠀⠀⠀⠀⠙⢦⡙⢿⡇\n" +

                                        "⢀⢸⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠘⣽⣿⡇⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⡇⣿⣿⣧⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                                        "⠀⠧⣿⡿⠋⠀" + RESET);




                        while (!reiniciar.equals(SI) && !reiniciar.equals(NO)) {
                            System.out.println("¿Seguro que no quieres jugar?");
                            System.out.println("Pulsa 1 para que te lo pregunte de nuevo o 2 para rendirte.");
                            reiniciar = sc.nextLine().trim();

                            if (reiniciar.equals(SI)) {
                                System.out.println("Te lo preguntaré de nuevo entonces.");
                                decisiones = "";
                            } else if (reiniciar.equals(NO)) {
                                System.out.println(RED + "Te acostumbras a esa vida y mueres a los 10 años después, por una viruela común " + RESET);
                                System.exit(0);
                            } else {
                                System.out.println(YELLOW + "VALOR NO VÁLIDO." + RESET);
                            }
                        }

                    } else {
                        System.out.println(YELLOW + "VALOR NO VÁLIDO. Escribe " + BOTELLA + " o " + MANOS + "." + RESET);
                    }
                } while (!lucha.equals(BOTELLA));

            } else if (decisiones.equals(OPCION_TIENDA)) {

                break;
            }else  {
                System.out.println(
                        CYAN +
                        " VALOR INTRODUCIDO NO CORRECTO . Elija 1 para entrar al bar o 2 para ir a la tienda de empeños." + RESET
                );
            }



        } while (!decisiones.equals(OPCION_TIENDA) && !decisiones.equals(OPCION_BAR));


    }

    private static void  laTienda() {

        final String JUGAR = "1";
        final String NO_JUGAR = "2";
        final String SI = "3";
        final String NO = "4";
        String decisiones = "";
        String reiniciar = "";

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        System.out.println( "Entras a la tienda, sabiendo que sigues sin dinero de la época. Sin saber que hacer y te encuentras un anciano.");

        System.out.println("Le explicas la situación , el anciano cansado de la monotonía de la época, te propuso que a cambio de un par de juguecitos\n" +
        "simples y que nunca han pasado de moda. Si lo consigues, te lo dará gratis."
        );

        while (!decisiones.equalsIgnoreCase(JUGAR) && !decisiones.equalsIgnoreCase(NO_JUGAR)) {
            System.out.println("¿Desea jugar? pulsa 1 para jugar o 2 para rechazar la oferta. ");
             decisiones = sc.nextLine();

            if (decisiones.equalsIgnoreCase(JUGAR)) {

                System.out.println( YELLOW + "ADELANTE." + RESET
                        );
                break;



            } else if (decisiones.equalsIgnoreCase(NO_JUGAR)) {
                System.out.println(RED + "¿Estás seguro? Escribe 3 si quieres reiniciar o 4 para rendirte." + RESET);

                while (true) {
                    reiniciar = sc.nextLine().trim();

                    if (reiniciar.equalsIgnoreCase(SI)) {
                        System.out.println("Te lo preguntare de nuevo entonces.");
                        decisiones = "";
                        break;
                    } else if (reiniciar.equalsIgnoreCase(NO)) {
                        System.out.println(RED + "Te acostumbras a esa vida y mueres a los 10 años después, por una viruela común. " + RESET + "\n" +
                                        BROWN +"⠀⠀⢀⣠⣴⣶⠾⠿⣯⣭⣿⣛⡒⠶⢤⣄⡀⠀⠀⠀\n" +
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
                                        "REST IN PEACE  " + RESET);
                        System.exit(0);
                    } else {
                        System.out.println(YELLOW + "VALOR NO VÁLIDO. Escribe 3 o 4." + RESET);
                    }
                }
            }



                    }
                }





    public static void adivinaNumero (){
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

    public static void ahorcado(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Para que la pieza has de adivinar, un pequeño juego has de jugar.");
        System.out.println("El anciano te mira serio y te propone un último reto...\n" +
                "La pista es: objeto que da suerte.");

        String palabra = "talisman";

        juego(palabra, sc);
    }

    public static void juego(String palabra, Scanner sc) {

        final String SI = "1";
        final String NO = "2";

        boolean reiniciar;

        do {
            char[] progreso = new char[palabra.length()];
            boolean adivinado = false;
            int fallos = 0;
            final int MAX_FALLOS = 6;


            for (int i = 0; i < progreso.length; i++) {
                progreso[i] = '_';
            }

            System.out.println("La palabra tiene " + palabra.length() + " letras.\n" +
                    "La pista es: objeto que da suerte.");


            while (!adivinado && fallos < MAX_FALLOS) {


                System.out.print("Progreso: ");
                for (char c : progreso) {
                    System.out.print(c + " ");
                }
                System.out.println();

                System.out.print("Introduce una letra: ");
                String linea = sc.nextLine().toLowerCase().trim();

                if (linea.isEmpty()) {
                    System.out.println(BROWN + "No has introducido nada.\n" + RESET);
                    continue;
                }

                char letra = linea.charAt(0);
                boolean acierto = false;


                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra) {
                        if (progreso[i] == '_') {
                            progreso[i] = letra;
                            acierto = true;
                        }
                    }
                }

                if (!acierto) {
                    fallos++;
                    System.out.println(RED + "Fallaste. Intentos fallidos: " + fallos + "/" + MAX_FALLOS + RESET);
                    imprimirAhorcado(fallos);
                    System.out.println();
                }

                adivinado = true;
                for (char c : progreso) {
                    if (c == '_') {
                        adivinado = false;
                        break;
                    }
                }
            }


            if (adivinado) {
                System.out.println(GREEN + "¡Felicidades! Adivinaste la palabra: " + palabra + RESET);
                System.out.println("El anciano asiente en silencio y te entrega la pieza para la CRONOS-1.");
                reiniciar = false;
            } else {
                System.out.println(RED + "Has perdido. " + RESET);
                System.out.println(BROWN + "El anciano suspira... y el tiempo te reclama." + RESET);

                String repetir;
                reiniciar = false;

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
                    } else {
                        System.out.println(YELLOW + "VALOR NO VÁLIDO. Escribe 1 o 2." + RESET);
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
}

