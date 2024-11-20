import Cellulare.Cell;
import Rettangolo.Rettangolo;

public class Main {
    public static void main(String[] args) {

        Rettangolo rettangolo = new Rettangolo(3.0,2.0);
        Rettangolo rettangolo2 = new Rettangolo(5.0,10.0);
        Rettangolo.stampaRettangolo(rettangolo);
        Rettangolo.stampaDueRettangoli(rettangolo,rettangolo2);

        Cell SIM = new Cell("+3937194321", new String[5] );
        SIM.setCredito(5);
        SIM.stampaDati();
        String[] chiamata = new String[5];
        chiamata[0] = "1, 2, 3, 4";
        SIM.setChiamate(chiamata);
    }
}