package ro.ase.cts.adapter.procesorplata;

public class Main {
    static void main(String[] args) {
        PayPalApi plataPaypal = new PayPalApi();
         PlataProcesor p = new PaypalAdapter(plataPaypal);

         p.proceseazaPlata(250);
    }
}
