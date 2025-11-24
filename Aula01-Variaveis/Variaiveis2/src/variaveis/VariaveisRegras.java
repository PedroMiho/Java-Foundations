package variaveis;

public class VariaveisRegras {
    public static void main(String[] args){
        //Informar o tipo de valor que será armazenado
        //nome = "Manoel"; // Não pode
        String nome = "Manoel"; // Esse pode

        //Não podemos atribuir valores inadequados a um tipo de variável
        //String pessoa = 10; Esse não pode
        String pessoa = "10" ; // Esse pode

        //Não podemos atribuir o mesmo nome para duas variaveis
        String nome2 = "Diego";

        //Nomes de variáveis não podem começar com números
        //String 3nome = "Diego" ; Não pode
        String nome3 = "Diego" ; //Pode

        //Convenção
        //Nome Completo
        //camelCase
        String nomeCompleto = "João Ricardo";
        //snake_case
        String nome_completo = "João Roberto";
        System.out.println(nome_completo);

        //Não podemos usar palavras reservadas como variáveis
        String valor = "Sistema";
    }
}
