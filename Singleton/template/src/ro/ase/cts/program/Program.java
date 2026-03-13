package ro.ase.cts.program;

import ro.ase.cts.singleton.Singleton;

public class Program {
    static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);
    }
}
