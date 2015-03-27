import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class PrimeGenerationTests {
	PrimeGenerator pg;

	@Before
	public void setup() {
		pg = new PrimeGenerator();
	}
	
	@Test
	public void test1() {
		assertTrue(pg.generatePrimes(1).isEmpty());
	}
}
