import javax.swing.*;

public class Minesweeper {

    static int _Zeilen  = 3;
    static int _Spalten = 3;
    static String[][] MinefieldMines = SpielfeldAnlegen(_Zeilen, _Spalten, true);
    static String[][] MinefieldUser = SpielfeldAnlegen(_Zeilen, _Spalten, false);
    static int mines = 0;

    public static void main(String[] args) {

        boolean Schleife = true;

        while(Schleife==true) {

            SpielfeldAnzeigen(MinefieldUser, _Zeilen, _Spalten);

            int eingZeile= eingeben("Bitte Zeile wählen: ");
            int eingSpalte = eingeben("Bitte Spalte eingeben: ");

            Schleife = SpielfeldPrüfen(eingZeile,eingSpalte);

        }

        System.out.println("GAME OVER");




    }

    public static String[][] SpielfeldAnlegen(int Zeilen, int Spalten, boolean Minen) {

        String[][] Minefield = new String[Zeilen][Spalten];

        for(int z = 0; z < Zeilen; z++) {

            for(int s = 0; s < Spalten; s++) {

                Minefield[z][s] = "[ ]";

            }

        }

        if(Minen ==  true) {
            Minefield[2][0] = "[x]";
        }
        return Minefield;
    }


    public static void SpielfeldAnzeigen(String[][] MinefieldUser, int Zeilen, int Spalten) {

        for(int z = 0; z < Zeilen; z++) {

            for(int s = 0; s < Spalten; s++) {

                System.out.print(MinefieldUser[z][s]);

            }

            System.out.println();

        }

        System.out.println("______________");

    }


    public static int eingeben(String hinweis) {

        String eingabe = JOptionPane.showInputDialog(hinweis);

        return Integer.parseInt(eingabe);

    }


    public static boolean SpielfeldPrüfen(int Zeile, int Spalte) {

        if (MinefieldMines[Zeile][Spalte] == "[x]") {

            System.out.println("Bumm -  du hast eine Mine erwischt!");

            return false;
        } else {

            System.out.println("Du hast keine Mine erwischt!");

            MinefieldUser[Zeile][Spalte] = "[-]";

            return true;
        }

    }





}
