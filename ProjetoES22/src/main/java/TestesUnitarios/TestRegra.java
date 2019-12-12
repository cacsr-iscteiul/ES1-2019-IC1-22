package TestesUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.Metrica;
import ProjetoES.Regra;

class TestRegra {

	Comparador comparadorCima = Comparador.IGUAL;
	Comparador comparadorBaixo = Comparador.MAIOR;
	int valorCima = 30;
	int valorBaixo = 50;
	Metrica metricaCima = Metrica.CYCLO;
	Metrica metricaBaixo = Metrica.LOC;
	AndOr a = AndOr.AND;

	private Regra r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
	
	@Test
	void testGetAndOr() {
		fail("Not yet implemented");
	}

	@Test
	void testSetAndOr() {
		fail("Not yet implemented");
	}

	@Test
	void testRegra() {
		fail("Not yet implemented");
	}

	@Test
	void testGetComparadorCima() {
		fail("Not yet implemented");
	}

	@Test
	void testSetComparadorCima() {
		fail("Not yet implemented");
	}

	@Test
	void testGetComparadorBaixo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetComparadorBaixo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValorCima() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValorCima() {
		fail("Not yet implemented");
	}

	@Test
	void testGetValorBaixo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetValorBaixo() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMetricaCima() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMetricaCima() {
		fail("Not yet implemented");
	}

	@Test
	void testGetMetricaBaixo() {
		fail("Not yet implemented");
	}

	@Test
	void testSetMetricaBaixo() {
		fail("Not yet implemented");
	}

}
