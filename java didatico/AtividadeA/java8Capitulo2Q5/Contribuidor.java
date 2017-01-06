public class Contribuidor {
	private int idade;
	private String sexo;
	private int anosContribuicao;
	
	public Contribuidor(int idade, String sexo, int anosContribuicao) {
		this.idade = idade;
		this.sexo = sexo;
		this.anosContribuicao = anosContribuicao;
	}

	public int getIdade() {
		return idade;
	}

	public String getSexo() {
		return sexo;
	}

	public int getAnosContribuicao() {
		return anosContribuicao;
	}
	
}
