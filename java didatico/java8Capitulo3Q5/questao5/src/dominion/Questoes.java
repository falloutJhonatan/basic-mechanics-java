package dominion;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Questoes {
	//Primeira questao
	public static void q01(){

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
	//Segunda questao
	public static void q02(){
			// com um vetor e muito mais pratico!
		int[] r = new int[4];
	
		r[0] = getInt("R1: ");
		r[1] = getInt("R2: ");
		r[2] = getInt("R3: ");
		r[3] = getInt("R4: ");
		double soma = r[0] + r[1] + r[2] + r[3];
		String[] mm = maiorEmenor(r).split(",");
		
		showMsg("Resistencias fornecidas: \n"+r[0]+", "+r[1]+", "+r[2]+", "+r[3]+"\nA maior Resistencia e: "+mm[0]+"\nA menor Resistencia e: "+mm[1]);
		
		
	}
			
	private static String maiorEmenor(int r[]){
		double maior=r[0], menor=99999999;
		for(int i=1; i<4; i++){
			if(r[i] > maior){
				maior = r[i];
			}
			if(r[i] < menor){
				menor = r[i];
			}
		}
		return maior +","+ menor;
	}
	//Terceira questao
	public static void q03(){

		String login=	"java8", senha="java8", log,passwd;
			
		for(int i=3;i>0;i--){
		log		=	getLinha("Forneca um login");
		passwd 	=	getLinha("Forneca uma senha");
				
		if((login.equals(log))&&(senha.equals(passwd))){
			showMsg("Login e senha aceitos!");
			break;
		}else
			showMsg("Falha, verifique login e senha!\nVoce tem mais "+(i-1)+" tentativa(s)");
		}
	}
	
	//Quarta questao
	public static void q04(){
		int numero = getInt("Forneca um numero");
		String msg="";
		for(int i=1;i<=10;i++){
			msg += numero+" x "+i+" = "+(numero*i)+"\n";
		}
		
		showMsg(msg);

	}
	
	private static int getInt(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Integer.valueOf(input);
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
