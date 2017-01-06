import java.util.Scanner;

public class Principal {
	//à la python
	public static void main(String[] args){
		int  idade, anosContribuicao;
		String sexo; 
		
		idade				=	Integer.valueOf( input("Idade: ") );
		anosContribuicao	=	Integer.valueOf( input("Anos de Contribuicao: ") );
		sexo				=	input("Sexo: ");
		Contribuidor pessoa = new Contribuidor(idade, sexo, anosContribuicao);
		aposentadoria(pessoa);
		
	}
	
	private static String input(String msg){
		Scanner leia = new Scanner(System.in);
		System.out.print(msg);
		return leia.next();
	}
	
	private static void aposentadoria(Contribuidor c){
		if(c.getSexo().equals("F") || c.getSexo().equals("f")){
			if(c.getIdade() < 60 && c.getAnosContribuicao() < 30 ){
				System.out.println("você nao tem o direito a aposentadoria");
			}else
				System.out.println("você ja tem o direito a aposentadoria”");
		}else{
			if(c.getSexo().equals("M") || c.getSexo().equals("m")){
				if(c.getIdade() < 65 && c.getAnosContribuicao() < 35){
					System.out.println("você nao tem o direito a aposentadoria");
				}else
					System.out.println("você ja tem o direito a aposentadoria");
			}
		}
	}
}
