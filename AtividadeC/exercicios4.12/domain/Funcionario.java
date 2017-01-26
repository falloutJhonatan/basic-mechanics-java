package domain;

public class Funcionario {
	private static int cont=0;
	private boolean naEmpresa = true;
	private int identificador=0;
	public double salario;
	private String nome;
	private Data dataEntrada;
	private String departamento;
	private String rg;
	
	public Funcionario(double salario){
		this.salario = salario;
		dataEntrada = new Data();
		this.identificador = cont++;
	}
	
	public Funcionario(String nome, String departamento, String rg, double salario) {
		this.salario = salario;
		this.nome = nome;
		this.departamento = departamento;
		this.rg = rg;
		dataEntrada = new Data();
		this.identificador = cont++;
	}
	//peguei leve tirei so o inss
	public double inss(){
		return salario * 0.3;
	}
	
	public int getIdentificador() {
		return identificador;
	}

	public boolean isNaEmpresa() {
		return naEmpresa;
	}
	
	public boolean demite(){
		if(naEmpresa == true){
			naEmpresa = false;
			return true;
		}
		else
			return false;
	}
	
	public void date(Data d){
		this.dataEntrada = new Data();
		this.dataEntrada = d;
	}
	
	private String dataFormatada(){
		return dataEntrada.dia+"/"+dataEntrada.mes+"/"+dataEntrada.ano;
	}
	
	public double getSalario() {
		return salario;
	}
	public double salarioLiquido(){
		return salario - inss();
	}
	
	public void recebeAumento(double money){
		this.salario += money;
	}
	
	public double calculaGanhoAnual(){
		return salario * 12;
	}

	public String mostra() {
		return "Funcionario : " + nome + "\nIdentificador: "+identificador+"Salario: " + salario + "		Data de entrada: " + null + "		Departamento: "
				+ departamento + "\nRg: " + rg;
	}

	
	
}
