package ro.ase.cts.bridge.notificari;

public class Main {

    static void main(String[] args) {
        Notificare urgentSMS = new NotificareUrgenta(new SMS());
        Notificare urgentEmail = new NotificareUrgenta(new Email());
        Notificare infoSMS = new NotificareInfo(new SMS());
        Notificare infoEmail = new NotificareInfo(new Email());

        urgentSMS.trimiteNotificare("Notificare SMS: ");
        urgentEmail.trimiteNotificare("Notificare email: ");
        infoSMS.trimiteNotificare("Notificare SMS: ");
        infoEmail.trimiteNotificare("Notificare email: ");

        Notificare pushNotifSMS = new PushNotification(new SMS());
        Notificare pushNotifEmail = new PushNotification(new Email());
        Notificare promoNotifSMS = new PromoNotification(new SMS());
        Notificare promoNotifEmail = new PromoNotification(new Email());

        pushNotifSMS.trimiteNotificare("");
        pushNotifEmail.trimiteNotificare("");
        promoNotifSMS.trimiteNotificare("");
        promoNotifEmail.trimiteNotificare("");
    }

}
