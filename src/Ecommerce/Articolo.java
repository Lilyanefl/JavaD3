package Ecommerce;

public class Articolo {
    private String codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziDisponibili;

    public Articolo(String codiceArticolo, String descrizioneArticolo, double prezzo, int pezziDisponibili){
        this.codiceArticolo = codiceArticolo;
        this.descrizioneArticolo = descrizioneArticolo;
        this.prezzo = prezzo;
        this.pezziDisponibili = pezziDisponibili;
    }
}
