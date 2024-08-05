package com.revisiondecodigo4;

/*Primero, en el método main, utilizo Scanner para leer las opciones de ambos jugadores, determino al ganador con el método determinarGanador y muestro el resultado en la consola. Finalmente, cierro el Scanner y gestiono las jugadas para indicar quién gana o si hay empate.*/

 import java.util.Scanner;

 /*
 Este programa simula el juego de piedra, papel o tijeras entre dos personas.
 El software recoge las selecciones de ambos jugadores y determina al ganador o si hay un empate.
 */
    public class PiedraPapelTijeras {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

     // Solicité y registré la opción del primer jugador
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = scanner.nextLine().toLowerCase(); // Converti a minúsculas para simplificar comparaciones

     //  Registré la elección del segundo jugador
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = scanner.nextLine().toLowerCase(); // Converti a minúsculas para simplificar comparaciones

        int ganador = determinarGanador(j1, j2);

        //Obtuve el resultado 
        if (ganador == 0) {
            System.out.println("Empate");
        } else {
            System.out.println("Gana el jugador " + ganador);
        }

        scanner.close();
    }

    /**
 * Seleccioné quién es el ganador en piedra, papel o tijeras.
 * @param j1 Movimiento del primer jugador
 * @param j2 Movimiento del segundo jugador
 * @return 0 si es un empate, 1 si el primer jugador gana, 2 si el segundo jugador gana
 */
    public static int determinarGanador(String j1, String j2) {
       // Convertí las juagadas a minúsculas para prevenir problemas de distinción entre mayúsculas y minúsculas
        j1 = j1.toLowerCase();
        j2 = j2.toLowerCase();

        if (j1.equals(j2)) {
            return 0; // Empate
        } else if ((j1.equals("piedra") && j2.equals("tijeras")) ||
                   (j1.equals("papel") && j2.equals("piedra")) ||
                   (j1.equals("tijeras") && j2.equals("papel"))) {
            return 1; // Gana jugador 1
        } else {
            return 2; // Gana jugador 2
        }
    }
    }
