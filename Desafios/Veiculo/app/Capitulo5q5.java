package app;
import javax.swing.JOptionPane;

import dominion.Veiculo;
import dominion.Tools;

public class Capitulo5q5 {

	public static void main(String[] args) {
		Veiculo[] vagas = new Veiculo[10];
		String 	menu = "---     Estacionamento     ---\n";
				menu += " 1   - Entrada\n";
				menu += " 2   - Saida\n";
				menu += " 3   - Listar situacao atual\n";
				menu += " 4   - Sair\n";
				menu += "Digite a opcao desejada: ";
		int op=0;
		while(op != 4){	
			Veiculo veiculo;
			op = Integer.parseInt(input(menu));
			switch(op){
			case 1:
				
				String placa = input("Informe a placa: ");
				String modelo = input("Informe o modelo: ");
				String cor = input("Informe a cor: ");
				if(Tools.contem(vagas, placa)){
					showMsg("A placa ja existe!!");
				}else{
					veiculo = new Veiculo(placa, modelo, cor);
					showMsg(Tools.entrada(vagas, veiculo));
				}
				break;
			case 2:
				placa = input("Informe a placa: ");
				modelo = input("Informe o modelo: ");
				cor = input("Informe a cor: ");
				veiculo = new Veiculo(placa, modelo, cor);
				if(Tools.saida(vagas, veiculo)){
					showMsg("Saida liberada.");
				}else
					showMsg("vaga indisponivel. ");
				break;
			case 3:
				String cars="";
				for(Veiculo linha: vagas){
					cars += linha + " ";
				}
				showMsg(cars);
				break;
			case 4:
				showMsg("Vlw fera!");
				break;
			default:
				showMsg("digita uma opcao valida monstrao.");
				break;
			}
		}

	}
	
	
	public static void showMsg(String linha){
		JOptionPane.showMessageDialog(null, linha);
	}
	
	public static String input(String linha){
		linha = JOptionPane.showInputDialog(linha);
		return linha;
	}

}
