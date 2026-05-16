package cts.luchian.raluca.alexandra.gr1161.decorator;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class SpalareSasiu extends AutoWashDecorator{
    public SpalareSasiu(AbstractAutoWashOptions optiuni) {
        super(optiuni);
    }

    public boolean isSpalareSasiu(){
        return true;
    }
}
