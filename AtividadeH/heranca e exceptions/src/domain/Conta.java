package domain;

public abstract class Conta {
	protected double saldo;
	/*public static abstract final synchronized volatile int d=0;*/
	public void deposita(double valor) {
		if(valor < 0)
			throw new IllegalArgumentException("Você tentou depositar" +
					" um valor negativo");
		else
			this.saldo += valor;
	}

	public void saca(double valor) {
		this.saldo -= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
}
