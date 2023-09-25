package comprincipio.lsp;

public abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void receberDano(int dano) {
        this.vida = this.vida - dano;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    // Método abstrato que todos os personagens devem implementar
    public abstract void atacar(Personagem alvo);	

}
