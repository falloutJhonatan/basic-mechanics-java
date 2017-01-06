import javax.swing.JOptionPane;

public class java8Capitulo2Q3 {
	public static void main(String[]args){
		double valorVenal, valorTransacao, porcentagemImposto, valorImposto;
		
		valorVenal          =   getDouble("Valor venal: ");
		valorTransacao      =   getDouble("Valor transacao: ");
		porcentagemImposto  =   getDouble("Porcentagem imposto: ");
		
		if(valorVenal >= valorTransacao){
			valorImposto = aplicaImposto(valorVenal, porcentagemImposto);
		}else
			valorImposto = aplicaImposto(valorTransacao, porcentagemImposto);
		
		showMsg("Valor imposto: " + valorImposto);
		
	}
	
	private static double aplicaImposto(double valor,double taxa){
		return valor * (taxa / 100);
	}
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static double getDouble(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Double.valueOf(input);
	}
}
