package comprincipioISP;

//Classe do Jogador que implementa as interfaces relevantes
public class Jogador implements Personagem, PersonagemComMagia{
    @Override
    public void mover() {
        // Lógica para mover o herói
    }

    @Override
    public void atacar() {
        // Lógica para o herói atacar
    }

    @Override
    public void usarMagia() {
        // Lógica para o herói usar magia
    }
}

