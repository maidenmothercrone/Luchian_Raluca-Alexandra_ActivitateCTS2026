package ro.ase.cts.bridge.notificari;

public class PromoNotification extends Notificare{

    public PromoNotification (CanalNotificare canal){
        super(canal);
    }
    @Override
    public void trimiteNotificare(String mesaj) {
        canal.trimite("[PROMO]" + mesaj);
    }
}
