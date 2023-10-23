package comprincipioBuilder;

public class Jogador {
    private String nome;
    private String classe;
    private int nivel;
    private int pontosDeVida;

    private Jogador() {
        // Construtor privado para impedir a criação direta de objetos
    }

    public static class Builder {
        private String nome;
        private String classe;
        private int nivel;
        private int pontosDeVida;

        public Builder(String nome, String classe) {
            this.nome = nome;
            this.classe = classe;
        }

        public Builder nivel(int nivel) {
            this.nivel = nivel;
            return this;
        }

        public Builder pontosDeVida(int pontosDeVida) {
            this.pontosDeVida = pontosDeVida;
            return this;
        }

        public Jogador build() {
            Jogador Jogador = new Jogador();
            Jogador.nome = this.nome;
            Jogador.classe = this.classe;
            Jogador.nivel = this.nivel;
            Jogador.pontosDeVida = this.pontosDeVida;
            return Jogador;
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Pontos de Vida: " + pontosDeVida);
    }
}
