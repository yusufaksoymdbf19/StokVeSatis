package ex2_3_4;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int twoD[][] = new int[3][3];
		int i,j,k=0;
		for(i=0;i<3;i++)
			for(j=0;j<3;j++,k++) {
				twoD[i][j]=k;
			}
		for(i=0;i<3;i++) {
			for(j=0;j<3;j++)
				System.out.print(twoD[i][j]+" ");
			System.out.println();
		}
	}

}
