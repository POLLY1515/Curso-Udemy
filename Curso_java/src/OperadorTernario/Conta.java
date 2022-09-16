package OperadorTernario;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double saldo = 100.00;
		double saque = 90.0;
		
		String resultado = saldo >= saque ? "Saque aprovado" : "Impossível "
				+ "realizar a operação";
		saldo -= saque;
		System.out.println("Resultado:" + resultado);
		System.out.println("Saldo:" + saldo);


	}

}
