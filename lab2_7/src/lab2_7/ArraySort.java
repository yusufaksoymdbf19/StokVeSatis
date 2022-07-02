package lab2_7;

import java.util.Iterator;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,6,5,4,3,2,1};
		int i,j,l,temp;
		l=arr.length;
		for(int sayi:arr) {
			System.out.println(sayi);
		}
		for ( i = 0; i < l-1; i++) {
			for ( j = i+1; j < l; j++) {
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		System.out.println("\n--------");
		for(int sayi:arr) {
			System.out.println(sayi);
		}
	}

}
