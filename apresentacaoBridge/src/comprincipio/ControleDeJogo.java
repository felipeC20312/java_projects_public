package comprincipio;

public class ControleDeJogo implements Controle {
    private Plataforma plataforma;

    public ControleDeJogo(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public void moverDireita() {
        plataforma.mover("direita");
    }

    @Override
    public void moverEsquerda() {
        plataforma.mover("esquerda");
    }
}
