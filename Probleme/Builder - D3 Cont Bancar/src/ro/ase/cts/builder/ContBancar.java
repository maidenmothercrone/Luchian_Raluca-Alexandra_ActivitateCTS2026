package ro.ase.cts.builder;

public class ContBancar {
    private String numeBanca;

    private boolean contSalariu;
    private boolean cardAtasat;
    private boolean internetBanking;

    public ContBancar(String numeBanca, boolean contSalariu, boolean internetBanking, boolean cardAtasat) {
        this.numeBanca = numeBanca;
        this.contSalariu = contSalariu;
        this.internetBanking = internetBanking;
        this.cardAtasat = cardAtasat;
    }

    public ContBancar() {
        this.contSalariu = false;
        this.internetBanking = false;
        this.cardAtasat = false;
    }

    public ContBancar(boolean contSalariu, boolean cardAtasat, boolean internetBanking) {

    }

    public void setNumeBanca(String numeBanca) {
        this.numeBanca = numeBanca;
    }

    public void setContSalariu(boolean contSalariu) {
        this.contSalariu = contSalariu;
    }

    public void setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
    }

    public void setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContBancar{");
        sb.append("numeBanca='").append(numeBanca).append('\'');
        sb.append(", contSalariu=").append(contSalariu);
        sb.append(", cardAtasat=").append(cardAtasat);
        sb.append(", internetBanking=").append(internetBanking);
        sb.append('}');
        return sb.toString();
    }
}
