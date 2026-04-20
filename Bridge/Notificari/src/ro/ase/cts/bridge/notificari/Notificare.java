package ro.ase.cts.bridge.notificari;

public abstract class Notificare {
    protected CanalNotificare canal;

    public Notificare(CanalNotificare canal){
        this.canal=canal;
    }
    public abstract void trimiteNotificare(String mesaj);
}
