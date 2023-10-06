package prova2_1.br.ufrn.imd.controller;


import java.util.ArrayList;

import prova2_1.br.ufrn.imd.model.Pessoa;

public class PessoaDAO {
	
	private ArrayList<Pessoa> pessoas;
	
	public PessoaDAO() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void cadastraPessoa(Pessoa p) { 
		 pessoas.add(p);
	}
	public void removePessoa(Pessoa p) {
		pessoas.remove(p);
	}

	public void listaPessoas() {
		String out = "";
		for (Pessoa p : pessoas) {
			/*if (p instanceof Carro){
				out += "Veiculo: " + v.getClass() + "\n";
				out += "Motor: " + ((Carro) v).getMotor() + "\n";
				out += "Custo M�s: " + String.format("%.2f", v.custoMensal()) + "\n";
				out += "CarbonFootprint: " + String.format("%.2f", ((Carro)v).getCarbonFootPrint()) + "\n";
				out += "************************************************************\n";
			}
			else if (v instanceof Moto){
				out += "Veiculo: " + v.getClass() + "\n";
				out += "Cilindradas: " + ((Moto) v).getCilindradas() + "\n";
				out += "Custo M�s: " + String.format("%.2f", v.custoMensal()) + "\n";
				out += "CarbonFootprint: " + String.format("%.2f",((Moto)v).getCarbonFootPrint()) + "\n";
				out += "************************************************************\n";
			}
			else {
				out += "Veiculo: " + v.getClass() + "\n";
				out += "Qnt Pessoas: " + ((Taxi) v).getQuantidadePessoas() + "\n";
				out += "Custo M�s: " + String.format("%.2f", v.custoMensal()) + "\n";
				out += "CarbonFootprint: " + String.format("%.2f",((Taxi)v).getCarbonFootPrint()) + "\n";
				out += "************************************************************\n";
			}*/
			out +="Nome : " + p.getNome() + " Salario : " + p.getSalario()+ "\n";
			out +="Agencia: " + p.getConta().getAgencia() + " Conta : " + p.getConta().getNumero() + " Saldo : " + p.getConta().getSaldo() + "\n";
			out +="Seguro : " + p.getSeguro().getNumero() + " Beneficiario : " + p.getSeguro().getBeneficiado() + "\n";
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println(out);
		System.out.println("-----------------------------------------------------------------");
	} 
	public void CalcularTributosPessoas() {
		
		for (Pessoa p : pessoas) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Nome : " + p.getNome() + " IRPF : " + GeradorImpostoRenda.calculaValorTotalTributo(p));
		}
	}
	
	/*public Pessoa maiorSalario() {
		Pessoa p = null;
		if (pessoas.size() > 0) {
			double maior = 0;
			for(int i = 0; i < pessoas.size(); i++) {
				if(GeradorImpostoRenda.calculaValorTotalTributo(i) >= maior) {
					p = pessoas.get(i);
					maior = p.getSalario();
				}
			}
		}
		return p;
	}*/

	public void imprimeImpostoTotal(){
		double valorT= 0; 
		double maiorI = 0;
		double maiorB = 0;
		String nomeM ="";
		String nomeB ="";
		for (Pessoa p : pessoas) {
			 valorT += GeradorImpostoRenda.calculaValorTotalTributo(p);
			 if(maiorI < GeradorImpostoRenda.calculaValorTotalTributo(p)) {
				 nomeM = p.getNome();
				 maiorI = GeradorImpostoRenda.calculaValorTotalTributo(p);
			 }
			 if(maiorB<p.getSeguro().calculaTributos()) {
				 maiorB = p.getSeguro().getValor();
				 nomeB = p.getSeguro().getBeneficiado();
			 }
		}
		System.out.println("-----------------------------------------------------------------");
		System.out.println("Total de impostos recolhidos: " + valorT + " \n");
		System.out.println("Pessoa com maior IRPF a pagar: " + nomeM + " \n" + "Valor: " + maiorI);
		System.out.println("Maior beneficiado(a): " + nomeB + " \n" + "Valor do beneficio: " + maiorB);


	}

}
