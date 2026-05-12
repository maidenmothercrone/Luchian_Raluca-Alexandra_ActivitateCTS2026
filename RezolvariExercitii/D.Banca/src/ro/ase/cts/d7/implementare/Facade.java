package ro.ase.cts.d7.implementare;

public class Facade {
    private VerificareVarsta varsta = new VerificareVarsta();
    private VerificarePolitie politie = new VerificarePolitie();
    private VerificareCreante creante = new VerificareCreante();

    public void creareCont(String cnp){
        boolean areVarsta = varsta.verificaVarsta(cnp);
        if (areVarsta){
            boolean areCazier = politie.eUrmarit(cnp);
            if(!areCazier){
                boolean areCreante = creante.areCreante(cnp);
                if(!areCreante){
                    System.out.println("Credit acordat");
                }
            }
        }
    }

}
