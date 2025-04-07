package view;

import dao.ProdutosDAO;
import model.Produto;

import java.util.List;

public class VendasVIEW {
    public static void main(String[] args) {
        ProdutosDAO dao = new ProdutosDAO();
        List<Produto> vendidos = dao.listarProdutosVendidos();

        System.out.println("=== Produtos Vendidos ===");
        for (Produto p : vendidos) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Valor: R$" + p.getValor());
            System.out.println("Status: " + p.getStatus());
            System.out.println("--------------------------");
        }
    }
}
