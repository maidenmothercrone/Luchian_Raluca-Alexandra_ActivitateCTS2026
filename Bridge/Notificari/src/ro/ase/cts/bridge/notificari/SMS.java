package ro.ase.cts.bridge.notificari;

public class SMS implements CanalNotificare{
    @Override
    public void trimite(String mesaj) {
        System.out.println("SMS: " + mesaj);
    }
}
