import javax.swing.*;

public class Minesweeper {

    static int _Zeilen  = 3;
    static int _Spalten = 3;

    static String[][] MinefieldMines = SpielfeldAnlegen(_Zeilen, _Spalten, true);
    static String[][] MinefieldUser = SpielfeldAnlegen(_Zeilen, _Spalten, false);

    static int mines = 1;
    static int versuche = 0;



    public static void main(String[] args) {


        boolean Schleife = true;

        while(Schleife==true) {

            SpielfeldAnzeigen(MinefieldUser, _Zeilen, _Spalten);

            int eingZeile= eingeben("Bitte Zeile wählen: ");
            int eingSpalte = eingeben("Bitte Spalte eingeben: ");

            Schleife = SpielfeldPrüfen(eingZeile,eingSpalte);

            Schleife = VersuchePrüfen(versuche, _Zeilen, _Spalten, mines);

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

        System.out.println("_________");

    }




    public static int eingeben(String hinweis) {

        String eingabe = JOptionPane.showInputDialog(hinweis);

        return Integer.parseInt(eingabe);

    }




    public static boolean SpielfeldPrüfen(int Zeile, int Spalte) {

        if (MinefieldMines[Zeile][Spalte] == "[x]") {

            System.out.println("Bumm -  du hast eine Mine erwischt!");

            MinefieldUser[Zeile][Spalte] = "[x]";

            SpielfeldAnzeigen(MinefieldUser, _Zeilen, _Spalten);

            versuche++;

            return false;
        } else {

            SpielfeldAnzeigen(MinefieldUser, _Zeilen, _Spalten);

            System.out.println("Du hast keine Mine erwischt!");

            MinefieldUser[Zeile][Spalte] = "[-]";

            versuche++;

            return true;
        }

    }



    public static boolean VersuchePrüfen(int Versuche, int Zeilen, int Spalten, int Minen) {

        int maxVersuche = (Zeilen*Spalten) - Minen;

        boolean Prüfung = true;

        if (Versuche >= maxVersuche) {

            Prüfung = false;

        }

        return Prüfung;
    }





}
