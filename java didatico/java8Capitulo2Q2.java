import java.util.Scanner;

public class java8Capitulo2Q2{
	public static void main(String[]args){
		Scanner leia = new Scanner(System.in);
		int qtdPontosLider, qtdPontosLanterna, diff;
		System.out.print("quantidade de pontos lider: ");
		qtdPontosLider = leia.nextInt();
		System.out.print("quantidade de pontos laterna: ");
		qtdPontosLanterna = leia.nextInt();
		diff = qtdPontosLider - qtdPontosLanterna;
		System.out.printf("O lanterna precisara vencer %d partidas.", diff/3);
	}
}
