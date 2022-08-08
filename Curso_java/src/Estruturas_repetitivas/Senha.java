package Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Senha {

	public static void main(String[] args) {

		/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. 
		 * Para cada leitura de senha incorreta informada, escrever a mensagem 
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a
		 *  mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta 
		 *  é o valor 2002.Exemplo*/
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int senha;
		
		do {
			System.out.print("Entre com a senha:");
			  senha = sc.nextInt();
			if(senha == 2002) {
				System.out.println("Acesso permitido!");
				System.out.println("*******Fim programa*******");


			}else {
				System.out.println("Acesso negado!");

			}

		}while(senha != 2002);
	}

}
