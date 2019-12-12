/**
 * 
 */
package TestesUnitarios;

import org.junit.Assert;
import org.junit.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.Metrica;
import ProjetoES.Regra;

/**
 * @author aguia
 *
 */
public class TestRegra {
	private Regra r;

	Comparador comparadorCima = Comparador.IGUAL;
	Comparador comparadorBaixo = Comparador.MAIOR;
	int valorCima = 30;
	int valorBaixo = 50;
	Metrica metricaCima = Metrica.CYCLO;
	Metrica metricaBaixo = Metrica.LOC;
	AndOr a = AndOr.AND;


	@Test
	public void testRegra1() {
		r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(AndOr.AND, r.getAndOr());
	}

	@Test
	public void testRegra2() {

		Regra r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(Comparador.IGUAL, r.getComparadorCima());		
	}

	@Test
	public void testRegra3() {
		r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(Comparador.MAIOR, r.getComparadorBaixo());
	}

	@Test
	public void testRegra4() {
		r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(30, r.getValorCima());
	}

	@Test
	public void testRegra5() {
		r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(50, r.getValorBaixo());
	}

	@Test
	public void testRegra6() {
		r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(Metrica.CYCLO, r.getMetricaCima());
	}

	@Test
	public void testRegra7() {
		r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
		Assert.assertEquals(Metrica.LOC, r.getMetricaBaixo());
	}


}
