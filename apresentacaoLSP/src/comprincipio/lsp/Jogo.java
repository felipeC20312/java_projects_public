package comprincipio.lsp;

public class Jogo {
	public static void combate(Personagem personagem1, Personagem personagem2) {
        personagem1.atacar(personagem2);
       System.out.println("Vida do " + personagem2.getNome() + " é: " + personagem2.getVida());
    }	

}
