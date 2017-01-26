package app;

import javax.swing.JOptionPane;

import dominion.Questoes;

public class Principal {

	public static void main(String[] args) {
		String menu = "1-Exercicio 1\n2-Exercicio 2\n3-Exercicio 3\n4-Exercicio 4";
		int op = getInt(menu);
		switch(op){
		case 1:
			Questoes.q01();
			break;
		case 2:
			Questoes.q02();
			break;
		case 3:
			Questoes.q03();
			break;
		case 4:
			Questoes.q04();
			break;
		}
	}
	
	private static int getInt(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Integer.valueOf(input);
	}

}
