package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.Metrica;
import ProjetoES.Regra;

public class TestDetecaoDefeito {
	
	Comparador comparadorCima;
	Comparador comparadorBaixo;
	int valorCima = 30;
	int valorBaixo = 50;
	Metrica metricaCima;
	Metrica metricaBaixo;
	AndOr a;
	
	private Regra r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);

	@Test
	public void testDetetarDefeito() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVetorBooleanJunto() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetVetorFinal() {
		fail("Not yet implemented");
	}

}
