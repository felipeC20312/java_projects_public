package semprincipioBuilder;

public class Jogador {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;

    public Jogador(String nome, String classe, int nivel, int pontosDeVida) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosDeVida = pontosDeVida;
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
    }
}