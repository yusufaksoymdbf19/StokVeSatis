package ex2_9_2;

public class MatrisCarpimi {
	public static void main(String[] args) {
		int a[][] = {{0,1,4}, {2,1,7} };
		int b[][] = {{1,7,2,3},{4,1,-2,3}, {4,1,7,2} };
		int c[][];
		c= new int[2][4];
		for(int i = 0; i <2;i++) 
			for(int j=0;j<4;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) 
					c[i][j]+= a[i][k]*b[k][j];
			}
		for(int i =0;i<2;i++) {
			for(int j=0;j<4;j++) 
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}
}
