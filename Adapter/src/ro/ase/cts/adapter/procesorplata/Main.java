package ro.ase.cts.adapter.procesorplata;

public class Main {
    static void main(String[] args) {
        PayPalApi plataPaypal = new PayPalApi();
         PlataProcesor p = new PaypalAdapter(plataPaypal);

         p.proceseazaPlata(250);

         StripeApi plataStripe = new StripeApi();
         PlataProcesor p2 = new StripeAdapter(plataStripe);

         p.proceseazaPlata(175);
    }
}
