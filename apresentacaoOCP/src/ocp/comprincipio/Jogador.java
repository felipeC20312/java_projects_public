package ocp.comprincipio;

public class Jogador {
    private String nome;
    private Habilidade habilidade;

    public Jogador(String nome, Habilidade habilidade) {
        this.nome = nome;
        this.habilidade = habilidade;
    }

    public void usarHabilidade() {
        habilidade.usarHabilidade();
    }
    
}