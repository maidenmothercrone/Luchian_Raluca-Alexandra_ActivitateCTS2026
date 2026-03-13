package ro.ase.cts.singleton;

public class Singleton {
    //parametrii clasei declarati privat

    private static Singleton instanta = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance(){
        if(instanta==null){
            instanta=new Singleton();
        }
        return instanta;
}
}
