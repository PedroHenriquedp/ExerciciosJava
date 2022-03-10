package exercicios10_03_22;

public class Carne extends Produto {

	public Carne(String a, String b, String c, String d) {
		super(a, b, c, d);
	}

	@Override
	public void utilidade() {
		System.out.println("Este produto serve para fornecer nutrientes!");
		
	}

}
