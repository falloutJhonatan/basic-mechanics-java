import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args){
		double nota1, nota2, nota3;
		Nota nota;
		
		nota1 = getDouble("Nota avaliacao 1: ");
		nota2 = getDouble("Nota avaliacao 2: ");
		nota3 = getDouble("Nota trabalho: ");
		nota = new Nota(nota1,nota2,nota3);
		
		showMsg("Media das notas: " + nota.media());
	}
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static double getDouble(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Double.valueOf(input);
	}
}
