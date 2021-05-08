package algorithm.dynamic_Planning;

public class MatrixPath {
	private static int n = 6;
	private static int [][] matrix = {
			{1,2,1,5,8,4},
			{4,1,9,4,2,3},
			{8,5,4,3,8,2},
			{1,5,3,5,7,3},
			{4,7,7,9,2,8},
			{2,4,6,3,1,4}
	};
	public static int [][] c = new int [n][n] ;

	public static void main(String[] args) {
		//		Arrays.fill(c, 0);
		printMatrix("Original Matrix", matrix);
		System.out.println("\n Recursion : Max.Cost = "+ maxPath1(n-1,n-1)+ "  iteration count : "+count1);
		System.out.println("\n\n Memoization : Max.Cost = "+ maxPath2(n-1,n-1)+ "  iteration count : "+count2);
		printMatrix("Cost Matrix",c);
	}

	static int count1, count2 = 0;
	public static int maxPath1(int x, int y) {
		count1++;
		if (x==0 && y==0) 
			return matrix[0][0];
		else {
			if (x==0) return matrix[x][y]+ maxPath1(x,y-1);
			else if (y==0) return matrix[x][y]+ maxPath1(x-1,y);
			else return matrix[x][y]+ Math.max(maxPath1(x-1,y), maxPath1(x,y-1));
		}
	}

	public static int maxPath2(int x, int y) {
		count2++;
		if (x==0 && y==0) {
			c[x][y] = matrix[x][y];
			return c[x][y];
		}
		else {
			if (c[x][y]>0) return c[x][y];
			else {
				if (x==0) c[x][y] = matrix[x][y] + maxPath2(x,y-1);
				else if (y==0) c[x][y] = matrix[x][y] + maxPath2(x-1,y);
				else c[x][y] = matrix[x][y] + Math.max(maxPath2(x-1,y), maxPath2(x,y-1));
				return c[x][y];
			}
		}
	}

	private static void printMatrix(String title, int [][] matrix) {
		System.out.println("\n<< "+title+" >>");
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
	}
	
}

