package interfaces;

public class exercicio {
	public static void main(String[] args) {
		AreaCalculavel a = new Quadrado(2);
		AreaCalculavel b = new Circulo(2);
		System.out.println(a.calculaArea());
		System.out.println(b.calculaArea());
		
		
	}
}
