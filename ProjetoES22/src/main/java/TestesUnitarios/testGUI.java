package TestesUnitarios;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ProjetoES.GUI;

public class testGUI {
	
	private GUI gui = new GUI();

	@Test
	public void testMain() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFrmQualidadeDeDeteo() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFrmQualidadeDeDeteo() {
		fail("Not yet implemented");
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

}
