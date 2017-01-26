package app;

import domain.Empresa;
import domain.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		Empresa onibus = new Empresa(new Funcionario[10]);
		Funcionario f1 = new Funcionario("Guiguiba", "menino do ar condicionado", "003", 1500);
		Funcionario f2 = new Funcionario("bife", "faca ak-47", "004", 400);
		
		onibus.adiciona(f1);
		onibus.adiciona(f2);

		for(int i=0;i<10;i++){
			Funcionario f = new Funcionario(1000 + i * 100);
			onibus.adiciona(f);
		}

		onibus.mostraEmpregados();

	}

}
