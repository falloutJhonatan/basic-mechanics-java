package model;

import java.util.*;

public class TestaOrdenacao {

	public static void main(String[] args) {

		List<ContaPoupanca> contas = new LinkedList();

		ContaPoupanca c1 = new ContaPoupanca();

		c1.numero = 1973;
		c1.saldo = 1000;
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca();
		c2.numero = 1983;
		c2.saldo = 2000;
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca();
		c3.numero = 1993;
		c3.saldo = 3000;
		contas.add(c3);
		// ArrayList ordenado com p metodo compareTo da interface Comparable
		Collections.sort(contas);
		// Caso a classe ContaPoupanca nao implementasse Comparable o metodo
		// sort de Colletions nao conseguiria execultar a ordenacao
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNumero() + "   " + contas.get(i).getSaldo());
		}
		//invertendo a lista
		Collections.sort(contas, Collections.reverseOrder());
		System.out.println("-   Array invertido   -");
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNumero() + "   " + contas.get(i).getSaldo());
		}
		//embaralhando os elementos da lista
		Collections.shuffle(contas);
		//Rotacionando elementos
		Collections.rotate(contas, 1);
		System.out.println("-   Array rotacionado   -");
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i).getNumero() + "   " + contas.get(i).getSaldo());
		}
	
	}

}
