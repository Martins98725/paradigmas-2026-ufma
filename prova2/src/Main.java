import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        List<Double> notaAluno = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a nota " + (i + 1) + " do aluno: ");
            notaAluno.add(Double.parseDouble(scanner.nextLine().replace(",", ".")));
        }

        Aluno aluno = new Aluno(nomeAluno, notaAluno);
        System.out.println(aluno);

        scanner.close();
    }
}