package Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X,
 *  um valor por linha, inclusive o X, se for o caso.*/
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		System.out.println("*************************************************************");
		System.out.println("Este programa exibe os numeros �mpares referente ao n�mero"
				+ " limite escolhido");
		System.out.println("*************************************************************");
		
		System.out.print("Entre com um valor limite de 1 � 1000:");
		int va = sc.nextInt();
		for(int i = 1 ;i < va; i++ ) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		

				
		

	}

}
