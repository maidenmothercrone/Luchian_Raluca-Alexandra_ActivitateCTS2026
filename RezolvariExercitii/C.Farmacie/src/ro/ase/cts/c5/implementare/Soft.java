package ro.ase.cts.c5.implementare;

public class Soft implements ISoftVechi{
    @Override
    public void setareMedicament(int id) {
        System.out.println("Medicamentul setat e cel cu id ul" + id);
    }

    @Override
    public void verificareDisponibilitate(int nrMedicamente) {
        if(nrMedicamente>0){
            System.out.println("Medicamentul exista");
        } else System.out.println("Medicamentul nu exista");

    }
}
