import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Boletim individual, exercício 2\n");

        System.out.print("Digite o nome do aluno: ");
        String aluno = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        String resultado;

        if (media >= 7.0) {
            resultado = "Aprovado";
        } else if (media >= 5.0 && media < 7.0) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }

        String exame = (media >= 5.0 && media < 6.9) ? "Exame" : "Sem exame";


        System.out.println("Aluno: " + aluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + Math.round(media * 100.0) / 100.0);
        System.out.println("Resultado: " + resultado);
        System.out.println("Exame: " + exame);

        scanner.close();
    }
}