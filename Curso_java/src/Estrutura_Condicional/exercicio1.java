package Estrutura_Condicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois 
		//dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um numero inteiro:");
		int num = sc.nextInt();
		if(num < 0) {
			System.out.println("Numero negativo!");
		}else {
			System.out.println("Numero n�o_negativo!");
		}
        sc.close();
	}
	}


