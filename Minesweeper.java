public class Minesweeper {

    static int _Zeilen  = 3;
    static int _Spalten = 3;

    public static void main(String[] args) {

        String[][] Minefield = SpielfeldAnlegen(_Zeilen,_Spalten);

        SpielfeldAnzeigen(Minefield, _Zeilen, _Spalten);



    }

    public static String[][] SpielfeldAnlegen(int Zeilen, int Spalten) {

        String[][] Minefield = new String[Zeilen][Spalten];

        for(int z = 0; z < Zeilen; z++) {

            for(int s = 0; s < Spalten; s++) {

                Minefield[z][s] = "[ ]";

            }

        }

        return Minefield;
    }


    public static void SpielfeldAnzeigen(String[][] Minefield, int Zeilen, int Spalten) {

        for(int z = 0; z < Zeilen; z++) {

            for(int s = 0; s < Spalten; s++) {

                System.out.print(Minefield[z][s]);

            }

            System.out.println();

        }


    }





}
