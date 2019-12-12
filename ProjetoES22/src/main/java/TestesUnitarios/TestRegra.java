/**
 * 
 */
package TestesUnitarios;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.Metrica;
import ProjetoES.Regra;

/**
 * @author aguia
 *
 */
class TestRegra {

//Inicio dos testes	
	
	/**
	 * Test method for {@link ProjetoES.Regra#getAndOr()}.
	 */
	
	@Test
	public void testRegra1() {
		Regra r = new Regra(Comparador.IGUAL, Comparador.MENOR, 30, 50, Metrica.ATFD, Metrica.CYCLO, AndOr.AND);
		Comparador c = Comparador.IGUAL;
//		assertEquals(Comparador.IGUAL, c);	
	}
	
//	@Test
//	final void testGetAndOr() {
//		Regra r = new Regra(Comparador.IGUAL, Comparador.MENOR, 30, 50, Metrica.ATFD, Metrica.CYCLO, AndOr.AND);
//	}

	/**
	 * Test method for {@link ProjetoES.Regra#setAndOr(ProjetoES.AndOr)}.
	 */
	@Test
	final void testSetAndOr() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#Regra(ProjetoES.Comparador, ProjetoES.Comparador, int, int, ProjetoES.Metrica, ProjetoES.Metrica, ProjetoES.AndOr)}.
	 */
	@Test
	final void testRegra() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#getComparadorCima()}.
	 */
	@Test
	final void testGetComparadorCima() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#setComparadorCima(ProjetoES.Comparador)}.
	 */
	@Test
	final void testSetComparadorCima() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#getComparadorBaixo()}.
	 */
	@Test
	final void testGetComparadorBaixo() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#setComparadorBaixo(ProjetoES.Comparador)}.
	 */
	@Test
	final void testSetComparadorBaixo() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#getValorCima()}.
	 */
	@Test
	final void testGetValorCima() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#setValorCima(int)}.
	 */
	@Test
	final void testSetValorCima() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#getValorBaixo()}.
	 */
	@Test
	final void testGetValorBaixo() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#setValorBaixo(int)}.
	 */
	@Test
	final void testSetValorBaixo() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#getMetricaCima()}.
	 */
	@Test
	final void testGetMetricaCima() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#setMetricaCima(ProjetoES.Metrica)}.
	 */
	@Test
	final void testSetMetricaCima() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#getMetricaBaixo()}.
	 */
	@Test
	final void testGetMetricaBaixo() {

	}

	/**
	 * Test method for {@link ProjetoES.Regra#setMetricaBaixo(ProjetoES.Metrica)}.
	 */
	@Test
	final void testSetMetricaBaixo() {

	}

}
