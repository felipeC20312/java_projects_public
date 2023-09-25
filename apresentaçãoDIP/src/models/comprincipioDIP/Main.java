package models.comprincipioDIP;

public class Main {
    public static void main(String[] args) {
        Luz lampada = new Lampada();
        Interruptor interruptor = new Interruptor(lampada);
        interruptor.operar();
    }
}
