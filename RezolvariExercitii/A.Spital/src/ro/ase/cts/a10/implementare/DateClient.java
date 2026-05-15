package ro.ase.cts.a10.implementare;

public class DateClient {
    private final String nume;
    private final String telefon;
    private final String email;

    public DateClient(String nume, String telefon, String email) {
        this.nume = nume;
        this.telefon = telefon;
        this.email = email;
        System.out.println("Date client create pentru: " + nume);
    }

    public void afiseaza(int nrMasa, int nrPersoane, String oraRezervare) {
        System.out.println(nume + " | tel:" + telefon +
                " | Masa:" + nrMasa + " Persoane:" + nrPersoane + " Ora:" + oraRezervare);
    }
}
