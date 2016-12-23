import javax.swing.JOptionPane;

public class java8Capitulo3Q2 {
	// com um vetor e muito mais pratico!
	public static void main(String[] args){
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
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static String getLinha(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return input;
	}
	
	private static int getInt(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Integer.valueOf(input);
	}
}
