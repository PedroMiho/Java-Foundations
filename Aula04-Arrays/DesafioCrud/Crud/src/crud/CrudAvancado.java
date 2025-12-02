package crud;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudAvancado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

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

                // CREATE — CADASTRAR
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = sc.nextLine();

                    System.out.print("Idade do aluno: ");
                    int idade = sc.nextInt();

                    System.out.print("Nota do aluno: ");
                    double nota = sc.nextDouble();

                    nomes.add(nome);
                    idades.add(idade);
                    notas.add(nota);

                    System.out.println("Aluno cadastrado com sucesso!");
                    break;

                // READ — LISTAR
                case 2:
                    System.out.println("\n--- LISTA DE ALUNOS ---");
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum aluno cadastrado.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(
                                    i + " - Nome: " + nomes.get(i) +
                                            ", Idade: " + idades.get(i) +
                                            ", Nota: " + notas.get(i)
                            );
                        }
                    }
                    break;

                // UPDATE — ATUALIZAR
                case 3:
                    System.out.println("\n--- ATUALIZAR ALUNO ---");
                    System.out.print("Informe o índice do aluno: ");
                    int indiceAtualizar = sc.nextInt();
                    sc.nextLine();

                    if (indiceAtualizar >= 0 && indiceAtualizar < nomes.size()) {

                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova idade: ");
                        int novaIdade = sc.nextInt();

                        System.out.print("Nova nota: ");
                        double novaNota = sc.nextDouble();

                        nomes.set(indiceAtualizar, novoNome);
                        idades.set(indiceAtualizar, novaIdade);
                        notas.set(indiceAtualizar, novaNota);

                        System.out.println("Aluno atualizado com sucesso!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                // DELETE — REMOVER
                case 4:
                    System.out.println("\n--- REMOVER ALUNO ---");
                    System.out.print("Informe o índice do aluno a remover: ");
                    int indiceRemover = sc.nextInt();

                    if (indiceRemover >= 0 && indiceRemover < nomes.size()) {
                        nomes.remove(indiceRemover);
                        idades.remove(indiceRemover);
                        notas.remove(indiceRemover);

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
