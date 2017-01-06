
import java.util.Scanner;

public class CaelumCapitulo3Q7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int x = leia.nextInt();
		System.out.print(x);
		while(x > 1){
			if(x % 2 == 0){
				x = x/2;
			}else{
				x = 3 * x + 1;
			}
			System.out.print(" -> " + x);
		}
	}

}
