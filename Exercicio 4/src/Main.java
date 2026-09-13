import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Turma turma = new Turma("Java POO", "TURMA-2026A", 10);

        int opcao;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Matricular aluno");
            System.out.println("2 - Exibir status da turma");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    turma.matricularAluno();
                    break;
                case 2:
                    turma.exibirStatus();
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
