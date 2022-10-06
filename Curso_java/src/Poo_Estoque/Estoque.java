package Poo_Estoque;

public class Estoque {
	
	private String nome;
	private double preco;
	private int quatEstoque;
	
	public Estoque() {
		// TODO Auto-generated constructor stub
	}

	public Estoque(String nome, double preco, int quatEstoque) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.quatEstoque = quatEstoque;
	}

	
	//metodo que calcula valor total no estoque
	public Double calcularEstoque() {
		return quatEstoque * preco;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quatEstoque += quantidade;
				
	}
	
	public void removerProduto(int quantidade2) {
		
		this.quatEstoque -= quantidade2;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuatEstoque() {
		return quatEstoque;
	}

	public void setQuatEstoque(int quatEstoque) {
		this.quatEstoque = quatEstoque;
	}

	@Override
	public String toString() {
		return "****Estoque*****:"
				+ " Nome do produto = " + nome + "." + 
				" Preço unidade R$: " + String.format("%.2f", preco) + "." +
				", Quantidade no estoque : " + quatEstoque + " unidades";
	}
	
	

}
