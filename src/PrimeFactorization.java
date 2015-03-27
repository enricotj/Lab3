import java.util.ArrayList;

public class PrimeFactorization {
	public ArrayList<Integer> getPrimeFactorization(int x) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		if (isPrime(x)) {
			primeFactors.add(x);
		}
		return primeFactors;
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
