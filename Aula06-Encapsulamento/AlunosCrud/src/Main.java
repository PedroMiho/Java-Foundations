import entidades.Aluno;
import entidades.GerenciarAlunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarAlunos gerenciarAlunos = new GerenciarAlunos();

        int opcao;

        while (true) {
            System.out.println("MENU DE OPÇÕES");
            System.out.println("1 - CADASTRAR ALUNO");
            System.out.println("2 - LISTAR ALUNOS");
            System.out.println("3 - ATUALIZAR ALUNO");
            System.out.println("4 - REMOVER ALUNO");
            System.out.println("5 - SAIR DO PROGRAMA");
            System.out.print("ESCOLHA UMA OPÇÃO: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){

                case 1 -> {
                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe a nota do aluno: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a nota do aluno: ");
                    double nota2 = sc.nextDouble();
                    sc.nextLine();

                    Aluno aluno = new Aluno(nome, nota, nota2);
                    gerenciarAlunos.adicionarAluno(aluno);
                } case 2 -> {
                    gerenciarAlunos.listarAlunos();
                }

                case 3 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.print("Informe o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Informe o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Informe a nota do aluno: ");
                    double notaAluno = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Informe a nota do aluno: ");
                    double notaAluno2 = sc.nextDouble();
                    sc.nextLine();

                    gerenciarAlunos.atualizarAluno(idAluno, nomeAluno, notaAluno, notaAluno2);
                } case 4 -> {
                    gerenciarAlunos.listarAlunos();
                    System.out.print("Informe o id do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();
                    gerenciarAlunos.excluirAluno(idAluno);
                } case 5 -> {
                    System.out.println("Programa finalizado com sucesso!");
                    return;
                } case 6 -> {
                    gerenciarAlunos.exportarParaTxt();
                }
                default -> {
                    System.out.println("Escolha inválida");
                }


            }

        }

    }
}