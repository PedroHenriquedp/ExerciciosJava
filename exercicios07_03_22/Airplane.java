package exercicios07_03_22;

public class Airplane {

	//Atributos
	String marca;
	String modelo;
	String cor;
	int combustivel;
	boolean chave;
	boolean passageiro;
	
	//Método Construtor
	public Airplane(String brand, String model, String color, int fuell) {
	
			this.marca=brand;
			this.modelo=model;
			this.cor=color;
			this.combustivel=fuell;
			this.chave=false;
			this.passageiro=false;
	}

	//Métodos
	public void estilo() {
		System.out.println("Marca do avião "+this.marca);
		System.out.println("Modelo do avião: "+this.modelo);
		System.out.println("Cor do avião: "+this.cor);
		System.out.println("Tem combustível suficiente? "+this.combustivel);
		System.out.println("Todas as pessoas estão abordo? "+this.passageiro);
		System.out.println("Está com a chave? "+this.chave);
	}
	
	public void tanque() {
		if(this.combustivel == 100 ) {
			System.out.println("100% da capacidade, tudo certo com o tanque!");
		}
		else {
			System.out.println("Não será possível viajar sem a quantidade máxima. \nQuantidade atual: "+this.combustivel);
		}
	}
	
	public void pessoas() {
		if(this.passageiro==true) {
		System.out.println("Quase pronto para decolar! Só falta a chave");
		}
		else {
		System.out.println("Espere todas as pessoas embarcarem!");	
		}
	}
	//People Statement 
	public void semPessoas() {
	this.passageiro=false;
	}
	public void comPessoas() {
		this.passageiro=true;
	}
	
	public void ligar(){
		if(this.chave==true) {
			System.out.println("Vamos decolar!!!");
		}
		else {
			System.out.println("Não será possível decolar sem a chave!");
		}
	}
	//Key Statement
	public void comChave() {
		this.chave=true;
	}
	public void semChave() {
		this.chave=false;
	}
}