package ro.ase.cts.flyweight.padure;

public class Main {
    static void main(String[] args) {
        FabricaTipCopac fabricaTipCopaci = new FabricaTipCopac();

        Copac c1 = new Copac(fabricaTipCopaci.getCopac("Stejar", "verde"),10,20);
        Copac c2 = new Copac(fabricaTipCopaci.getCopac("Stejar", "verde"),15,20);
        Copac c3 = new Copac(fabricaTipCopaci.getCopac("Stejar", "verde"), 20,20);
        Copac c4 = new Copac(fabricaTipCopaci.getCopac("Mesteacan", "alb"),10,25);
        Copac c5 = new Copac(fabricaTipCopaci.getCopac("Mesteacan", "alb"),10,30);
        Copac c6 = new Copac(fabricaTipCopaci.getCopac("Mesteacan", "alb"),10,35);

        c1.deseneaza();
        c2.deseneaza();
        c3.deseneaza();
        c4.deseneaza();
        c5.deseneaza();
        c6.deseneaza();


    }
}
