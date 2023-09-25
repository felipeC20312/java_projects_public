package semprincipioISP;

public class Monstros implements Personagem {
    @Override
    public void mover() {
        // Lógica para mover o monstro
    }

    @Override
    public void atacar() {
        // Lógica para o monstro atacar
    }

    @Override
    public void usarMagia() {
        // O monstro não deveria poder usar magia, mas é forçado a implementar o método.
    }
}