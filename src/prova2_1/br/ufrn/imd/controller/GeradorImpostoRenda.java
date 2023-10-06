package prova2_1.br.ufrn.imd.controller;

import prova2_1.br.ufrn.imd.model.Pessoa;

	public class GeradorImpostoRenda {

		public static double calculaValorTotalTributo(Pessoa p) {

			double valor = p.calculaTributos();
			valor += p.getConta().calculaTributos();
			valor += p.getSeguro().calculaTributos();

			return valor;
		}
	}

