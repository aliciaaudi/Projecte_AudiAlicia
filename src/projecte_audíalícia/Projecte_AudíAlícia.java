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

        int opcio_menu; // Selecciona l'opció del menú (switch)
        boolean omplert = false; // Informació omplerta o no

        char tactil; // Serveix per determinar si és tactil o no (S/N)
        char dades; // Serveix per confirmar si volem veure les dades del Smartphone o no (Abans l'esborrat) (S/N)
        char esborrar; // Serveix per confirmar l'esborrat d'un Smartphone (S/N)
        char modificar; // Serveix per confirmar si vols modificar una dada o no

        String model = null; // Model del Smartphone
        double pantalla = 0.0; // Polzades de la pantalla
        boolean esTactil = false; // És tàctil o no
        String sistemaOp = null; // Sistema operatiu
        double megapixels = 0.0; // Megapíxels càmera
        int ram = 0; // Memòria RAM

        do {    //Ho posem dins d'un do - while per demanar-nos la opció fins que no sigui 0

            System.out.println("+----------------------------------+");
            System.out.println("|     Menú de l'aplicació:         |");
            System.out.println("|----------------------------------|");
            System.out.println("|     0. Sortir                    |");
            System.out.println("|     1. Afegir Smartphone         |");
            System.out.println("|     2. Esborrar Smartphone       |");
            System.out.println("|     3. Modificar Smartphone      |");
            System.out.println("|     4. Llistar Smartphones       |");
            System.out.println("|     5. Recuperar Dades           |");
            System.out.println("|__________________________________|");
            System.out.println("");

            System.out.println("Introdueix una opció del menú: ");
            opcio_menu = entrada.nextInt();

            switch (opcio_menu) {

                case 0: // SORTIR

                    System.out.println("El programa ha finalitzat... Adéu!!!");
                    break;

                case 1: // AFEGIR

                    if (!omplert) { // Equival a omplert == false

                        System.out.println("Introdueix el model del Smartphone:");
                        model = entrada.skip("[\r\n]*").nextLine();

                        do {
                            System.out.println("Introdueix les polzades (pantalla => 3,5):");
                            pantalla = entrada.nextDouble();

                            if (pantalla < 3.5) {
                                System.out.println("Valor incorrecte!");
                            }

                        } while (pantalla < 3.5);

                        do {
                            System.out.println("És tàctil? (S/N)");
                            tactil = entrada.skip("[\r\n]*").nextLine().charAt(0);

                            if (tactil == 's' || tactil == 'S') {
                                esTactil = true;
                            }

                            if (tactil == 'n' || tactil == 'N') {
                                esTactil = false;
                            }

                        } while (tactil != 's' && tactil != 'n' && tactil != 'S' && tactil != 'N');

                        System.out.println("Quin sistema operatiu té?");
                        sistemaOp = entrada.skip("[\r\n]*").nextLine();

                        do {
                            System.out.println("Quants megapíxels té la càmera? (< 0)");
                            megapixels = entrada.nextDouble();

                            if (megapixels <= 0) {
                                System.out.println("Valor incorrecte!");
                            }

                        } while (megapixels <= 0);

                        do {
                            System.out.println("Quanta RAM té? (> 0)");
                            ram = entrada.skip("[\r\n]*").nextInt();

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

                case 2: // ESBORRAR

                    if (omplert) {

                        do {

                            System.out.println("Vols veure les dades del Smartphone? (S/N)");
                            dades = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (dades != 's' && dades != 'n' && dades != 'S' && dades != 'N');

                        if (dades == 's' || dades == 'S') {
                            System.out.println("Dades del Smartphone: ");
                            System.out.println("Model: " + model);
                            System.out.println("Pantalla (polzades): " + pantalla);

                            if (esTactil) {
                                System.out.println("Tàctil: Sí");
                            }

                            if (!esTactil) {
                                System.out.println("Tàctil: No");
                            }

                            System.out.println("Sistema Operatiu: " + sistemaOp);
                            System.out.println("Megapíxels: " + megapixels);
                            System.out.println("RAM: " + ram);
                        } 

                        do {

                            System.out.println("Segur que el vols esborrar? (S/N)");
                            esborrar = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (esborrar != 's' && esborrar != 'n' && esborrar != 'S' && esborrar != 'N');

                        if (esborrar == 's' || esborrar == 'S') {
                            omplert = false;

                            System.out.println("Dades del Smartphone esborrades!");
                            break;
                        }

                    } else {
                        System.out.println("No hi ha cap Smartphone per borrar, si el vols borrar l'hauràs d'introduïr primer.\n" + "");
                    }

                case 3: // MODIFICAR

                    if (!omplert) {
                        System.out.println("No hi ha cap Smartphone per modificar, si el vols modificar l'hauràs d'introduïr primer.\n" + "");
                    }

                    if (omplert) {

                        do {

                            System.out.println("Vols veure les dades del Smartphone? (S/N)");
                            dades = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (dades != 's' && dades != 'n' && dades != 'S' && dades != 'N');

                        if (dades == 's' || dades == 'S') {
                            System.out.println("Dades del Smartphone: ");
                            System.out.println("Model: " + model);
                            System.out.println("Pantalla (polzades): " + pantalla);

                            if (esTactil) {
                                System.out.println("Tàctil: Sí");
                            }

                            if (!esTactil) {
                                System.out.println("Tàctil: No");
                            }

                            System.out.println("Sistema Operatiu: " + sistemaOp);
                            System.out.println("Megapíxels: " + megapixels);
                            System.out.println("RAM: " + ram);
                        }

                        do {

                            System.out.println("Vols modificar les dades del Smartphone? (S/N)");
                            dades = entrada.skip("[\r\n]*").nextLine().charAt(0);

                        } while (dades != 's' && dades != 'n' && dades != 'S' && dades != 'N');

                        if (dades == 's' || dades == 'S') {

                            // MODEL
                            System.out.println("\nModel: " + model);

                            do {
                                System.out.println("Vols modificar el model? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                System.out.println("Introdueix el NOU model del Smartphone:");
                                model = entrada.skip("[\r\n]*").nextLine();
                            }

                            // POLZADES (PANTALLA)
                            System.out.println("\nPantalla (polzades): " + pantalla);

                            do {
                                System.out.println("Vols modificar el les polzades (pantalla)? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {

                                do {
                                    System.out.println("Introdueix el NOU valor de polzades (pantalla => 3,5):");
                                    pantalla = entrada.nextDouble();

                                    if (pantalla < 3.5) {
                                        System.out.println("Valor incorrecte!");
                                    }

                                } while (pantalla < 3.5);
                            }

                            // TÀCTIL O NO
                            if (esTactil) {
                                System.out.println("\nTàctil: Sí");
                            }

                            if (!esTactil) {
                                System.out.println("\nTàctil: No");
                            }

                            do {
                                System.out.println("Vols modificar si és tàctil o no? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el NOU valor per a tàctil: (S/N)");
                                    tactil = entrada.skip("[\r\n]*").nextLine().charAt(0);

                                    if (tactil == 's' || tactil == 'S') {
                                        esTactil = true;
                                    }

                                    if (tactil == 'n' || tactil == 'N') {
                                        esTactil = false;
                                    }

                                } while (tactil != 's' && tactil != 'n' && tactil != 'S' && tactil != 'N');

                            }

                            //  SISTEMA OPERATIU
                            System.out.println("\nSistema Operatiu: " + sistemaOp);

                            do {
                                System.out.println("Vols modificar el sistema operatiu? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                System.out.println("Introdueix el NOU valor per a sistema operatiu:");
                                sistemaOp = entrada.skip("[\r\n]*").nextLine();
                            }

                            // MEGAPÍXELS
                            System.out.println("\nMegapíxels: " + megapixels);

                            do {
                                System.out.println("Vols modificar el valor dels megapíxels? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el NOU valor per a megapíxels: (< 0)");
                                    megapixels = entrada.nextDouble();

                                    if (megapixels <= 0) {
                                        System.out.println("Valor incorrecte!");
                                    }

                                } while (megapixels <= 0);
                            }

                            // RAM
                            System.out.println("\nRAM: " + ram);

                            do {
                                System.out.println("Vols modificar el valor de la RAM? (S/N)");
                                modificar = entrada.skip("[\r\n]*").nextLine().charAt(0);
                            } while (modificar != 's' && modificar != 'n' && modificar != 'S' && modificar != 'N');

                            if (modificar == 's' || modificar == 'S') {
                                do {
                                    System.out.println("Introdueix el NOU valor de la RAM: (> 0)");
                                    ram = entrada.nextInt();

                                    if (ram <= 0) {
                                        System.out.println("Valor incorrecte!");
                                    }

                                } while (ram <= 0);
                            }

                            System.out.println("\nSmartphone modificat correctament.\n");

                            break;
                        }

                    }

                case 4: // LLISTAR

                    if (omplert == true) {
                        System.out.println("Dades del Smartphone: ");
                        System.out.println("Model: " + model);
                        System.out.println("Pantalla (polzades): " + pantalla);

                        if (esTactil) {
                            System.out.println("Tàctil: Sí");
                        }

                        if (!esTactil) {
                            System.out.println("Tàctil: No");
                        }

                        System.out.println("Sistema Operatiu: " + sistemaOp);
                        System.out.println("Megapíxels: " + megapixels);
                        System.out.println("RAM: " + ram);
                    } else {
                        System.out.println("No hi ha cap Smartphone per llistar!!");
                        break;
                    }

                case 5: // RECUPERAR
                    omplert = true;
                    
                    System.out.println("Dades del Smartphone: ");
                    System.out.println("Model: " + model);
                    System.out.println("Pantalla (polzades): " + pantalla);

                    if (esTactil) {
                        System.out.println("Tàctil: Sí");
                    }

                    if (!esTactil) {
                        System.out.println("Tàctil: No");
                    }

                    System.out.println("Sistema Operatiu: " + sistemaOp);
                    System.out.println("Megapíxels: " + megapixels);
                    System.out.println("RAM: " + ram);
            }
        } while (opcio_menu != 0);

    }

}
