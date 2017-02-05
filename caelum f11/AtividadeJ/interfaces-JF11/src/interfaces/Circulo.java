package interfaces;

public class Circulo implements AreaCalculavel{
	private float raio;
	
	public Circulo(float raio) {
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * this.raio * this.raio;
	}
	
	
}
