package exercicio;

import java.util.ArrayList;
import java.util.Scanner;

public class CrudSimples {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
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

            switch(opcao){
                case 1:
                    System.out.print("Informe o nome do aluno: ");
                    String nome = sc.nextLine();
                    nomes.add(nome);
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;


                case 2:
                    System.out.println("\n----LISTA DE ALUNOS----");

                    if(nomes.isEmpty()){
                        System.out.println("Nenhum aluno encontrado!");
                    } else{
                        for(String aluno : nomes){
                            System.out.println(nomes.indexOf(aluno) + " - " + aluno);
                        }
                    }

                    break;

                case 3:
                    System.out.println("\n----ATUALIZAR CADASTRO----");
                    System.out.println("Informe o id do aluno: ");
                    int id = sc.nextInt();
                    System.out.println("Informe o nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    nomes.set(id,nomeAluno);
                    break;

                case 4:
                    System.out.println("\n----REMOVER ALUNO----");
                    System.out.println("Informe o id do aluno: ");
                    int idAluno = sc.nextInt();
                    nomes.remove(idAluno);
                    break;

                case 5:
                    System.out.println("Encerrando o programa...");
                    break;

            }

            if (opcao == 5){
                break;
            }
        }








    }
}
