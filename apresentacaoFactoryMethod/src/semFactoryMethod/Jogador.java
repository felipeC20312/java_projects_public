package semFactoryMethod;

public class Jogador {
    private String nome;
    private String classe;

    public Jogador(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void escolherClasse() {
        if (classe.equals("Guerreiro")) {
            System.out.println(nome + " escolheu a classe Guerreiro.");
            // Inicialização de um Guerreiro
        } else if (classe.equals("Mago")) {
            System.out.println(nome + " escolheu a classe Mago.");
            // Inicialização de um Mago
        } else if (classe.equals("Arqueiro")) {
            System.out.println(nome + " escolheu a classe Arqueiro.");
            // Inicialização de um Arqueiro
        } else {
            System.out.println("Classe inválida.");
        }
    }
}

