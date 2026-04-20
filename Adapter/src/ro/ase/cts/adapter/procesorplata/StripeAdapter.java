package ro.ase.cts.adapter.procesorplata;

public class StripeAdapter implements PlataProcesor{
    private StripeApi stripePayment;

    public StripeAdapter (StripeApi stripe) {this.stripePayment=stripe;}
    @Override
    public void proceseazaPlata(double suma) {
        stripePayment.chargeCard(suma);
    }
}
