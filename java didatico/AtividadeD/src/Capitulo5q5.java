import javax.swing.JOptionPane;

public class Capitulo5q5 {

	public static void main(String[] args) {
		String[] placas = new String[10];
		String 	menu = "---     Estacionamento     ---\n";
				menu += " 1   - Entrada\n";
				menu += " 2   - Saida\n";
				menu += " 3   - Listar situacao atual\n";
				menu += " 4   - Sair\n";
				menu += "Digite a opcao desejada: ";
		int op=0;
		while(op != 4){	
			op = Integer.parseInt(input(menu));
			switch(op){
			case 1:
				int indice = Integer.parseInt(input("Informe o numero da vaga[1 ~ 10[: "))-1;
				String placa = input("Informe a placa: ");
				if(indice >= 0 && indice < 10){
					if(placas[indice] == null){
						placas[indice] = placa;
						showMsg("Entrada liberada.");
					}else
						showMsg("vaga indisponivel. ");
				}else
					showMsg("Numero de vaga nao existe!!");
				break;
			case 2:
				indice = Integer.parseInt(input("Informe o numero da vaga[1 ~ 10[: "));
				if(indice > 0 && indice < 10){
					if(placas[indice] != null){
						placas[indice] = null;
						showMsg("Saida liberada.");
					}else
						showMsg("vaga indisponivel. ");
				}else
					showMsg("Numero de vaga nao existe!!");
				break;
			case 3:
				String cars="";
				for(String linha: placas){
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
