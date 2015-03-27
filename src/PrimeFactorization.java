import java.util.ArrayList;

public class PrimeFactorization {
	public ArrayList<Integer> getPrimeFactorization(int x) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		int n = x;
		int p = 2;
		do {
			if (n == 1) {
				break;
			}
			else if (isPrime(n)) {
				primeFactors.add(n);
				break;
			}
			else if (n % p == 0) {
				primeFactors.add(p);
				n /= p;
				p = 2;
			}
		} while (true);
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
	
	public int nextPrime(int x) {
		int next = x + 1;
		while (true) {
			if (isPrime(next)) {
				return next;
			} else {
				next++;
			}
		}
	}
}
