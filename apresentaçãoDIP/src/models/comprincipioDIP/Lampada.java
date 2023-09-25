package models.comprincipioDIP;

public class Lampada implements Luz {

    @Override
    public void ligar() {
        System.out.println("A lampada ligou.");
    }
    
}
