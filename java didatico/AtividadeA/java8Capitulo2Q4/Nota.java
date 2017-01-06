public class Nota {
	private double nota1,nota2,nota3;
	
	Nota(double n1, double n2, double n3){
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
	}
	
	public double media(){
		return (this.nota1 + this.nota2 + this.nota3)/3;
	}
	
}
