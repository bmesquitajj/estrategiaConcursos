package steps;

import static utils.Utils.acessarSistema;
import static utils.Utils.capturaTela;
import static utils.Utils.driver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before()
	public static void setUp() {
		acessarSistema();
	}
	

	@After
	public static void tearDown(Scenario scenario) {
		capturaTela(scenario);
		driver.quit();
	}
}
