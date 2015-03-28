import java.util.ArrayList;
import java.util.List;

public class PrimeGenerator {
	public List<Integer> generatePrimes(int x) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if (isPrime(x)) {
			primes.add(x);
		}
		return primes;
	}
	
	public boolean isPrime(int x) {
		if (x == 1) {
			return false;
		}
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}
}
