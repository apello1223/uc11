import java.sql.*;

public class ProdutosDAO {

    private Connection connect() {
        String url = "jdbc:sqlite:banco.db"; // ajuste se o caminho for outro
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void venderProduto(int id) {
        String sql = "UPDATE produtos SET status = 'Vendido' WHERE id = ?";

        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Produto vendido com sucesso.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
