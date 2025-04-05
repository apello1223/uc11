package view;

import javax.swing.*;
import java.awt.*;

public class CadastroVIEW extends JFrame {

    public CadastroVIEW() {
        setTitle("Cadastro de Produto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza a tela

        // Criar os componentes
        JLabel lblNome = new JLabel("Nome:");
        JTextField txtNome = new JTextField(20);

        JLabel lblValor = new JLabel("Valor:");
        JTextField txtValor = new JTextField(10);

        JButton btnSalvar = new JButton("Salvar");

        // Organizar os componentes em painéis
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblValor);
        panel.add(txtValor);
        panel.add(new JLabel()); // espaço vazio
        panel.add(btnSalvar);

        // Adicionar o painel ao frame
        add(panel);

        setVisible(true);
    }
}
