import javax.swing.JOptionPane;

public class java8Capitulo3Q4 {

	public static void main(String[] args) {
		int numero = getInt("Forneca um numero");
		String msg="";
		for(int i=1;i<=10;i++){
			msg += numero+" x "+i+" = "+(numero*i)+"\n";
		}
		
		showMsg(msg);

	}
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static int getInt(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return Integer.valueOf(input);
	}

}
