package mirea.l2;

public class Main {

    public static void main(String[] args) {
        Client client = new ClientConfig().configClient();
        client.sitOn();
    }
}
