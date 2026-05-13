package ro.ase.cts.b8.implementare;

public class ItemMeniu implements IComponentaMeniu{
    private String nume;

    public ItemMeniu(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + " " + nume);
    }
}
