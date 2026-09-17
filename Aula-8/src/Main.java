import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== Menu =====");
            System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Status do Livro");
            System.out.println("3 - Proxima página");
            System.out.println("4 - Voltar pagina");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao (0-4): ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("\n===== Cadastrar Livro =====");
                    System.out.print("Nome do livro atual (" + livro.getTitulo() + "): ");
                    livro.setTitulo(sc.nextLine());
                    System.out.print("Autor atual (" + livro.getAutor() + "): ");
                    livro.setAutor(sc.nextLine());
                    System.out.print("Leitor atual (" + livro.getLeitor() + "): ");
                    livro.setLeitor(sc.nextLine());
                    System.out.print("Total de paginas atual (" + livro.getTotPaginas() + "): ");
                    livro.setTotPaginas(sc.nextInt());
                    sc.nextLine();
                    livro.setAberto(true);
                    break;

                case 2:
                    System.out.println("\n===== Status do Livro =====");
                    System.out.println("Nome do livro: " + livro.getTitulo());
                    System.out.println("Autor: " + livro.getAutor());
                    System.out.println("Leitor: " + livro.getLeitor());
                    System.out.println("Total de paginas: " + livro.getTotPaginas());
                    System.out.println("Paginas atual: " + livro.getPagAtual());
                    System.out.println("Aberto: " + (livro.getAberto() ? "Sim" : "Não"));
                    break;

                case 3:
                    livro.folhear();
                    System.out.println("Você folheou a página.");
                    break;

                case 4:
                    livro.voltarpagina();
                    System.out.println("Você voltou uma página.");
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção invalida! Tente novamente.");
            }

        } while(opcao != 0);

        sc.close();
    }
}