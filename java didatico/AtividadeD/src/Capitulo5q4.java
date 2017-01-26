import java.util.ArrayList;
import java.util.Random;

public class Capitulo5q4 {

	public static void main(String[] args) {
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		int numero;
		Random aleatoriamente = new Random();
		
		for(int i=0;i<20;i++){
			numero = aleatoriamente.nextInt(19)+1;
			if(numero%2==0){
				par.add(numero);
			}else
				impar.add(numero);
		}
		
		System.out.print("Pares: ");
		for(int obj: par){
			System.out.print(obj+" ");
		}
		System.out.println();
		System.out.print("Impares: ");
		for(int obj: impar){
			System.out.print(obj+" ");
		}
		
	}

}
