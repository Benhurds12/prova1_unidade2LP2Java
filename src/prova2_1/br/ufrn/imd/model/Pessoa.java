package prova2_1.br.ufrn.imd.model;

import prova2_1.br.ufrn.imd.model.ContaCorrente;
import prova2_1.br.ufrn.imd.model.SeguroVida;
import prova2_1.br.ufrn.imd.model.Tributavel;

public class Pessoa implements Tributavel{
	private String nome;
	private double salario; 
	private ContaCorrente conta; 
	private SeguroVida seguro;
	
	public Pessoa() {

	}

	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public ContaCorrente getConta() {
		return conta;
	}
	public void setConta(ContaCorrente conta) {
		this.conta = conta;
	}
	public SeguroVida getSeguro() {
		return seguro;
	}
	public void setSeguro(SeguroVida seguro) {
		this.seguro = seguro;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public double calculaTributos() {
		// TODO Auto-generated method stub
		double valor = salario * 0.11;
		return valor;
	}
}