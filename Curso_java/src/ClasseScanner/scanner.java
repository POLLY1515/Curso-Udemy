package ClasseScanner;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// A classe scanner � usada como entrada
				// de dados na linguagem java

				Scanner sc = new Scanner(System.in);// essa � a forma de
				//instanciar a classe scanner.Ela deve ser importada
				System.out.println("O comando next le apenas uma palavra");
				System.out.println("O comando nextLine le a frase ou palavra ate o final ");
				System.out.println("O comando nextInt le um numero inteiro ");

				System.out.println("Entre com uma palavra:");
				String palavra = sc.nextLine();// aqui recebe o dado informado
				// ou seja uma string
				System.out.println("Voc� digitou " + palavra);
				System.out.println("Lendo uma string");
				System.out.println("=====================================");
				System.out.println("Entre com um numero inteiro:");
				int num = sc.nextInt();// recebendo um numeto inteiro
				System.out.println("Voce digitou: " + num);
				System.out.println("Lendo um interio");
				System.out.println("=====================================");
				System.out.println("Entre com um numero qualquer com virgula");
				double num2 =sc.nextDouble();
				System.out.println("Voce digitou:" + num2);
				System.out.println("Lendo um double");

			}

		

	}


