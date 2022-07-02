public class MatrisCarpimi{
	public static void main(String[] args){
		int birinciMatris[][] = {{1,2},{3,4}};
		int ikinciMatris[][] = {{5,6},{7,8}};
		int sonucMatris[][];
		sonucMatris = new int[2][2];
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				sonucMatris[i][j] = 0;
			}
		}
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				for(int k=0;k<2;k++){
					sonucMatris[i][j]+= birinciMatris[i][k]*ikinciMatris[k][j];
				}
			}
		}
		for(int i = 0; i < 2;i++){
			for(int j=0;j<2;j++){
				System.out.print(sonucMatris[i][j]+" ");
			}
			System.out.println();
		}
	}
}