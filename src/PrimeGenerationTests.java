import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
	
	@Test
	public void test2() {
		ArrayList<Integer> result = pg.generatePrimes(2);
		assertTrue(result.size() == 1);
		assertTrue(result.get(0) == 2);
	}
	
	@Test
	public void test3() {
		ArrayList<Integer> result = pg.generatePrimes(2);
		assertTrue(result.size() == 1);
		assertTrue(result.get(0) == 2);
	}
	
	@Test
	public void test4() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(3);
		
		assertTrue(pg.generatePrimes(2).equals(test));
	}
}
