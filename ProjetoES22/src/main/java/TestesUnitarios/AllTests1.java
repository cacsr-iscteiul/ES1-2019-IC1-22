package TestesUnitarios;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestDetecaoDefeito.class, testGUI.class, TestOperacoes.class, TestRegra.class })
public class AllTests1 {

}
