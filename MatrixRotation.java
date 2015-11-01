import java.util.Scanner;

/**
 * @author Sanjay
 */

public class MatrixRotation {
	
	public static int[][] transpose(int a[][]){
		int m = a.length;
		int n = a[0].length;
		int[][] b = new int[n][m];
		for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                b[i][j] = a[j][i];
		return b;
	}
	
	public static int[][] rotateLeft(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int[][] b = new int[n][m];
		for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                b[i][j] = a[j][n-i-1];
		return b;
	}
	
	public static int[][] rotateRight(int[][] a){
		int m = a.length;
		int n = a[0].length;
		int[][] b = new int[n][m];
		for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                b[i][j] = a[m-j-1][i];
		return b;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int a[][] = new int[m][n];
		for(int i = 0; i < m; i++)
			for(int j = 0; j < n; j++)
				a[i][j] = in.nextInt();
		
		int[][] b1 = rotateLeft(a);
		int[][] b2 = rotateRight(a);
		
		
		System.out.println("Input Matrix : ");
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++)
				System.out.print(a[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("Rotate left : ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				System.out.print(b1[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("Rotate Right : ");
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++)
				System.out.print(b2[i][j] + " ");
			System.out.println();
		}
		
		in.close();
	}

}
