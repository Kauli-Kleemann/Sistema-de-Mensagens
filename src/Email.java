public class Email implements Mensagem {
    @Override 
    public void enviar(String texto) {
        System.out.println("Enviando por Email: " + texto);
    }
}