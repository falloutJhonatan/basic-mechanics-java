
import java.util.Scanner;

public class CaelumCapitulo3Q8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n = leia.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i*j + " ");
			}
			System.out.println();
		}

	}

}
