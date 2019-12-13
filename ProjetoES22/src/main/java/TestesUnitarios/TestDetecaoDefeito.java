package TestesUnitarios;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Assert;
import org.junit.Test;

import ProjetoES.AndOr;
import ProjetoES.Comparador;
import ProjetoES.DetecaoDefeito;
import ProjetoES.Metrica;
import ProjetoES.Regra;

public class TestDetecaoDefeito {
	
	DetecaoDefeito detecaodefeito = new DetecaoDefeito();
	Comparador comparadorCima=Comparador.IGUAL;
	Comparador comparadorBaixo=Comparador.MAIOR;
	int valorCima = 3;
	int valorBaixo = 1;
	Metrica metricaCima=Metrica.LOC;
	Metrica metricaBaixo=Metrica.CYCLO;
	AndOr a=AndOr.AND;
	Boolean[] vetorBooleanJunto=new Boolean[420];
	int[] vetorFinal=new int[14];
	private Regra r = new Regra (comparadorCima, comparadorBaixo, valorCima, valorBaixo, metricaCima, metricaBaixo, a);
	private Regra r2 = new Regra(Comparador.MENOR,Comparador.MAIOR,40,0,Metrica.LAA,Metrica.ATFD,AndOr.OR);
	File file=new File("Long-Method.xlsx");

	@Test
	public void testGetVetorBooleanJunto() {
		Assert.assertEquals(detecaodefeito.getVetorBooleanJunto(), vetorBooleanJunto);
	}

	@Test
	public void testGetVetorFinal() {
		Assert.assertEquals(detecaodefeito.getVetorFinal(), vetorFinal);
	}
	
	@Test
	public void testSetVetorFinal() {
		detecaodefeito.setVetorFinal(vetorFinal);
	}
	
	@Test
	public void testSetVetorBooleanJunto() {
		detecaodefeito.setVetorBooleanJunto(vetorBooleanJunto);
	}
	
	@Test
	public void testDetecaoDefeito() {
		detecaodefeito.detetarDefeito(r,file);
	}
	
	@Test
	public void testDetecaoDefeito2() {
		detecaodefeito.detetarDefeito(r2,file);
	}

}
