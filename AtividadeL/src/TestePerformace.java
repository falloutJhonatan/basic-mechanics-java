import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestePerformace {

	public static void main(String[] args) {

		System.out.println("Iniciando...");
		Collection<Integer> teste = new HashSet<>();
		long inicio = System.currentTimeMillis();
		int total = 30000;
		long iniFor01 = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		long fimFor01 = System.currentTimeMillis();

		long iniFor02 = System.currentTimeMillis();
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		long fimFor02 = System.currentTimeMillis();

		long fim = System.currentTimeMillis();
		long tempoFor01 = fimFor01 - iniFor01;
		long tempoFor02 = fimFor02 - iniFor02;
		long tempo = fim - inicio;
		System.out.println("Tempo gasto: " + tempo);
		System.out.println("Tempo gasto para inserir: " + tempoFor01);
		System.out.println("Tempo gasto para consultar: " + tempoFor02);
	}

}
