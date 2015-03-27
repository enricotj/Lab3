import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorizationTests {
	PrimeFactorization pf;

	@Before
	public void setup() {
		pf = new PrimeFactorization();
	}
	
	@Test
	public void test1() {
		assertTrue(pf.getPrimeFactorization(1).isEmpty());
	}
	
	@Test
	public void test2() {
		assertTrue(pf.getPrimeFactorization(2).get(0) == 2);
	}
}
