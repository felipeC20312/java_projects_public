package comFactoryMethod;

public class Guerreiro extends Jogador {
    public Guerreiro(String nome) {
        super(nome, "Guerreiro");
    }

    @Override
    public void escolherClasse() {
        System.out.println(getNome() + " escolheu a classe Guerreiro.");
        // Inicialização de um Guerreiro
    }
}