package view;

import javax.swing.*;

public class CadastroVIEW extends JFrame {
    public CadastroVIEW() {
        setTitle("Cadastro de Produto");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza

        JLabel label = new JLabel("Tela de Cadastro");
        add(label);
    }
}



