package ro.ase.cts.bridge.notificari;

public class NotificareInfo extends Notificare{

    public NotificareInfo(CanalNotificare canal) {
        super(canal);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        canal.trimite("[INFO]" + mesaj);
    }
}
