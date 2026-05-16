package cts.luchian.raluca.alexandra.gr1161.decorator;

import cts.luchian.raluca.alexandra.gr1161.common.AbstractAutoWashOptions;

public abstract class AutoWashDecorator implements AbstractAutoWashOptions{
    protected AbstractAutoWashOptions optiuni;

    public AutoWashDecorator(AbstractAutoWashOptions optiuni) {
        this.optiuni = optiuni;
    }

    @Override
    public boolean isPrewashSelected() {
        return optiuni.isPrewashSelected();
    }

    @Override
    public boolean isBrushWashingSelected() {
        return optiuni.isBrushWashingSelected();
    }

    @Override
    public boolean isWaxAndPolishSelected() {
        return optiuni.isWaxAndPolishSelected();
    }

    @Override
    public boolean isDryingSelected() {
        return optiuni.isDryingSelected();
    }
}
