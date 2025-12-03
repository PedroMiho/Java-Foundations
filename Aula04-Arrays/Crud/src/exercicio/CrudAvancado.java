package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvancado {
    public static void main(String[] args) {
        ArrayList<String> nomesAlunos = new ArrayList<>();
        ArrayList<Double> notasAlunos = new ArrayList<>();
        ArrayList<Integer> idadeAlunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            System.out.println("SISTEMA CRUD DE ALUNOS");
            System.out.println("1 - Cadastrar Alunos");
            System.out.println("2 - Listar Alunos");
            System.out.println("3 - Atualizar o cadastro do Aluno");
            System.out.println("4 - Remover Aluno");
            System.out.println("5 - Sair do Programa");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                //Cadastrar Aluno
                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nomeAluno = sc.nextLine();

                    System.out.print("Digite a idade do aluno: ");
                    int idadeAluno = sc.nextInt();

                    System.out.print("Digite a nota do aluno: ");
                    double notaAluno = sc.nextDouble();

                    nomesAlunos.add(nomeAluno);
                    idadeAlunos.add(idadeAluno);
                    notasAlunos.add(notaAluno);
                    System.out.println("Cadastro realizado com sucesso!");
                    break;
                //Listar Alunos
                case 2:
                    System.out.println("\n-----LISTA DE ALUNOS-----");
                    for (int i = 0; i < idadeAlunos.size(); i++) {
                        System.out.println(i + " - Nome: " +  nomesAlunos.get(i) +
                                " - Idade: " + idadeAlunos.get(i) +
                                " - Nota: " + notasAlunos.get(i));
                    }
                    break;
                case 3:
                    System.out.println("\n-----ATUALIZAR CADASTRO-----");
                    System.out.print("Digite o ID do aluno: ");
                    int idAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o nome do aluno: ");
                    String novoNomeAluno = sc.nextLine();

                    System.out.print("Digite a idade do aluno: ");
                    int novaIdadeAluno = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite a nota do aluno: ");
                    double novaNotaAluno = sc.nextDouble();

                    nomesAlunos.set(idAluno, novoNomeAluno);
                    notasAlunos.set(idAluno, novaNotaAluno);
                    idadeAlunos.set(idAluno, novaIdadeAluno);

                    System.out.println("Atualização realizada com sucesso!");
                    break;
                case 4:
                    System.out.println("\n-----Excluir Cadastro-----");
                    System.out.print("Digite o ID do aluno: ");
                    int idRemover = sc.nextInt();
                    sc.nextLine();
                    nomesAlunos.remove(idRemover);
                    notasAlunos.remove(idRemover);
                    idadeAlunos.remove(idRemover);
                    break;
                case 5:
                    System.out.println("Programa Encerrado");
                    return;
            }
        }
    }
}
