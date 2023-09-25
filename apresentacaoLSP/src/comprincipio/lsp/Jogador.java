package comprincipio.lsp;

public class Jogador extends Personagem {

    public Jogador(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.receberDano(10);
        System.out.println("Jogador " + getNome() + " atacou!");
    }
}
