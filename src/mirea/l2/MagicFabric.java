package mirea.l2;

public class MagicFabric implements Fabric{
    @Override
    public Chair createChair() {
        return new MagicChair();
    }
}