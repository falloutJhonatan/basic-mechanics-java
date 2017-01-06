import java.util.Random;

import javax.swing.JOptionPane;

public class Capitulo5q3 {

	public static void main(String[] args) {
		int[][] ibagem = new int[40][40];
		String corda = "";
		
		Random aleatoriamente = new Random();
		for(int i=0;i<40;i++){
			for(int j=0;j<40;j++){
				ibagem[i][j] = aleatoriamente.nextInt(256);
			}
		}
		for(int i=0;i<40;i++){
			for(int j=0;j<40;j++){
				corda += ibagem[i][j] + " |";
			}
			corda += "\n";
		}
		showMsg(corda);
	}
	
	public static void showMsg(String linha){
		JOptionPane.showMessageDialog(null, linha);
	}

}
