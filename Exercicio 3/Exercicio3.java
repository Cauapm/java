import java.util.ArrayList;

public class Exercicio3 {
    public static void main(String[] args) {
        System.out.println("Boletim turma, exercício 3\n");

        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Caue");
        alunos.add("Caua");
        alunos.add("Ricardo");
        alunos.add("Diogo");
        alunos.add("Fernando");

        double[] medias = {6.5, 8.0, 4.2, 7.5, 5.8};
        
        System.out.println("Lista de chamada:\n");
        for (String aluno : alunos) {
            System.out.println("Presentes: " + aluno + "\n");
        }   

        for (int i = 0; i < alunos.size(); i++) {
            String situacao;
            if (medias[i] >= 7.0) {
                situacao = "Aprovado";
            } else if (medias[i] >= 5.0 && medias[i] < 7.0) {
                situacao = "Recuperação";
            } else {
                situacao = "Reprovado";
            }

        System.out.println("Aluno: " + alunos.get(i) + " - Média: " + medias[i] + " - Situação: " + situacao);
        }

        int resultado = 0;
        int aprovado = 0;

        while (resultado < medias.length) {
            if (medias[resultado] >= 7.0) {
                aprovado++;
            }
            resultado++;
        }
        System.out.println("\nTotal de alunos aprovados: " + aprovado);
    }
}

