package ro.ase.cts.b9.implementare;

public class ProxyRezervare implements IRezervare{
    private RezervareReala rezervareReala;


    @Override
    public void rezerva(String numeClient, int nrPersoane) {
        if(nrPersoane<4){
            System.out.println("Este nevoie de minim 4 persoane pentru rezervare");
            return;
        }
        if(nrPersoane>=4){
            if(rezervareReala==null) {
                rezervareReala = new RezervareReala();
            }
            rezervareReala.rezerva(numeClient, nrPersoane);
        }
    }
}
