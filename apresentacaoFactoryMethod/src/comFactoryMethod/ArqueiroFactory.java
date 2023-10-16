package comFactoryMethod;

public class ArqueiroFactory implements ClasseFactory {
    @Override
    public Jogador criarJogador(String nome) {
        return new Arqueiro(nome);
    }
}