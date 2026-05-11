package ro.ase.cts.b6.implementare;

public class Facade {
    private MasaRestaurant masaLibera = new MasaRestaurant();
    private ServiciuDebarasare masaDebarasata = new ServiciuDebarasare();
    private ServiciuServetele serviciuServetele = new ServiciuServetele();

    public void gestionareRestaurant(){
       boolean eLibera =  masaLibera.verificaMasaLibera();
        if (eLibera){
            boolean eDebarasata = masaDebarasata.verificaDebarasata();
            if(eDebarasata){
               boolean areServetele = serviciuServetele.verificaServetele();
                if(areServetele){
                    System.out.println("Redirectioneaza clientul catre masa lui.");
                }
            }

        }
    }
}
