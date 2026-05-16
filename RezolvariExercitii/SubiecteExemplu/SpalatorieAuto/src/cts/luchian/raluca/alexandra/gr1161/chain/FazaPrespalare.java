package cts.luchian.raluca.alexandra.gr1161.chain;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class FazaPrespalare extends FazaSpalare{
    @Override
    public void aplica(AbstractAutoWashOptions optiuni) {
        if(optiuni.isPrewashSelected()){
            System.out.println("Aplicare prespalare");
        }
        if(urmator!=null){
            urmator.aplica(optiuni);
        }
    }
}
