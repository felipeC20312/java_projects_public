package comPrincipio;

public class ArmaDecorator implements Personagem {
    private Personagem personagem;
    private Arma arma;

    public ArmaDecorator(Personagem personagem, Arma arma) {
        this.personagem = personagem;
        this.arma = arma;
    }

    public void atacar() {
        personagem.atacar();
        System.out.print(" Equipando ");
        arma.usar();
    }

    public void receberDano(int quantidade) {
        personagem.receberDano(quantidade);
    }
}
