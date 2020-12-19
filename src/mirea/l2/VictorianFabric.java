package mirea.l2;

public class VictorianFabric implements Fabric{
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}