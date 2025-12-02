package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudSimples {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> alunos = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA CRUD DE ALUNOS =====");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Atualizar aluno");
            System.out.println("4 - Remover aluno");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    alunos.add(nome);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- LISTA DE ALUNOS ---");
                    if (alunos.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < alunos.size(); i++) {
                            System.out.println(i + " - " + alunos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- ATUALIZAR ALUNO ---");
                    System.out.print("Informe o índice do aluno: ");
                    int indiceAtualizar = sc.nextInt();
                    sc.nextLine();

                    if (indiceAtualizar >= 0 && indiceAtualizar < alunos.size()) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = sc.nextLine();
                        alunos.set(indiceAtualizar, novoNome);
                        System.out.println("Aluno atualizado com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    System.out.println("\n--- REMOVER ALUNO ---");
                    System.out.print("Informe o índice do aluno que deseja remover: ");
                    int indiceRemover = sc.nextInt();

                    if (indiceRemover >= 0 && indiceRemover < alunos.size()) {
                        alunos.remove(indiceRemover);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);

        sc.close();
    }
}
