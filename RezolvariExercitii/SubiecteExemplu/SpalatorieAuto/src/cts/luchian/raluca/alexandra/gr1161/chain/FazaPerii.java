package cts.luchian.raluca.alexandra.gr1161.chain;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class FazaPerii extends FazaSpalare{
    @Override
    public void aplica(AbstractAutoWashOptions optiuni) {
        if(optiuni.isBrushWashingSelected()){
            System.out.println("Aplicare perii");
        }
        if(urmator!=null){
            urmator.aplica(optiuni);
        }
    }
}
