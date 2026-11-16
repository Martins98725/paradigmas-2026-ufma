import java.util.Arrays;
import java.util.List;

public class Aluno {
    private static final double mediaAprovacao = 7.0;

    private String nome;

    private List<Double> notas;


    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = List.copyOf(notas);
    }

    public double calcuclarTotalNotas() {
        return notas.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double calcuclarMediaNotas() {
        return calcuclarTotalNotas() / notas.size();
    }

    public boolean isAprovado(){
        return calcuclarMediaNotas() >= mediaAprovacao;
    }

    public double getMediaAprovacao() {
        return mediaAprovacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        String estado = isAprovado() ? "Aprovado" : "Reprovado";
        return String.format("%s: %s com média %.2f", nome, estado, calcuclarMediaNotas());
    }
}
