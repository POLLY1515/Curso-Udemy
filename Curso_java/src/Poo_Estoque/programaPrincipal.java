package Poo_Estoque;

import java.util.Locale;
import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
      
        System.out.println("Entre com o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Entre com o preço do produto: ");
        Double preco = sc.nextDouble();
        System.out.println("Entre com a quantidade de produto em estoque: ");
        int quant = sc.nextInt();
        
        Estoque produto1 = new Estoque(nome, preco, quant);
        System.out.println(produto1);
        System.out.println("Valor total no estoque: " + produto1.calcularEstoque());
        System.out.println("Entre com a quantidade de produtos que deseja adicionar no estoque:");
        int qp = sc.nextInt();
        produto1.adicionarProduto(qp);
        System.out.println("Quantidade do produto " + nome + " adicionada: " + qp );
        System.out.println(produto1);
        System.out.println("Valor atualizado no estoque: " + produto1.calcularEstoque());
        System.out.println("Entre com a quantidade que deseja remover: ");
        int remov = sc.nextInt();
        produto1.removerProduto(remov);    
        System.out.println(produto1);
        System.out.println("Valor atualizado no estoque:" + produto1.calcularEstoque());




        


	}

}
