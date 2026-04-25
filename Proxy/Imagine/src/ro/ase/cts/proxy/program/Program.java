package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.implementare.IImagine;
import ro.ase.cts.proxy.implementare.ImagineProxy;
import ro.ase.cts.proxy.implementare.ImagineReala;

public class Program {
    static void main(String[] args) {
        IImagine imagine = new ImagineReala("poza.jpg");
        imagine.afiseaza();
        imagine.afiseaza();


    }
}
