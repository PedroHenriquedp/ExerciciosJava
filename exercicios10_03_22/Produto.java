package exercicios10_03_22;

public abstract class Produto {

	private String nome;
	private String barcode;
	private String categoria;
	private String validade;
	
	public Produto(String a, String b, String c, String d) {
		this.nome=a;
		this.barcode=b;
		this.categoria=c;
		this.validade=d;
	}
	
	public abstract void utilidade();
	
	
	//Getters e Setters
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getValidade() {
		return validade;
	}

	public void setValidade(String validade) {
		this.validade = validade;
	}
	
	
}
