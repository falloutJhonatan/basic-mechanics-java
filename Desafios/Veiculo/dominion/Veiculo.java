package dominion;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	
	public Veiculo(String placa, String modelo, String cor){
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	@Override
	public String toString() {
		return this.placa;
	}
	
}
