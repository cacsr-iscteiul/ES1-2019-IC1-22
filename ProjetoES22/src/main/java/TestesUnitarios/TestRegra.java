package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.Metrica;
import ProjetoES.Regra;

public class TestRegra {

	Comparador comparadorCima = Comparador.IGUAL;
	Comparador comparadorBaixo = Comparador.MAIOR;
	int valorCima = 30;
	int valorBaixo = 50;
	Metrica metricaCima = Metrica.CYCLO;
	Metrica metricaBaixo = Metrica.LOC;
	AndOr a = AndOr.AND;

	private Regra r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
	
	@Test
public void testGetAndOr() {
		Assert.assertEquals(r.getAndOr(),a );
	}
	
	@Test
public void testSetAndOr() {
		r.setAndOr(a);
	}

//	@Test
//	void testRegra() {
//		fail("Not yet implemented");
//	}

	@Test
	public 	void testGetComparadorCima() {
		Assert.assertEquals(r.getComparadorCima(),comparadorCima );
	}
	
	@Test
	public 	void testSetComparadorCima() {
		r.setComparadorCima(comparadorCima);
	}
	
	@Test
	public 	void testSetComparadorBaixo() {
		r.setComparadorBaixo(comparadorBaixo);
	}

	@Test
	public void testGetComparadorBaixo() {
		Assert.assertEquals(r.getComparadorBaixo(),comparadorBaixo );
	}

	@Test
	public void testGetValorCima() {
		Assert.assertEquals(r.getValorCima(),valorCima );
	}
	
	@Test
	public void testSetValorCima() {
		r.setValorCima(valorCima);
	}
	
	@Test
	public void testSetValorBaixo() {
		r.setValorBaixo(valorBaixo);
	}

	@Test
	public void testGetValorBaixo() {
		Assert.assertEquals(r.getValorBaixo(),valorBaixo );
	}

	@Test
	public void testGetMetricaCima() {
		Assert.assertEquals(r.getMetricaCima(),metricaCima );
	}

	@Test
	public void testGetMetricaBaixo() {
		Assert.assertEquals(r.getMetricaBaixo(),metricaBaixo );
	}
}
