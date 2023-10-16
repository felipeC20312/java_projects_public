package comprincipioSingleton;

public class Jogador {
    private String nome;
    private int vida;
    private int pontos;

    private static Jogador instance;

    private Jogador(String nome) {
        this.nome = nome;
        this.vida = 100;
        this.pontos = 0;
    }

    public static Jogador getInstance(String nome) {
        if (instance == null) {
            instance = new Jogador(nome);
        }
        return instance;
    }

    public void calculavida(int dano) {
        this.vida -= dano;
    }

    public void calculaPonto(int pontos) {
        this.pontos += pontos;
    }

    public void mostraStatus() {
        System.out.println("nome: " + nome);
        System.out.println("vida: " + vida);
        System.out.println("pontos: " + pontos);
    }
}