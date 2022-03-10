package exercicios10_03_22;

public class Detergente extends Produto{

	public Detergente(String a, String b, String c, String d) {
		super(a, b, c, d);
	}

	@Override
	public void utilidade() {
		System.out.println("Estre produto serve para limpar!");
		
	}
	
}
