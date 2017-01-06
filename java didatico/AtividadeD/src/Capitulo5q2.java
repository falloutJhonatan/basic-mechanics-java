import java.util.Random;

import javax.swing.JOptionPane;

public class Capitulo5q2 {

	public static void main(String[] args) {
		String[] mes = new String[12];
		mes[0] = "janeiro"; mes[1] = "fevereiro"; mes[2] = "marco";  mes[3] = "abril";
		mes[4] = "maio";    mes[5] = "junho";     mes[6] = "julho"; mes[7] = "agosto";
		mes[8] = "setembro"; mes[9] = "outubro"; mes[10] = "novembro"; mes[11] = "dezembro";
		
		Random aleatorio = new Random();
		
		showMsg(mes[aleatorio.nextInt(12)]);
		
	}
	public static void showMsg(String linha){
		JOptionPane.showMessageDialog(null, linha);
	}

}
