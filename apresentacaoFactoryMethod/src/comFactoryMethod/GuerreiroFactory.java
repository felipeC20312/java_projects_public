package comFactoryMethod;

public class GuerreiroFactory implements ClasseFactory {
    @Override
    public Jogador criarJogador(String nome) {
        return new Guerreiro(nome);
    }
}