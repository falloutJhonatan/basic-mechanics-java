package model;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

	public void atualiza(double taxa) {
		this.saldo += this.saldo * (taxa*3);
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		if(this.getSaldo() < o.getSaldo()){
			return -1;
		}
		if(this.getSaldo() > o.getSaldo()) {
			return 1;
		}
		return 0;
	}

}
