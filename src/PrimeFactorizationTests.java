import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

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
	
	@Test
	public void test3() {
		assertTrue(pf.getPrimeFactorization(3).get(0) == 3);
	}
	
	@Test
	public void test4() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(2);
		
		assertTrue(pf.getPrimeFactorization(4).equals(test));
	}
	
	@Test
	public void test6() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(3);
		
		assertTrue(pf.getPrimeFactorization(6).equals(test));
	}
	
	@Test
	public void test8() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(2);
		test.add(2);
		
		assertTrue(pf.getPrimeFactorization(8).equals(test));
	}
	
	@Test
	public void test9() {
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(3);
		test.add(3);
		
		assertTrue(pf.getPrimeFactorization(8).equals(test));
	}
}
