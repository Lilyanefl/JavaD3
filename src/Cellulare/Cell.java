package Cellulare;

public class Cell {
    private String numeroCell;
    private double credito;
    private String[] chiamate;

    public Cell(String numeroCell, String[] chiamate){
    setNumeroCell(numeroCell);
    setChiamate(chiamate);
    }

    public void setNumeroCell(String numeroCell) {
        this.numeroCell = numeroCell;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public void setChiamate(String[] chiamate) {
        this.chiamate = chiamate;
    }

    public double getCredito() {
        return credito;
    }

    public String getNumeroCell() {
        return numeroCell;
    }


    public void stampaDati(){
        System.out.println("Il credito è: " + getCredito());
        System.out.println("Il numero è: " + getNumeroCell());
        for (int i = 0; i < this.chiamate.length; i++) {
            System.out.println("la lista delle chiamate è: " + this.chiamate[i]);
        }
    }

}
