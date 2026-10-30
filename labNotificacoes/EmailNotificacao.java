package labNotificacoes;

public class EmailNotificacao extends Notificacao implements Agendavel {

    private String horario;

    public EmailNotificacao(String destinatario, String mensagem, String horario) {
        super(destinatario, mensagem);
        this.horario = horario;
    }

    @Override
    public String getHorario() {
        return horario;
    }

    @Override
    protected String formatar() {
        return "[E-MAIL] para " + destinatario + ": " + mensagem;
    }
}