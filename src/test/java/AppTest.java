import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

import Sonar.App;

public class AppTest {

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMult() {
		int resultMult = 6;
		
		App app = new App();
		assertEquals(resultMult, app.mult(2, 3));
	}
	
}
