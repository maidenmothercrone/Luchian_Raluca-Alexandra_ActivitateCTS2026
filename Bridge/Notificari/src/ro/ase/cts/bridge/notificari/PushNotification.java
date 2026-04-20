package ro.ase.cts.bridge.notificari;

public class PushNotification extends Notificare {

    public PushNotification(CanalNotificare canal){
        super(canal);

    }
    @Override
    public void trimiteNotificare(String mesaj) {
        canal.trimite("[Push]" + mesaj);
    }
}
