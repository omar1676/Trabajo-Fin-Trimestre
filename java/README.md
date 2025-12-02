# HistoriaAventura – CRONOS-1

## Descripción general
HistoriaAventura es un juego de aventura por consola en Java en el que el jugador viaja en el tiempo usando la máquina CRONOS-1. A lo largo del juego se toman decisiones, se completan minijuegos y se responden preguntas de cultura general para intentar reparar la máquina y volver al presente.

El jugador comienza en el centro XTART, elige su curso (DAM o ASIR), introduce su nombre y su año de nacimiento. Tras ello viaja al siglo XVIII, donde deberá superar diferentes situaciones que afectan directamente al desarrollo de la historia.

---

## Funcionalidades principales

### Decisiones y narrativa
La aventura está dividida en varios actos. El jugador toma decisiones mediante números o letras, lo cual cambia el rumbo de la historia y puede provocar finales distintos.  
El texto se muestra con pausas mediante métodos como `escribirLinea` y `escribirLento`.

### Validación de entrada
Se utiliza el método `leerNumero(min, max)` para:
- Evitar entradas vacías
- Asegurar que solo se introduzcan números
- Comprobar que el valor está dentro del rango permitido

### Inventario
El juego incluye un sistema de inventario basado en un array de 10 espacios.  
Con `añadirAlInventario()` se agregan objetos como:
- Llave oxidada del anciano
- Talismán de la suerte

Con `mostrarInventario()` se muestran todos los objetos obtenidos durante el viaje.

---

## Minijuegos

### “Adivina el número”
- Número secreto entre 1 y 10
- Tres intentos para acertarlo
- Pistas si el jugador se pasa o se queda corto
- Si acierta, obtiene un objeto y avanza
- Si falla, puede reiniciar o rendirse

### “El Ahorcado”
- Palabra: **talisman**
- Máximo de 6 fallos
- Control de letras repetidas
- Si acierta, obtiene un objeto importante
- Si pierde, puede reiniciar la partida

---

## Panel de estabilidad temporal (Preguntas del laboratorio)
El jugador debe responder 4 preguntas de cultura general:
1. Reyes del Antiguo Egipto
2. Extinción de los dinosaurios
3. Quién dio nombre a América
4. Alumno de Aristóteles

El número de aciertos determina el final del juego:
- **0–1 aciertos:** la CRONOS-1 explota (final malo)
- **2–3 aciertos:** el jugador queda atrapado fuera del tiempo (final intermedio)
- **4 aciertos:** estabilidad al 100% y regreso exitoso al XTART (final bueno)

---

## Estructura del código

### Métodos principales
- `main()`: coordina toda la aventura
- `banner()`, `introduccion()`, `decisiones()`, `maquinaDelTiempo()`
- `actoNumero1()`, `sigloXVIII()`, `laTienda()`
- `adivinaNumero()`, `ahorcado()`
- `pregunta1()`, `laboratorio()`

### Métodos auxiliares
- `escribirLinea()`, `escribirLento()`, `separador()`
- `esperar()` para pausas
- `leerNumero()` para validar entradas
- `reiniciar()` para volver atrás o terminar

---

## Ejecución del juego

1. Guardar el archivo como:
   HistoriaAventura.java

2.  Compilar:
    javac HistoriaAventura.java

3. Ejecutar:
   java HistoriaAventura

4. Seguir las instrucciones en pantalla:
- Introducir números para decisiones
- Introducir letras para las preguntas
- Introducir letras individuales para el ahorcado

---

## Objetivo final del jugador
- Superar los minijuegos
- Tomar decisiones que permitan sobrevivir
- Responder correctamente las preguntas del laboratorio
- Conseguir los objetos del inventario
- Alcanzar el **final bueno**: CRONOS-1 al 100% de estabilidad y regreso seguro al XTART  

---

## Versiones compatibles
- **Java 8**
- **Java 11**
- **Java 17**
- **Java 21** (recomendado)

El programa funciona correctamente en cualquier versión moderna del JDK.

---

## Autores
Proyecto realizado por:
- **Omar**
- **Renzo**
- **Diego**
- **Álvaro**

---