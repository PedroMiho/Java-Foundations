import javax.swing.*;

public class CrudSwing {
    public static void main(String[] args) {
            JFrame frame = new JFrame("Crud Swing");
            frame.setSize(500, 500); //Tamanho da tela (largura, altura)
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define que a janela será fechada ao clicar no X

            frame.setLayout(null); //Permite que você posicione os componentes manualmente, usando setBounds().
            frame.setResizable(false); //Não permite redimensionamento da tela


            //Adicionando um texto descritivo Nome
            JLabel lblNome = new JLabel("Nome");
            lblNome.setBounds(20, 30, 50, 20); // Definindo posição e tamanho (x , y , Largura, Altura)
            frame.add(lblNome); //Adiciona na tela principal

            //Adicionando um campo de entrada Nome
            JTextField txtNome = new JTextField();
            txtNome.setBounds(80, 30, 360, 25);
            frame.add(txtNome);

            //Adicionando um texto descritivo Idade
            JLabel lblIdade = new JLabel("Idade");
            lblIdade.setBounds(20, 80, 50, 20);
            frame.add(lblIdade);

            //Adicionando um campo de entrada Idade
            JTextField txtIdade = new JTextField();
            txtIdade.setBounds(80, 80, 360, 25);
            frame.add(txtIdade);

            //Adicionando um texto descritivo Nota
            JLabel lblNota = new JLabel("Nota");
            lblNota.setBounds(20, 130, 50, 20);
            frame.add(lblNota);

            //Adicionando um campo de entrada Idade
            JTextField txtNota = new JTextField();
            txtNota.setBounds(80, 130, 360, 25);
            frame.add(txtNota);

            //Adicionando os botões
            JButton btnSalvar = new JButton("Salvar");
            btnSalvar.setBounds(20, 60, 120, 30);
            frame.add(btnSalvar);


        frame.setVisible(true); //Deixa a tela visivel






    }
}
