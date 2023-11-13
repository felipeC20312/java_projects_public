package comPrincipio;

public class PersonagemBase implements Personagem {
    String nome;
    int vida;
    Arma arma;

    public PersonagemBase(String nome, int vida, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public void atacar() {
        System.out.print(nome + " atacou. ");
        arma.usar();
    }

    public void receberDano(int quantidade) {
        vida -= quantidade;
        System.out.println(nome + " recebeu " + quantidade + " de dano. Vida restante: " + vida);
    }
}
