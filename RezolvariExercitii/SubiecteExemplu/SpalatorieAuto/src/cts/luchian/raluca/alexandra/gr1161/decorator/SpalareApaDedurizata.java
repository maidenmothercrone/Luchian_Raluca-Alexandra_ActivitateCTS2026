package cts.luchian.raluca.alexandra.gr1161.decorator;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class SpalareApaDedurizata extends AutoWashDecorator{
    public SpalareApaDedurizata(AbstractAutoWashOptions optiuni) {
        super(optiuni);
    }

    public boolean isSpalareApaDedurizata(){
        return true;
    }
}
