package Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Fazer um programa que l� n�meros
		//inteiros at� que um zero seja lido. Ao
		//final mostra a soma dos n�meros lidos.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		System.out.println("****Lendo n�meros inteiro**********");
		
		double soma = 0;
		int num;
		
		do {
			System.out.print("Entre com um n�mero inteiro:");
			num = sc.nextInt();
			soma += num;
			if(num == 0) {
				break;
			}
			
		} while(num != 0);
		
		System.out.println("A soma dos valores digitado foi de: " + soma);
	}
}
