package models.semprincipioDIP;

public class Interruptor {
    private Lampada lampada;

    Interruptor() {
        lampada = new Lampada();
    }

    void operar() {
        lampada.ligar();
    }
}
