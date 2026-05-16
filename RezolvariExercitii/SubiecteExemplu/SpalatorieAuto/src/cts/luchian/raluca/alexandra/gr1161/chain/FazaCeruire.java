package cts.luchian.raluca.alexandra.gr1161.chain;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class FazaCeruire extends FazaSpalare{
    @Override
    public void aplica(AbstractAutoWashOptions optiuni) {
        if(optiuni.isWaxAndPolishSelected()){
            System.out.println("Aplicare ceara");
        }
        if(urmator!=null){
            urmator.aplica(optiuni);
        }
    }
}
