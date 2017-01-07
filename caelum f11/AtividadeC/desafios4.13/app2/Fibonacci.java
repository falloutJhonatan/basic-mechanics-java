package app2;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		String seila = "";
		Scanner leia = new Scanner(System.in);
		int numero = leia.nextInt();
		for(int i=0;i<numero;i++){
			seila += sequencia(i);
		}
		System.out.println(seila);
	}
	
	public static int sequencia(int x){
		return x < 2 ? x:sequencia(x-1)+sequencia(x-2);
	}

}
