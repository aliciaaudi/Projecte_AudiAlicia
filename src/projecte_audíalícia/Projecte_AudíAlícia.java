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

        int opcio_menu;
        boolean omplert = true;

        String model = null;
        int pantalla = 0;
        boolean esTactil = false;
        String sistemaOp = null;
        double megapixels = 0;
        int ram = 0;

        do {    //Ho posem dins d'un do - while per demanar-nos la opció fins que no sigui 0

            System.out.println("+------------------------------+");
            System.out.println("|     Menú de l'aplicació:     |");
            System.out.println("|------------------------------|");
            System.out.println("|     0. Sortir                |");
            System.out.println("|     1. Afegir Smartphone     |");
            System.out.println("|     2. Borrar Smartphone     |");
            System.out.println("|     3. Modificar Smartphone  |");
            System.out.println("|     4. Llistar Smartphones   |");
            System.out.println("|______________________________|");
            System.out.println("");

            System.out.println("Introdueix una opció del menú: ");
            opcio_menu = entrada.nextInt();

            switch (opcio_menu) {

                case 0:
                    System.out.println("El programa ha finalitzat... Adéu!!!");
                    break;
                case 1:

                case 2:

                case 3:

                case 4:

            }

        } while (opcio_menu != 0);

    }

}
