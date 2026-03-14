package ro.ase.cts.builder;

public interface BuilderAbstract {
    BuilderAbstract setNumeBanca(String numeBanca);
    BuilderAbstract setContSalariu(boolean contSalariu);
    BuilderAbstract setCardAtasat(boolean cardAtasat);
    BuilderAbstract setInternetBanking(boolean internetBanking);

    ContBancar build();
}
