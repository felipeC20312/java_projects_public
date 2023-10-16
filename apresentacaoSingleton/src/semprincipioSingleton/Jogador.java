package semprincipioSingleton;

public class Jogador {
	private String nome;
	private int vida;
	private int pontos;

	public Jogador(String name) {
		this.nome = name;
		this.vida = 100;
		this.pontos = 0;
	}

	public void calculavida(int dano) {
		this.vida -= dano;
	}

	public void calculaPonto(int pontos) {
		this.pontos += pontos;
	}

	public void mostraStatus() {
		System.out.println("Name: " + nome);
		System.out.println("Vida: " + vida);
		System.out.println("Pontos: " + pontos);
	}
}
