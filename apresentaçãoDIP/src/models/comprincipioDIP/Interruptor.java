package models.comprincipioDIP;

public class Interruptor {
    private Luz luz;

    Interruptor(Luz luz) {
        this.luz = luz;
    }

    void operar() {
        luz.ligar();
    }
}
