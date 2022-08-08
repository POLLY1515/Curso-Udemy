package Estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
     /*
Fazer um programa que l� um valor inteiro N e depois N n�meros inteiros.
Ao final, mostra a soma dos N n�meros lidos*/

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		int soma = 0;
		
		System.out.print("Informe quantos n�meros ser�o lidos:");
		int num = sc.nextInt();
		
		for(int cont = 0; cont < num ; cont ++) {
			System.out.println("Informe o n�mero na posi��o " + (cont +1));
			int numero = sc.nextInt();
			soma += numero;
		}
		System.out.println("A soma dos n�meros informados �: " + soma);
	}

}
