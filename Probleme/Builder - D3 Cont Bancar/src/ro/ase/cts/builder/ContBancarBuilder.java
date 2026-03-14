package ro.ase.cts.builder;

public class ContBancarBuilder implements BuilderAbstract{
    private String numeBanca;
    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    @Override
    public BuilderAbstract setNumeBanca(String numeBanca){
        this.numeBanca = numeBanca;
        return this;
    }
    public BuilderAbstract setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
        return this;
    }

    @Override
    public BuilderAbstract setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    @Override
    public BuilderAbstract setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    @Override
    public ContBancar build() {
        return new ContBancar(numeBanca, contSalariu, cardAtasat, internetBanking );
    }
}
