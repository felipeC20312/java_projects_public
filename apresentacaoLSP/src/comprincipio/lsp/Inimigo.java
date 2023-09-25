package comprincipio.lsp;

public class Inimigo extends Personagem {

    public Inimigo(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.receberDano(5);
        System.out.println("Inimigo " + getNome() + " atacou!");
    }
}
