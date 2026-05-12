package ro.ase.cts.b7.implementare;

public class FelicitareDecorator extends NotaDecorator{
    public FelicitareDecorator(INotaDePlata nota) {
        super(nota);
    }

    @Override
    public void printeaza() {
        nota.printeaza();
        System.out.println("La multi ani!");
    }
}
