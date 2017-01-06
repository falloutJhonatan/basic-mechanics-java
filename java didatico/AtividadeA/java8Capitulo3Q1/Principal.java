import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args){
		String nome = getLinha("Nome: ");
		double valor = getDouble("valor: ");
		Produto produto = new Produto(nome, valor);
		DecimalFormat decimal = new DecimalFormat("#0.00");
		
		showMsg("Nome do Produto: " + produto.getNome() +
				"\nValor original do produto: R$" + decimal.format(produto.getValor()) +
				"\nValor do produto com desconto: R$" + decimal.format(desconto(produto.getValor()))
				);
	}
	private static double desconto(double valor){
		if(valor >= 1000){
			return valor * 0.08f;
		}else{
			if(valor >= 500 && valor < 1000){
				return valor * 0.07f;
			}else{
				if(valor >= 200 && valor < 500){
					return valor * 0.06f;
				}else
					return valor * 0.05f;
			}
		}
	}
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static String getLinha(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return input;
	}
	
	private static double getDouble(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Double.valueOf(input);
	}
}
