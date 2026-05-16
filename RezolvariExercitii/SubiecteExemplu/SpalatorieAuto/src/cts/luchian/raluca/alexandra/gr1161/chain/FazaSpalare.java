package cts.luchian.raluca.alexandra.gr1161.chain;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public abstract class FazaSpalare {
    protected FazaSpalare urmator;

    public void setUrmator(FazaSpalare urmator) {
        this.urmator = urmator;
    }

    public abstract void aplica(AbstractAutoWashOptions optiuni);
}
