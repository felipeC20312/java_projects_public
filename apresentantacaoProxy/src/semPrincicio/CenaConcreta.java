package semPrincicio;

public class CenaConcreta implements Cena {
    private String nome;

    public CenaConcreta(String nome) {
        this.nome = nome;
        carregar(); // Carga ocorre durante a criação do objeto
    }

    @Override
    public void carregar() {
        System.out.println("Carregando cena: " + nome);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo cena: " + nome);
    }
}
