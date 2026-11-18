import java.util.List;

public class Aluno {
    private static final double mediaAprovacao = 7.0;

    private String nome;

    private List<Double> notas;

    public Aluno(String nome, List<Double> notas) {
        this.nome = nome;
        this.notas = List.copyOf(notas);
    }

    public double calcularTotalNotas() {
        return notas.stream().mapToDouble(Double::doubleValue).sum();
    }

    public double calcularMediaNotas() {
        if (notas.isEmpty()) {
            return 0;
        }
        return calcularTotalNotas() / notas.size();
    }

    public boolean isAprovado() {
        return calcularMediaNotas() >= mediaAprovacao;
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
        this.notas = List.copyOf(notas);
    }

    @Override
    public String toString() {
        String estado = isAprovado() ? "Aprovado" : "Reprovado";
        return String.format("%s: %s com média %.2f", nome, estado, calcularMediaNotas());
    }
}