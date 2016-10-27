/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte_audíalícia;

import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Projecte_AudíAlícia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int opcio_menu;
        boolean omplert = false;
        char tactil;

        String model = null;
        double pantalla = 0.0;
        boolean esTactil = false;
        String sistemaOp = null;
        double megapixels = 0.0;
        int ram = 0;

        do {    //Ho posem dins d'un do - while per demanar-nos la opció fins que no sigui 0

            System.out.println("+--------------------------------+");
            System.out.println("|     Menú de l'aplicació:       |");
            System.out.println("|--------------------------------|");
            System.out.println("|     0. Sortir                  |");
            System.out.println("|     1. Afegir Smartphone       |");
            System.out.println("|     2. Borrar Smartphone       |");
            System.out.println("|     3. Modificar Smartphone    |");
            System.out.println("|     4. Llistar Smartphones     |");
            System.out.println("|________________________________|");
            System.out.println("");

            System.out.println("Introdueix una opció del menú: ");
            opcio_menu = entrada.nextInt();

            switch (opcio_menu) {

                case 0:
                    System.out.println("El programa ha finalitzat... Adéu!!!");
                    break;
                case 1:
                    if (!omplert) { // Equival a omplert == false

                        System.out.println("Introdueix el model del Smartphone:");
                        model = entrada.nextLine();

                        do {
                            System.out.println("Introdueix les polzades (pantalla):");
                            pantalla = entrada2.nextDouble();

                            if (pantalla < 3.5) {
                                System.out.println("Valor incorrecte!");
                            }
                        } while (pantalla < 3.5);

                        do {
                            System.out.println("És tàctil? (S/N)");
                            tactil = entrada.nextLine().charAt(0);

                            if (tactil == 's' || tactil == 'S') {
                                esTactil = true;
                            }

                            if (tactil == 'n' || tactil == 'N') {
                                esTactil = false;
                            }
                        } while (tactil != 's' && tactil != 'n' && tactil != 'S' && tactil != 'N');

                        System.out.println("Quin sistema operatiu té?");
                        sistemaOp = entrada.nextLine();

                        do {
                            System.out.println("Quants megapíxels té la càmera?");
                            megapixels = entrada2.nextDouble();

                            if (megapixels <= 0) {
                                System.out.println("Valor incorrecte!");
                            }

                        } while (megapixels <= 0);

                        do {
                            System.out.println("Quanta RAM té?");
                            ram = entrada.nextInt();

                            if (ram <= 0) {
                                System.out.println("Valor incorrecte!");
                            }

                        } while (ram <= 0);

                        omplert = true; // Un cop hem omplert els camps, canviem la variable a true
                    } else {
                        System.out.println("Ja has introduït dades per a aquest element!");
                        System.out.println("Si vols omplir-lo, modifical o esborra'l.");

                    }

                    break;

                case 2:

                case 3:

                case 4:

            }
        } while (opcio_menu != 0);

    }

}
