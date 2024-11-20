package Ecommerce;

public class Cliente {
    String codiceCliente;
    String nomeCognome;
    String email;
    String dataIscrizione;

    public Cliente(String codiceCliente, String dataIscrizione, String email, String nomeCognome) {
        this.codiceCliente = codiceCliente;
        this.dataIscrizione = dataIscrizione;
        this.email = email;
        this.nomeCognome = nomeCognome;
    }
}
