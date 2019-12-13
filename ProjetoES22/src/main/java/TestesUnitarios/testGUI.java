package TestesUnitarios;

import static org.junit.Assert.*;

import javax.swing.JFrame;

import org.junit.Assert;
import org.junit.Test;

import ProjetoES.GUI;

public class testGUI {
	
	private GUI gui = new GUI();
	JFrame frmQualidadeDeDeteo = null;

	@Test
	public void testMain() {
		gui.main(null);
	}

	@Test
	public void testGetFrmQualidadeDeDeteo() {
		gui.getFrmQualidadeDeDeteo();
	}

	@Test
	public void testSetFrmQualidadeDeDeteo() {
		gui.setFrmQualidadeDeDeteo(frmQualidadeDeDeteo);
	}

	@Test
	public void testGUI() {
		fail("Not yet implemented");
	}

	@Test
	public void testInitialize() {
		gui.initialize();
		Assert.assertFalse(gui.getFrmQualidadeDeDeteo().isVisible());
	}
	
	@Test
	public void testClickBotaoQualidade() {
		gui.clickBotaoQualidade();
	}
	
	@Test
	public void testClickBotaoMostrarExcel() {
		gui.clickBotaoMostrarExcel();
	}
	
	@Test
	public void testClickBotaoDetetarDefeito() {
		gui.clickBotaoDetetarDefeito();
	}

}
