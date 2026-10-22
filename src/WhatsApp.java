public class WhatsApp implements Mensagem {
    @Override 
    public void enviar(String texto) {
        System.out.println("Enviando por WhatsApp: " + texto);
    }
}