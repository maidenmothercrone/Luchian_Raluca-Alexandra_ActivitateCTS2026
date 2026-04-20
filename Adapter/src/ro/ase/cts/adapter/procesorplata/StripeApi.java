package ro.ase.cts.adapter.procesorplata;

public class StripeApi {
    public void chargeCard(double amount) {
        System.out.println("Stripe: charged " + amount + " RON.");
    }
}
