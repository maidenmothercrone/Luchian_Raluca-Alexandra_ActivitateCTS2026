package ro.ase.cts.a9b.implementare;

public class VerificareAsigurare extends Handler{
    @Override
    public void gestioneazaCerere(String pacient, boolean areAsigurare) {
        if(areAsigurare){
            System.out.println("Pacientul " + pacient + " urmeaza sa fie internat");
            if(urmator!=null){
                urmator.gestioneazaCerere(pacient, areAsigurare);
            }
        } else {
            System.out.println("Pacientul " + pacient + " nu are asigurare");
        }
    }
}
