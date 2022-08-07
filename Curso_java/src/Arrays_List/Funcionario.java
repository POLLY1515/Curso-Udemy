package Arrays_List;

public class Funcionario {

	private int id;
	 private String nome;
	 private double salario;
	 
	 
	 
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Funcionario(int id, String nome, double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public  void  aumentoSalario(double aumento) {
		salario += salario * aumento/100;

	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	@Override
	public String toString() {
		return "funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getSalario()=" + getSalario() + "]";
	}
	 
	 
	}


