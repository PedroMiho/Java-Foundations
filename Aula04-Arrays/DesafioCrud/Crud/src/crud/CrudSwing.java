package crud;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CrudSwing {

    // LISTAS PARA ARMAZENAR OS DADOS
    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<Integer> idades = new ArrayList<>();
    static ArrayList<Double> notas = new ArrayList<>();

    public static void main(String[] args) {

        // JANELA PRINCIPAL
        JFrame frame = new JFrame("CRUD de Alunos - Swing");
        frame.setSize(450, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // LABELS E CAMPOS
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setBounds(20, 20, 100, 25);
        frame.add(lblNome);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(120, 20, 200, 25);
        frame.add(txtNome);

        JLabel lblIdade = new JLabel("Idade:");
        lblIdade.setBounds(20, 60, 100, 25);
        frame.add(lblIdade);

        JTextField txtIdade = new JTextField();
        txtIdade.setBounds(120, 60, 100, 25);
        frame.add(txtIdade);

        JLabel lblNota = new JLabel("Nota:");
        lblNota.setBounds(20, 100, 100, 25);
        frame.add(lblNota);

        JTextField txtNota = new JTextField();
        txtNota.setBounds(120, 100, 100, 25);
        frame.add(txtNota);

        // ÁREA DE TEXTO PARA LISTAR OS ALUNOS
        JTextArea txtArea = new JTextArea();
        txtArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtArea);
        scroll.setBounds(20, 220, 380, 220);
        frame.add(scroll);

        // BOTÃO ADICIONAR
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.setBounds(20, 150, 120, 30);
        frame.add(btnAdicionar);

        btnAdicionar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String nome = txtNome.getText();
                    int idade = Integer.parseInt(txtIdade.getText());
                    double nota = Double.parseDouble(txtNota.getText());

                    nomes.add(nome);
                    idades.add(idade);
                    notas.add(nota);

                    JOptionPane.showMessageDialog(frame, "Aluno cadastrado!");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Dados inválidos!");
                }
            }
        });

        // BOTÃO LISTAR
        JButton btnListar = new JButton("Listar");
        btnListar.setBounds(160, 150, 120, 30);
        frame.add(btnListar);

        btnListar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtArea.setText(""); // limpar

                if (nomes.isEmpty()) {
                    txtArea.setText("Nenhum aluno cadastrado.");
                } else {
                    for (int i = 0; i < nomes.size(); i++) {
                        txtArea.append(
                                i + " - Nome: " + nomes.get(i) +
                                        ", Idade: " + idades.get(i) +
                                        ", Nota: " + notas.get(i) + "\n"
                        );
                    }
                }
            }
        });

        // BOTÃO ATUALIZAR
        JButton btnAtualizar = new JButton("Atualizar");
        btnAtualizar.setBounds(300, 150, 120, 30);
        frame.add(btnAtualizar);

        btnAtualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Índice do aluno para atualizar:");

                try {
                    int indice = Integer.parseInt(input);

                    if (indice >= 0 && indice < nomes.size()) {
                        String novoNome = JOptionPane.showInputDialog("Novo nome:");
                        int novaIdade = Integer.parseInt(JOptionPane.showInputDialog("Nova idade:"));
                        double novaNota = Double.parseDouble(JOptionPane.showInputDialog("Nova nota:"));

                        nomes.set(indice, novoNome);
                        idades.set(indice, novaIdade);
                        notas.set(indice, novaNota);

                        JOptionPane.showMessageDialog(frame, "Aluno atualizado!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Índice inválido!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Entrada inválida!");
                }
            }
        });

        // BOTÃO REMOVER
        JButton btnRemover = new JButton("Remover");
        btnRemover.setBounds(20, 185, 120, 30);
        frame.add(btnRemover);

        btnRemover.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Índice do aluno para remover:");

                try {
                    int indice = Integer.parseInt(input);

                    if (indice >= 0 && indice < nomes.size()) {
                        nomes.remove(indice);
                        idades.remove(indice);
                        notas.remove(indice);

                        JOptionPane.showMessageDialog(frame, "Aluno removido!");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Índice inválido!");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Entrada inválida!");
                }
            }
        });

        frame.setVisible(true);
    }
}
