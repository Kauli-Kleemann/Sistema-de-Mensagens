public class SMS implements Mensagem {
    @Override 
    public void enviar(String texto) {
        System.out.println("Enviando por SMS: " + texto);
    }
}