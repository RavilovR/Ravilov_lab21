package mirea.l2;

public class Client {
    private Chair chair;
    public Client(Fabric fabric) {
        chair = fabric.createChair();
    }

    public void sitOn() {
        chair.sitOn();
    }
}
