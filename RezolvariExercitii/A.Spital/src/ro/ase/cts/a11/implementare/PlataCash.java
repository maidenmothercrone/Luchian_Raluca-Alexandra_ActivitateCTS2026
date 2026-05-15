package ro.ase.cts.a11.implementare;

public class PlataCash implements IModPlata{

    @Override
    public void plateste(double suma) {
        System.out.println("Incasat " + suma + " RON cu cash");
    }
}
