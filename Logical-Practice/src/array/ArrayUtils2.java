package array;

import java.util.Arrays;

public class ArrayUtils2 {

	public static void separatePositiveNegative1(int[] arr) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void separatePositiveNegative2(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		separatePositiveNegative1(new int[] {2,4,-4,5,-1,-6,9,-8});
		separatePositiveNegative2(new int[] {2,4,-4,5,-1,-6,9,-8});


	}

}
