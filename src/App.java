public class App {
    public static void main(String[] args) {

        Mensagem email = new Email();
        Mensagem sms = new SMS();
        Mensagem whatsapp = new WhatsApp();

        email.enviar("Olá por email.");
        sms.enviar("Olá por SMS.");
        whatsapp.enviar("Olá por WhatsApp.");
    }
}
