package ocp.semprincipio;

public class Jogador {
    private String nome;
    private String classe;

    public Jogador(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
    }

    public void usarHabilidade() {
        if (classe.equals("Guerreiro")) {
        	// detalhes da habilidade
        } 
        else 
        	if (classe.equals("Mago")) {
            // detalhes da habilidade
        		
        }
        // aqui posso adicionar mais classes
    }
}