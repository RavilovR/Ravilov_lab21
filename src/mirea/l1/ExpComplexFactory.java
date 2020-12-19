package mirea.l1;

public class ExpComplexFactory implements ComplexFactory {

    @Override
    public Complex createComplex() {
        return new ExpComplex();
    }
}
