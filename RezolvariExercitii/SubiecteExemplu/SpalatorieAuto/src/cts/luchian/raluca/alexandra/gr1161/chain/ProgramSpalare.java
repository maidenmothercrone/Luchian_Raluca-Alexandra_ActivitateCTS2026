package cts.luchian.raluca.alexandra.gr1161.chain;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public class ProgramSpalare implements AbstractAutoWashOptions {
    private boolean prespalare;
    private boolean perii;
    private boolean ceruire;
    private boolean uscare;

    public ProgramSpalare(boolean prespalare, boolean perii, boolean ceruire, boolean uscare) {
        this.prespalare = prespalare;
        this.perii = perii;
        this.ceruire = ceruire;
        this.uscare = uscare;
    }

    @Override
    public boolean isPrewashSelected() {
        return prespalare;
    }

    @Override
    public boolean isBrushWashingSelected() {
        return perii;
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return ceruire;
    }

    @Override
    public boolean isDryingSelected() {
        return uscare;
    }
}
