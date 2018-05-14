public class Minesweeper {

    public static void main(String[] args) {

        String[][] Minefield = SpielfeldAnlegen(3,3);




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


    public static void SpielfeldAnzeigen() {
        


    }





}
