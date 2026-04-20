package ro.ase.cts.adapter.procesorplata;

public class PaypalAdapter implements PlataProcesor {
   private PayPalApi plata;

    public PaypalAdapter (PayPalApi p) {this.plata=p;}

    public void proceseazaPlata(double suma){
        plata.makePayment(suma);
    }
}
