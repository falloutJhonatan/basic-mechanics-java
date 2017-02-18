package model;

public abstract class Conta {
	protected int numero;
	protected double saldo;
	
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
	
	public int getNumero() {
		return numero;
	}

	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa;
	}
	
}
