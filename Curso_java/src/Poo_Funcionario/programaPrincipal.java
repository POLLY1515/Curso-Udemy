package Poo_Funcionario;

import java.util.Locale;
import java.util.Scanner;

import Poo_Estoque_funcionario.Funcionario;

public class programaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Entre com o nome do funcionario:");
		String nome = sc.nextLine();
		System.out.println("Entre com o valor do sal�rio bruto do funcion�rio(a) " + nome + ":");
		Double sala = sc.nextDouble();
		System.out.println("Entre com o valor do imposto sobre o salario :");
		Double impo = sc.nextDouble();
		
		Funcionario funcionario = new Funcionario(nome, sala, impo);
		System.out.println("Salario l�quido do funcion�rio " + nome + ":" + funcionario.mostrarSalarioLiquido());
		System.out.println("Entre com o valor do aumento : " );
		Double val = sc.nextDouble();
		System.out.println("salario do funcion�rio(a) " + nome + " ap�s aumento de " + val + "%  R$:" + funcionario.aumentarSalario(val));


		sc.close();
		
	}

}
