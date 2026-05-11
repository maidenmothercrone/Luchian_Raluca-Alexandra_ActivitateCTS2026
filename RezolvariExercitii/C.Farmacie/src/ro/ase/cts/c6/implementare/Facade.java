package ro.ase.cts.c6.implementare;

public class Facade {
   private CardSanatate cardSanatate = new CardSanatate();
   private Depozit depozit = new Depozit();
   private SistemRetete retete = new SistemRetete();

   public void proceseazaCerere(String client, String medicament){
       boolean areCardSanatate = cardSanatate.verificaCard(client);
       if (areCardSanatate){
           boolean areReteta = retete.verificaReteta(client);
           if(areReteta){
               boolean areMedicamentDepozit = depozit.verificaDisponibilitate(medicament);
               if(areMedicamentDepozit){
                   System.out.println("Clientul " + client + " va achizitiona medicamentul " + medicament + " in baza retetei si a cardului de sanatate.");
               }
           }
       }
   }
}