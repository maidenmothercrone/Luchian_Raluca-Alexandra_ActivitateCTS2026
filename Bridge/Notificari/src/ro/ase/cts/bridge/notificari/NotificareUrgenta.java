package ro.ase.cts.bridge.notificari;

public class NotificareUrgenta extends Notificare{

    public NotificareUrgenta(CanalNotificare canal) {
        super(canal);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        canal.trimite("[URGENT]" + mesaj);

    }
}
