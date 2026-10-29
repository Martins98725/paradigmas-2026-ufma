package labNotificacoes;

public abstract class Notificacao {
    private final String  destinatario;
    private final String mensagem;


    protected Notificacao(String destinatario, String mensagem) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
}
