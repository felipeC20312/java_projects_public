package comPrincipio;

public class ProxyCena implements Cena {
    private Cena cenaReal;
    private String nome;

    public ProxyCena(String nome) {
        this.nome = nome;
    }

    @Override
    public void carregar() {
        // Carga real ocorre apenas quando a cena é exibida pela primeira vez
        if (cenaReal == null) {
            cenaReal = new CenaConcreta(nome);
        }
    }

    @Override
    public void exibir() {
        carregar(); // Certifique-se de que a cena está carregada antes de exibir
        cenaReal.exibir();
    }
}