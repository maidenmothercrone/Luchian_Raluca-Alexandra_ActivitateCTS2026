package ro.ase.cts.d5.implementare;

public class Leasingimpl implements ILeasing {
    @Override
    public void initializeazaClient(String cnp) {
        System.out.println("Clientul are CNP ul " + cnp);
    }

    @Override
    public void seteazaValoareLeasing(double valoare) {
        System.out.println("Clientul cere un leasing in valoare de " + valoare + " lei.");
    }

    @Override
    public boolean aprobaLeasing() {
        System.out.println("Leasing aprobat");
        return true;
    }
}
