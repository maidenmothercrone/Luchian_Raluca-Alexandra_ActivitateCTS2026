package ro.ase.cts.b7.implementare;

public abstract class NotaDecorator implements INotaDePlata{
    protected INotaDePlata nota;

    public NotaDecorator(INotaDePlata nota) {
        this.nota = nota;
    }
}
