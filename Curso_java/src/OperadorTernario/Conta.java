package OperadorTernario;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo = 100.00;
		double saque = 90.0;
		
		String resultado = saldo >= saque ? "Saque aprovado" : "Imposs�vel "
				+ "realizar a opera��o";
		saldo -= saque;
		System.out.println("Resultado:" + resultado);
		System.out.println("Saldo:" + saldo);


	}

}
