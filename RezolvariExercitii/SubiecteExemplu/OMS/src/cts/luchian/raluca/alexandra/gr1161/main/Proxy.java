package cts.luchian.raluca.alexandra.gr1161.main;

import java.util.ArrayList;
import java.util.List;

public class Proxy implements ISpital{
    private Spital spital;

    private List<String> salaAsteptare = new ArrayList<>();


    @Override
    public void acceseazaSalon(String numeVizitator, boolean areScrisoare) {
        if(!areScrisoare){
            System.out.println(numeVizitator + "refuzat - lipseste scrisoarea medicala");
            return;
        }
        salaAsteptare.add(numeVizitator);
        if(salaAsteptare.size()>=3){
            if(spital==null){
                spital=new Spital();
                System.out.println("Minim 3 vizitatori se echipeaza");
                for (String vizitator : salaAsteptare){
                    spital.acceseazaSalon(vizitator, true);
                }
                salaAsteptare.clear();
            }

        }
    }
}
