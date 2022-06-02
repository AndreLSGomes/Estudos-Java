package Capitulo_15._06_RemoveIf;

public class Produto {
	
	// Atributos
	private String nomeProd;
	private String categoriaProd;
	private double precoProd;
	
	// Construtor
	public Produto(String nomeProd, String categoriaProd, double precoProd) {
		super();
		this.nomeProd      = nomeProd;
		this.categoriaProd = categoriaProd;
		this.precoProd     = precoProd;
	}
	
	//Métodos acessores
	public String getNomeProd() {
		return nomeProd;
	}

	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	
	public String getCategoriaProd() {
		return categoriaProd;
	}
	
	public void setCategoriaProd(String categoriaProd) {
		this.categoriaProd = categoriaProd;
	}
	
	public double getPrecoProd() {
		return precoProd;
	}
	
	public void setPrecoProd(double precoProd) {
		this.precoProd = precoProd;
	}

}
