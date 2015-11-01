/**
 * @author Sanjay
 *
 */

public class PrimeNumbers {

	public static boolean isPrime(int number) {
		/*
		 * Optimized Method if(number == 1) return false; if(number < 4) return
		 * true; if(number % 2 == 0) return false; if(number < 9) return true;
		 * if(number % 3 == 0) return false; long findTill = (long)
		 * Math.sqrt(number); int factor = 5; while(factor <= findTill){
		 * if(number % factor == 0) return false; factor += 2; if(number %
		 * factor == 0) return false; factor += 4; } return true;
		 */
		if(number == 1) return false;
		long findUntil = (long) Math.sqrt(number);
		int f = 2;
		while (f <= findUntil) {
			if (number % f == 0)
				return false;
			f++;
		}
		return true;
	}
	
	/*
	 * Sieve of Eratosthenes
	 */
	public static void sieveOfEratosthenes(int number) {
		boolean[] sieve = new boolean[number + 1];
		int factor = 2;
		for(int i = factor; i < Math.sqrt(number); i++){
			if(!sieve[i]){
				for(int j = i *2; j <= number; j += i)
					sieve[j] = true;
			}
		}
		
		System.out.println(" Prime Numbers till " + number + " : "); 
		for(int i = 2; i <= number; i++)
			if(!sieve[i])
				System.out.print(" " + i);
		System.out.println();
	}
	
	public static void primeFactorize(int number){
		System.out.print(" Prime Factorization of " + number + " : ");
		while(number % 2 == 0){
			System.out.print("2 ");
			number /= 2;
		}
		int sqrt = (int)Math.sqrt(number);
		for(int i = 3; i <= sqrt; i+=2){
			while(number % i == 0){
				System.out.print(i + " ");
				number /= i;
			}
		}
		if(number > 2)
			System.out.print(number);
		System.out.println();
	}

	public static void main(String[] args) {

		System.out.println(" Is 97 prime ? " + isPrime(97));
		sieveOfEratosthenes(200);
		primeFactorize(207901);
	}
}
