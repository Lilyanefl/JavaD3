package Ecommerce;

public class Carrello {
    String clienteAssociato;
    Articolo[] listaArticoli;
    double costoArticoli;

    public Carrello(String clienteAssociato, double costoArticoli, Articolo[] listaArticoli) {
        this.clienteAssociato = clienteAssociato;
        this.costoArticoli = costoArticoli;
        this.listaArticoli = listaArticoli;
    }
}
