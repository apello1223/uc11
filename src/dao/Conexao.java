package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection conectar() {
        Connection conn = null;

        try {
            // Conectando ao arquivo local uc11.db (será criado se não existir)
            conn = DriverManager.getConnection("jdbc:sqlite:uc11.db");
            System.out.println("Conexão com SQLite realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o SQLite: " + e.getMessage());
        }

        return conn;
    }
}
