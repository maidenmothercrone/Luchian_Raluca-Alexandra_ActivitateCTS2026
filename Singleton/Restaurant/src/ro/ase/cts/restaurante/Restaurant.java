package ro.ase.cts.restaurante;

public class Restaurant {
    private String nume;
    private String adresaStrada;
    private int adresaNumar;

    private static Restaurant instanta = null;

    private Restaurant(String nume, String adresaStrada, int adresaNumar) {
        this.nume = nume;
        this.adresaStrada = adresaStrada;
        this.adresaNumar = adresaNumar;
    }

    public static synchronized Restaurant getInstance(){
        if (instanta==null){
            instanta =new  Restaurant("Monza", "Strada Basarab", 125);
        }
        return instanta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Restaurant{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresaStrada='").append(adresaStrada).append('\'');
        sb.append(", adresaNumar=").append(adresaNumar);
        sb.append('}');
        return sb.toString();
    }
}
