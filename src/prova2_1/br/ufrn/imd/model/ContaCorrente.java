package prova2_1.br.ufrn.imd.model;

import prova2_1.br.ufrn.imd.model.ContaCorrente;
import prova2_1.br.ufrn.imd.model.Tributavel;

public class ContaCorrente implements Tributavel{
	protected String agencia;
	protected String numero;
	protected double saldo;	
	
	public ContaCorrente() {

	}	
		@Override
		public double calculaTributos() {
			double valor = this.saldo * 0.0038;
			return valor;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valor){
		if(this.saldo < valor) {
			System.out.println("Saldo insuficiente ou valor menor que 0!");
		}
		else {
			System.out.println("Saque de " + valor + " em [" + this.numero + "] efetuado com sucesso!");
			this.saldo -= valor;
		}
	}
	
	public void depositar(double valor) {
		System.out.println("Deposito de " + valor + " em [" + this.numero + "] efetuado com sucesso!");
		this.saldo += valor;
	}
	public boolean transferir(double valor, ContaCorrente cc) {
		if (valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
			cc.saldo += valor;
			System.out.println("Transferindo " + valor + " para [" + cc.getNumero() + "]");
		return true;
	}
		else {
			System.out.println("Saldo insuficiente ou valor menor que 0!");
			return false;
		}
		
	}
}