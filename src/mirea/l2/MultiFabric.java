package mirea.l2;

public class MultiFabric implements Fabric{
    @Override
    public Chair createChair() {
        return new MultiChair();
    }
}
