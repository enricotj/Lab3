import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeGenerationTests {

	private Integer inputNumber;
	private List<Integer> expectedResult;
	private PrimeGenerator primeGen;

	@Before
	public void initialize() {
		primeGen = new PrimeGenerator();
	}

	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method
	public PrimeGenerationTests(Integer inputNumber, List<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		List<Integer> oneResult = Arrays.asList();
		return Arrays.asList(new Object[][] { {1, oneResult} });
	}

	@Test
	public void testPrimeNumberGenerator() {
		System.out.println("Generating prime numbers up to and including " + inputNumber);
		assertEquals(expectedResult, primeGen.generatePrimes(inputNumber));
	}
}