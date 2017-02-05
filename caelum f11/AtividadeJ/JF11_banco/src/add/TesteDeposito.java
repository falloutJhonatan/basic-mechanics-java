package add;

import model.Conta;
import model.ContaPoupanca;

public class TesteDeposito {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();

		cp.deposita(-100);
	}

}
