package Poo_Funcionario;

public class Funcionario {
	   private String nome;
	   private Double salarioBruto;
	   private Double imposto;
	   
	   public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String nome, Double salarioBruto, Double imposto) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	public Double mostrarSalarioLiquido() {
		 Double salarioLiquido = this.salarioBruto - this.imposto;
		 return salarioLiquido;
		
	}
	public Double aumentarSalario(Double valor ) {
		return salarioBruto += salarioBruto * (valor / 100);
		
		
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}

	@Override
	public String toString() {
		return "Funcionario: Nome:" + nome + ". SalarioBruto R$:" + salarioBruto + ". "
				+ "Imposto R$: " + imposto ;
	}
	   

	}

