package comFactoryMethod;

public class Arqueiro extends Jogador {
    public Arqueiro(String nome) {
        super(nome, "Arqueiro");
    }

    @Override
    public void escolherClasse() {
        System.out.println(getNome() + " escolheu a classe Arqueiro.");
        // Inicialização de um Arqueiro
    }
}