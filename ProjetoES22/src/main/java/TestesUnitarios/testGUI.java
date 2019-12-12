/**
 * 
 */
package TestesUnitarios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import ProjetoES.GUI;

/**
 * @author laura
 *
 */
public class testGUI {

	private GUI gui = new GUI();
	
	@Test
	public void test() {
		gui.initialize();
		Assert.assertFalse(gui.getFrmQualidadeDeDeteo().isVisible());
	}

}
