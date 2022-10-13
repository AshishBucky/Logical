package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayUtils {

	public static String findDuplicates(int[] arr) {
		String result="{";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					result=result+arr[i]+",";
			}
		}
		return result.substring(0,result.length()-1)+"}";
	}
	
	public static int[] removeDuplicates(int[] data) {
		Set<Integer> set=new HashSet<Integer>();
		for(int n:data) {
			set.add(n);
		}
		
		int[] newArray=new int[set.size()];
		int i=0;
		for(int n:set) {
			newArray[i]=n;
			i++;
		}
		return newArray;
	}
	
	public static int sumOfUniqueElements(int[] arr) {
		Set<Integer> uset=new HashSet<Integer>();
		int sum=0;
		for(int n:arr) {
			if(!uset.contains(n)) {
				uset.add(n);
				sum=sum+n;
			}
		}
		return sum;
	}
	
	public static int findThirdLargest(int[] arr) {
		int first=arr[0],second=0,third=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=first) {
				if(arr[i]==first)
					first=arr[i];
				else {
					third=second;
					second=first;
					first=arr[i];
				}
			}
			else if(arr[i]>second) {
				if(arr[i]==second)
					second=arr[i];
				else {
					third=second;
					second=arr[i];
				}
			}
			else if(arr[i]>=third) {
				third=arr[i];
			}
		}
		return third;
		
	}
	
	public static int[] twoSum(int[] arr,int sum) {
		Map<Integer,Integer> numMap=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			int sub=sum-arr[i];
			if(numMap.containsKey(sub)) {
				return new int[] {i,numMap.get(sub)};
			}
			numMap.put(arr[i], i);
		}
		return new int[] {-1,1};
	}
	
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
		int[] arr= {1,2,3,1,5,4,2,4,8,9};
		System.out.println(findDuplicates(arr));
		
		System.out.println(Arrays.toString(removeDuplicates(arr)));
		
		System.out.print("sum of unique elements is:");
		System.out.println(sumOfUniqueElements(arr));
		
		System.out.println("third largest no is:"+findThirdLargest(arr));
		
		System.out.println(Arrays.toString(twoSum(arr, 9)));
		
		
		Map<String,String> emap=new HashMap<String,String>();
		emap.put("name", "ashish");
		emap.put("address", "Bolangir");
		emap.put("mobile", "8895206308");
		
		for(Map.Entry<String, String> entry:emap.entrySet() ) {
			System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
		}
		
		
		for(String key:emap.keySet()) {
			System.out.println("Key :"+key+" Value :"+emap.get(key));
		}
		
		separatePositiveNegative1(new int[] {2,4,-4,5,-1,-6,9,-8});
		separatePositiveNegative2(new int[] {2,4,-4,5,-1,-6,9,-8});
		

	}

}
