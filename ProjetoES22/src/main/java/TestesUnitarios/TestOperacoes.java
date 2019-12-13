package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ProjetoES.Operacoes;

public class TestOperacoes {
	
	private  int DCI_longMehtod_plasma=0; //true true
	private  int DII_longMehtod_plasma=0; //true false 
	private  int ADCI_longMehtod_plasma=0; //false false
	private  int ADII_longMehtod_plasma=0;

	private  int DCI_longMehtod_PMD=0; //true true
	private  int DII_longMehtod_PMD=0; //true false 
	private  int ADCI_longMehtod_PMD=0; //false false
	private  int ADII_longMehtod_PMD=0;

	private  int DCI_Regra=0; //true true
	private  int DII_Regra=0; //true false 
	private  int ADCI_Regra=0; //false false
	private  int ADII_Regra=0;

	Operacoes o = new Operacoes();





	@Test
	public void testGetDCI_longMehtod_plasma() {
		o.getDCI_longMehtod_plasma();
		Assert.assertEquals(DCI_longMehtod_plasma, o.getDCI_longMehtod_plasma());
	}

	@Test
	public void testGetDII_longMehtod_plasma() {
		Assert.assertEquals(DII_longMehtod_plasma, o.getDII_longMehtod_plasma());
	}

	@Test
	public void testGetADCI_longMehtod_plasma() {
		Assert.assertEquals(ADCI_longMehtod_plasma, o.getADCI_longMehtod_plasma());
	}

	@Test
	public void testGetADII_longMehtod_plasma() {
		Assert.assertEquals(ADII_longMehtod_plasma, o.getADII_longMehtod_plasma());
	}

	@Test
	public void testGetDCI_longMehtod_PMD() {
		Assert.assertEquals(DCI_longMehtod_PMD, o.getDCI_longMehtod_PMD());
	}

	@Test
	public void testGetDII_longMehtod_PMD() {
		Assert.assertEquals(DII_longMehtod_PMD, o.getDII_longMehtod_PMD());
	}

	@Test
	public void testGetADCI_longMehtod_PMD() {
		Assert.assertEquals(ADCI_longMehtod_PMD, o.getADCI_longMehtod_PMD());
	}

	@Test
	public void testGetADII_longMehtod_PMD() {
		Assert.assertEquals(ADII_longMehtod_PMD, o.getADII_longMehtod_PMD());
	}

	@Test
	public void testGetDCI_Regra() {
		Assert.assertEquals(DCI_Regra, o.getDCI_Regra());
	}

	@Test
	public void testGetDII_Regra() {
		Assert.assertEquals(DII_Regra, o.getDII_Regra());
	}

	@Test
	public void testGetADCI_Regra() {
		Assert.assertEquals(ADCI_Regra, o.getADCI_Regra());
	}

	@Test
	public void testGetADII_Regra() {
		Assert.assertEquals(ADII_Regra, o.getADII_Regra());
	}


}
