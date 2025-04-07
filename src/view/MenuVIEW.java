package view;

import java.util.Scanner;

public class MenuVIEW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("==== MENU ====");
            System.out.println("1 - Consultar Vendas");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    VendasVIEW.main(null); // Chama a tela de vendas
                    break;
                case 2:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 2);
    }
}
