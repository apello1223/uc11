package view;

import dao.ProdutosDAO;
import model.Produto;

import java.util.List;
import java.util.Scanner;

public class ListagemVIEW {
    public static void main(String[] args) {
        ProdutosDAO dao = new ProdutosDAO();
        Scanner scanner = new Scanner(System.in);

        List<Produto> produtos = dao.listarProdutosVendidos(); // ou listarTodosProdutos se tiver

        System.out.println("=== Lista de Produtos ===");
        for (Produto p : produtos) {
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getNome());
            System.out.println("Valor: R$" + p.getValor());
            System.out.println("Status: " + p.getStatus());
            System.out.println("--------------------------");
        }

        System.out.print("Digite o ID do produto que deseja vender: ");
        int id = scanner.nextInt();

        dao.venderProduto(id);
        System.out.println("Produto vendido!");
    }
}
