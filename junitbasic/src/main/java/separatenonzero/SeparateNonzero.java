package separatenonzero;

import java.util.Arrays;

public class SeparateNonzero {
	public static void separateZero(int inputArray[]) {
		int counter=0;
		for(int i=0;i<inputArray.length;i++) {
			if(inputArray[i]!=0) {
				inputArray[counter]=inputArray[i];
				counter++;
			}
		}
		while(counter<inputArray.length) {
			inputArray[counter]=0;
			counter++;
			
		}
		System.out.println(Arrays.toString(inputArray));
		
	}

	public static void main(String[] args) {
		separateZero(new int[]{2,4,0,7,0,7,0,0,1,0});

	}

}
