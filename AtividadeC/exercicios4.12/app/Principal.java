package app;

import domain.Funcionario;
import domain.Data;
public class Principal {
	public static void main(String[] args){
		Funcionario f1 = new Funcionario("Pablito", "Menino da informatica", "001", 1200);
		Data d1 = new Data();
		//d1.dia = 07;
		//d1.mes = 01;
		//d1.ano = 2017;
		f1.date(d1);
		f1.recebeAumento(50);
		System.out.println("Salario atual: "+f1.getSalario());
		System.out.println("Inss: "+f1.inss());
		System.out.println("salario liquido: "+f1.salarioLiquido());
		System.out.println("ganho anual: "+f1.calculaGanhoAnual());
		System.out.println(f1.isNaEmpresa() ? "Atualmente trabalhando na empresa.":"Atualmente demitido.");
		// o salario do fabigirl e maior porque ele conserta impressoras tbm! ;D
		Funcionario f2 = new Funcionario("Fabigirl", "Menino da impressora", "002", 1500);
		//d1.dia = 07;
		//d1.mes = 01;
		//d1.ano = 2017;
		f2.date(d1);
		if(f1 == f2)
			System.out.println("iguais");
		else
			System.out.println("diferentes");
		
		Funcionario f0 = f1;
		
		if(f1 == f0)
			System.out.println("iguais");
		else
			System.out.println("diferentes");
		//no if anterior ele comparou dois objetos distintos de mesmo tipo obtendo um resultado 'falso'
		
		System.out.println(f1.mostra());
		System.out.println(f2.mostra());
		
		//Resposta: exercicio 8 - nao e possivel instaciar variaveis de objeto dentro da classe.
		
		
	}
}
