
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Capitulo5q1 {
	
	public static void main(String[] args) {
		int[] nota = new int[5];
		int soma=0;
		String vector = "Notas: ";
		
		for(int i=0;i<5;i++){
			nota[i] = input("Digite a "+(i+1)+"º nota: ");
			soma += nota[i];
		}
		
		Arrays.sort(nota);
		
		for(int i=4;i>=0;i--){
			vector += nota[i]+" ";
		}
		showMsg(vector);
		showMsg("media: " + soma/5);
		
	}
	
	public static void showMsg(String linha){
		JOptionPane.showMessageDialog(null, linha);
	}
	
	public static int input(String linha){
		linha = JOptionPane.showInputDialog(linha);
		return Integer.parseInt(linha);
	}

}
