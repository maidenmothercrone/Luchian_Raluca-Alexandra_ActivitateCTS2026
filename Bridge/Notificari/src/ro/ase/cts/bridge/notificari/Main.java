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

    }

}
