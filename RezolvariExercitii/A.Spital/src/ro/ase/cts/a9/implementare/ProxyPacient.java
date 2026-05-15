package ro.ase.cts.a9.implementare;

public class ProxyPacient implements IPacient{
    private PacientReal pacientReal;
    private boolean areAsigurare;

    public ProxyPacient(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    @Override
    public void interneaza(String numePacient) {
        if(!areAsigurare){
            System.out.println("Pacientul " + numePacient + " nu poate fi internat");
            return;
        }
        if(pacientReal==null){
            pacientReal = new PacientReal();
        }
        pacientReal.interneaza(numePacient);
    }
}
