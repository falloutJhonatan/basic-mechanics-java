import javax.swing.JOptionPane;

public class java8Capitulo3Q3 {
	public static void main(String[]args){
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
	
	private static void showMsg(String msg){
		JOptionPane.showMessageDialog(null, msg);
	}
	
	private static String getLinha(String msg){
		String input = JOptionPane.showInputDialog(msg);
		return input;
	}

}
