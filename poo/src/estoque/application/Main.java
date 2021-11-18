package estoque.application;

import estoque.entities.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Adicione o nome do produto: ");
        produto.nome = sc.nextLine();

        System.out.println("Adicione o preço do produto: ");
        produto.preco = sc.nextDouble();

        System.out.println("Adicione a quantidade do produto: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto.toString());

        System.out.println("Quantas unidades deseja adicionar: ");
        int addProduto = sc.nextInt();
        produto.adicionaProduto(addProduto);
        System.out.println(produto.toString());

        System.out.println("Quantas unidades deseja remover: ");
        int rmvProduto = sc.nextInt();
        produto.removeProduto(rmvProduto);

        System.out.println(produto.toString());
        System.out.println("Valor total em estoque: " + produto.valorTotalEstoque());

        sc.close();
    }
}
