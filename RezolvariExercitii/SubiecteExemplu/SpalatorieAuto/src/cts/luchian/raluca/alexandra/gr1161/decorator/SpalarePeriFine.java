package cts.luchian.raluca.alexandra.gr1161.decorator;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class SpalarePeriFine extends AutoWashDecorator{
    public SpalarePeriFine(AbstractAutoWashOptions optiuni) {
        super(optiuni);
    }

    public boolean isPeriFineSelected(){
        return true;
    }
}
