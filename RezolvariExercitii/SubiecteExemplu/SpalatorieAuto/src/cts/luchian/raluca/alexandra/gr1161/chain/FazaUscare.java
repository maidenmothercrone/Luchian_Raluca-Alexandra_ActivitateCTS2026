package cts.luchian.raluca.alexandra.gr1161.chain;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class FazaUscare extends FazaSpalare{
    @Override
    public void aplica(AbstractAutoWashOptions optiuni) {
        if(optiuni.isDryingSelected()){
            System.out.println("Aplicare uscare");
        }
        if(urmator!=null){
            urmator.aplica(optiuni);
        }
    }
}
