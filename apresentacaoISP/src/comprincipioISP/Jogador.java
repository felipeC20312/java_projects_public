package comprincipioISP;

//Classe do Jogador que implementa as interfaces relevantes
public class Jogador implements Personagem, PersonagemComMagia{
    @Override
    public void mover() {
        // Lógica para mover o Jogador
    }

    @Override
    public void atacar() {
        // Lógica para o Jogador atacar
    }

    @Override
    public void usarMagia() {
        // Lógica para o herói usar magia
    }
}

