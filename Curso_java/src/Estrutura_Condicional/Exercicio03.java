package Estrutura_Condicional;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//Escreva um programa que leia o c�digo de um item e 
		//a quantidade deste item. A seguir, calcule e mostre o valor
		//da conta a pagar.
			
		
			Scanner sc = new Scanner(System.in);
			
			
			System.out.println("C�digo:1 |Cachorro quente |Pre�o R$:4.00");
			System.out.println("==========================================");
			System.out.println("C�digo:2 |X_Salada|Pre�o R$:4.50");
			System.out.println("=========================================");
			System.out.println("C�digo:3 |X_Bacon |Pre�o R$:5.00");
			System.out.println("=========================================");
			System.out.println("C�digo:4 |Torrada-simples |Pre�o R$:2.00");
			System.out.println("==========================================");
			System.out.println("C�digo:5 |Refrigerante |Pre�o R$:1.50");
			
			System.out.println("Escolha uma op��o:");
			int x = sc.nextInt();
			String item;
			System.out.println("Qual a quantidade:");
			int quant = sc.nextInt();
			
			switch (x) {
			case 1:
				item = "Cachorro quente";
				double valor = quant * 4.00;
				System.out.println( item + " Total: " + valor);
				break;
			case 2:
				item = "X_Salada";
				double valor2 = quant * 4.50;
				System.out.println( item + " Total: " + valor2);
				break;
			case 3:
				item = "X_Bacon";
				double valor3 = quant * 5.00;
				System.out.println(  item +" Total: " + valor3);
				break;
			case 4:
				item = "Torrada_simples";
				double valor4 = quant * 2.00;
				System.out.println( item + " Total: " + valor4);
				break;
			case 5:
				item = "Refrogerante";
				double valor5 = quant * 1.50;
				System.out.println( item +" Total: " + valor5);
				break;
				
				
				
			}
			
			
		}

	

	}


