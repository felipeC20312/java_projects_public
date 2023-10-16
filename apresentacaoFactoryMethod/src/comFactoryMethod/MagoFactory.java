package comFactoryMethod;

public class MagoFactory implements ClasseFactory {
    @Override
    public Jogador criarJogador(String nome) {
        return new Mago(nome);
    }
}