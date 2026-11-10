public abstract class Notificacao {
    private final String  destinatario;

    protected Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
    }

    protected abstract String tipo();

    public abstract void enviar(String mensagem);

    protected String cabecalho(){
        return "[" + tipo() + "] para " + destinatario;
    }
}
