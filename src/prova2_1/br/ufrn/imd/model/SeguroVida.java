package prova2_1.br.ufrn.imd.model;

import prova2_1.br.ufrn.imd.model.Tributavel;

public class SeguroVida implements Tributavel{
	public int numero;
	public String beneficiado;
	public double valor;
	public double taxa;
	
	public SeguroVida() {

	}

	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getBeneficiado() {
		return beneficiado;
	}
	public void setBeneficiado(String beneficiado) {
		this.beneficiado = beneficiado;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	@Override
	public double calculaTributos() {
		double valor = 31.5;
		return valor;
	}
}
