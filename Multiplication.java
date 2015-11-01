/**
 * @author Sanjay
 *
 */

public class Multiplication {

	public static long multiplyUsingShift(int a, int b){
		int absA = Math.abs(a);
		int absB = Math.abs(b);
		long result = 0L;
		System.out.println(" A = " + absA + " B = " + absB + " Result = "
				+ result);
		while (absA > 0 || absA < 0) {
			if ((absA & 1) > 0)
				result += absB; // Is odd
			absA >>= 1;
			absB <<= 1;
			System.out.println(" A = " + absA + " B = " + absB + " Result = "
					+ result);
		}
		return ((a > 0) && ( b > 0) || (a < 0) && ( b < 0) ? result : -result);
	}
	
	public static long multiplyUsingLog(int a, int b){
		int absA = Math.abs(a);
		int absB = Math.abs(b);
		long result = Math.round(Math.pow(10, (Math.log10(absA) + Math.log10(absB))));
		return ((a > 0) && ( b > 0) || (a < 0) && ( b < 0) ? result : -result);
	}
	
	public static void main(String[] args) {
		int a = -12;
		int b = 7;
		System.out.println("Answer = " + multiplyUsingShift(a, b));
		System.out.println("Answer = " + multiplyUsingLog(a, b));
	}

}
