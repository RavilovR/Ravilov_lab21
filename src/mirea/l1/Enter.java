package mirea.l1;

public class Enter {
    private Complex complex;
    public Enter(ComplexFactory complexFactory) {

        complex = complexFactory.createComplex();
    }

    public void write() {
        complex.write();
    }
}