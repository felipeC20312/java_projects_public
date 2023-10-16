package comFactoryMethod;

public class Mago extends Jogador {
    public Mago(String nome) {
        super(nome, "Mago");
    }

    @Override
    public void escolherClasse() {
        System.out.println(getNome() + " escolheu a classe Mago.");
        // Inicialização de um Mago
    }
}