package ro.ase.cts.program;

import ro.ase.cts.restaurante.Restaurant;

public class Program {
    static void main(String[] args) {
        Restaurant restaurant1 = Restaurant.getInstance();

        System.out.println(restaurant1);
    }
}
