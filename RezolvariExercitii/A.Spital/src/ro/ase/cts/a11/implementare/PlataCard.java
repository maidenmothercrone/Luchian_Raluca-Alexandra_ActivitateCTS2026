package ro.ase.cts.a11.implementare;

public class PlataCard implements IModPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("Incasat " + suma + " RON cu card");
    }
}
