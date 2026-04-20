package ro.ase.cts.bridge.notificari;

public class Email implements CanalNotificare{
    @Override
    public void trimite(String mesaj) {
        System.out.println("Email: " + mesaj);
    }
}
