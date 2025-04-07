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
public List<Produto> listarProdutosVendidos() {
    List<Produto> produtosVendidos = new ArrayList<>();
    String sql = "SELECT * FROM produtos WHERE status = 'Vendido'";

    try (Connection conn = this.connect();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {
        while (rs.next()) {
            Produto produto = new Produto();
            produto.setId(rs.getInt("id"));
            produto.setNome(rs.getString("nome"));
            produto.setValor(rs.getDouble("valor"));
            produto.setStatus(rs.getString("status"));
            produtosVendidos.add(produto);
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    return produtosVendidos;
}
