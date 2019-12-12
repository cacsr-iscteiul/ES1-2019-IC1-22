package TestesUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.Metrica;
import ProjetoES.Regra;

class TestDetecaoDefeito {

	Comparador comparadorCima;
	Comparador comparadorBaixo;
	int valorCima = 30;
	int valorBaixo = 50;
	Metrica metricaCima;
	Metrica metricaBaixo;
	AndOr a;
	
	private Regra r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
	
	@Test
	void test1() {
		
	}
	

}
