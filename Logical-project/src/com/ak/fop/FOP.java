package com.ak.fop;

import java.util.Arrays;

public class FOP {
	//1:getSumOfDigits
	public static int getSumOfDigits(int num) {
		int first=0;
		int second=0;
		if(num>99)
			return -2;
		else if(num<10 && num>=0)
			return -1;
		else if(num<0)
			return -3;
		else {
			first=num/10;
			second=num%10;
		}
		return first+second;
	}
	
	//2:getDiffOfDigits
	public static int getDiffOfDigits(int num) {
		int first=0;
		int second=0;
		if(num>99)
			return -2;
		else if(num<10 && num>=0)
			return -1;
		else if(num<0)
			return -3;
		else {
			first=num/100;
			second=num%10;
		}
		return first-second;
		
	}
	
	//3:getNextMultipleOf100
	public static int getNextMultipleOf100(int num) {
		if(num<=0)
			return -1;
		else {
			int rem=num%100;
			return num+(100-rem);
		}
	}
	
	//4:isPalindrome
	public static int isPalindrome(int num) {
		int rev=0;
		int copy=num;
		if (num<=0)
			return -1;
		else if(num>999)
			return -2;
		else {
			while(num!=0) {
				int last=num%10;
				rev=rev*10+last;
				num=num/10;
			}
			if(copy==rev)
				return 1;
		}
		return 0;
	}
	//5:isEven
	public static int isEven(int num) {
		if(num<0)
			return -1;
		else {
			if(num%2==0)
				return 1;
		}
		return 0;
	}
	//6:getGreatest
	public static int getGreatest(int num1,int num2) {
		int big=num1;
		if(num1<0 || num2<0)
			return -1;
		else if(num1==0 || num2==0)
			return -2;
		else {
			if(num2>big)
				big=num2;
		}
		return big;
	}
	//7:getLeastNum
	public static int getLeastNum(int n1,int n2) {
		int small=n1;
		if(n1<0 || n2<0)
			return -1;
		else if(n1==0 || n2==0)
			return -2;
		else {
			if(n2<small)
				small=n2;
		}
		return small;
	}
	//8:oddRounder
	public static int oddRounder(int num) {
		int rem=0;
		if(num<0)
			return -1;
		else if(num==0)
			return -2;
		else if(num%2==0)
			return num;
		else {
			 rem=10-(num%10);
		}
		return num+rem;
	}
	//9:findSign
	public static int findSign(int num) {
		if(num<0)
			return -1;
		else if(num==0)
			return 0;
		else
			return 1;
	}
	//10:isEvenOrOdd
	public static String isEvenOrOdd(int num) {
		if(num<=0)
			return "invalid number";
		else if(num%2==0)
			return "Even";
		else
			return "Odd";
	}
	//11:calculate
	public static int calculate(int num) {
		if(num<=0)
			return -1;
		else if(num%2==0)
			return num*num;
		else
			return num*num*num;
	}
	//12:sumOfMultiples
	public static int sumOfMultiples(int n1,int n2,int n3){
		int rem1=0;
		int rem2=0;
		int rem3=0;
		if(n1<=0 ||n2<=0 ||n3<=0)
			return -1;
		else {
			rem1=10-(n1%10);
			rem2=10-(n2%10);
			rem3=10-(n3%10);
			System.out.println(rem1+" "+rem2+" "+rem3);
			return n1+rem1+n2+rem2+n3+rem3;
		}
	}
	//13:sumOfRoundedValues
	public static int sumOfRoundedValues(int n1,int n2,int n3) {
		if(n1<1 || n2<2 || n3<1)
			return -1;
		else {
			int rem1=n1%10;
			int rem2=n2%10;
			int rem3=n3%10;
			if(rem1>=5)
				n1=n1+(10-rem1);
			else
				n1=n1-rem1;
			if(rem2>=5)
				n2=n2+(10-rem2);
			else
				n2=n2-rem2;
			if(rem3>=5)
				n3=n3+(10-rem3);
			else
				n3=n3-rem3;
			return n1+n2+n3;
		}
	}
	//14:ringAlarm
	public static String ringAlarm(int day,boolean isVac) {
		if(day<0 || day>6)
			return "invalid inputs !";
		else if(isVac!=true && isVac!=false)
			return "Invalid inputs !";
		else if(day>=1 && day<=5 && isVac==true)
			return "10:00";
		else if(day>=1 && day<=5 && isVac==false)
			return "7:00";
		else if(isVac==true && day==0 || day==6 )
			return "OFF";
		else 
			return "10:00";	
	}
	//15:countBoolean
	public static boolean countBoolean(boolean v1,boolean v2,boolean v3) {
		if(v1 && v2 || v2 && v3 || v1 && v3)
			return true;
		return false;
	}
	//16:getNaturalNumbers
	public static String getNaturalNumbers(int start,int end) {
		System.out.println("FOP.getNaturalNumbers()");
		int num=start;
		String result="";
		if(start<0 || end<0)
			return "-1";
		else if(start==end)
			return "-2";
		else if(start>end)
			return "-3";
		else {
			while(num<end) {
				result=result+num+" ";
				num++;
			}
			return result.substring(0,result.length()-1);
		}
	}
	
	//17:getNumbersInRangeAsc
	public static String getNumbersInRangeAsc(int start,int end) {
		int num=start+1;
		String result="";
		if(start<0 || end<0)
			return "-1";
		else if(start==end)
			return "-2";
		else if(start>end)
			return "-3";
		else {
			while(num<end) {
				result=result+num+" ";
				num++;
			}
			return result.substring(0,result.length()-1);
		}
	}
	//18:getNumbersInRangeDesc
	public static String getNumbersInRangeDesc(int start_val,int end_val) {
		int num=start_val-1;
		String result="";
		if(start_val<0 || end_val<0)
			return "-1";
		else if(start_val==end_val)
			return "-2";
		else if(start_val<end_val)
			return "-3";
		else if(start_val-end_val==1)
			return "-4";
		else {
			while(num>end_val) {
				result=result+num+" ";
				num--;
			}
			return result.substring(0,result.length()-1);
		}	
	}
	//19:getNumbersInRangeAscIF
	public static String getNumbersInRangeAscIF(int start,int end,int iFactor) {
		int num=start+1;
		String result="";
		if(start<0 || end<0)
			return "-1";
		else if(start==end)
			return "-2";
		else if(start>end)
			return "-3";
		else {
			while(num<end) {
				result=result+num+" ";
				num=num+iFactor;
			}
			return result.substring(0,result.length()-1);
		}
	}
	//20:getFourPerLine
	public static String getFourPerLine(int end) {
		int start=1;
		String str="";
		int count=0;
		if(end<0)
			return "-1";
		else if(end==0)
			return "-2";
		else if(end>99)
			return "-3";
		else {
			while(start<end) {
				str=str+start+" ";
				start++;
				count++;
				if(count%4==0) {
					str=str+"\n";
				}
			}
			return str.substring(0,str.length()-1);
		}
	}
	//21
	//22:createStarPattern
	public static String createStarPattern(int row) {
		System.out.println("FOP.createStarPattern()");
		if(row<0)
			return "-1";
		else if(row==0)
			return "-2";
		else {
			String str="";
			for(int i=1;i<=5;i++){ 
				for (int j=1;j<=i; j++)
					str=str+"* "; 
			str=str+"\n";
			}
			return str;
		}
			
	}
	
	//23
	//24:checkPrime
	public static String checkPrime(int n) {
		if(n<0)
			return "-1";
		else if(n<=1)
			return "-2";
		else {
			int i=2;
			while(i<n) {
				if(n%i==0)
					break;
				i++;
			}
			if(i==n)
				return "true";
			return "false";
		}
	}
	//25:checkPalindromeNumber
	public static String checkPalindromeNumber(int n) {
		if(n<0)
			return "-1";
		else if(n<10)
			return "-2";
		else {
			int rev=0;
			int copy=n;
			while(n!=0) {
				int last=n%10;
				rev=rev*10+last;
				n=n/10;
			}
			if(rev==copy)
				return "true";
			return "false";
		}
	}
	//26:checkArmStrong
	public static String checkArmStrong(int num) {
		if(num<0)
			return "-1";
		else if(num>9999 || num<999)
			return "-2";
		else {
			int res=0;
			int rem=0;
			int copy=num;
			while(num!=0) {
				rem=num%10;
				res=res+rem*rem*rem*rem;
				num=num/10;
			}
			if(res==copy)
				return "Armstrong number";
			return "Not a Armstrong number";
		}
	}
	//27:getFactorial
	public static int getFactorial(int num) {
		if(num<0)
			return -1;
		else if(num==0)
			return -2;
		else {
			int fact=1;
			while(num!=0) {
				fact=fact*num;
				num--;
			}
			return fact;
		}
	}
	//28:getFactors
	public static String getFactors(int num) {
		if(num<0)
			return "-1";
		else if(num==0)
			return "-2";
		else {
			String res="";
			int i=1;
			while(i<=num) {
				if(num%i==0)
					res=res+i+" ";
			i++;		
			}
			return res;
		}
	}
	//29:getSumOfFactors
	public static int getSumOfFactors(int num) {
		if(num<0)
			return -1;
		else if(num==0)
			return -2;
		else {
			int i=1;
			int sum=0;
			while(i<=num) {
				if(num%i==0)
					sum=sum+i;
			i++;		
			}
			return sum;
		}
	}
	//30:getEvenNumbers
	public static String getEvenNumbers(int start,int end) {
		if(start<0 || end<0)
			return "-1";
		else if(start==0 || end==0)
			return "-2";
		else {
			if(start>end) {
				int temp=start;
				start=end;
				end=temp;
			}
			int i=start;
			String res="";
			while(i<=end) {
				if(i%2==0)
					res=res+i+" ";
				i++;
			}
			return res;
		}
	}
	//31:getSquare
	public static int getSquare(int num) {
		if(num<0)
			return -2;
		else if(num==0)
			return -1;
		else
			return num*num;
	}
	//32:findTriangle
	public static String findTriangle(int n1,int n2,int n3) {
		if(n1<0 || n2<0 || n3<0)
			return "-2";
		else if(n1==0 || n2==0 || n3==0)
			return "-1";
		else if(n1+n2<n3 && n2+n3<n1 && n1+n3<n2) {
			return "-3";
		}
		else {
			if(n1==n2 && n2==n3)
				return "Equilateral Triangle";
	 		else if(n1==n2 || n1==n3 || n2==n3 )
				return "Isosceles Triangle";
	 		else
	 			return "Scalene Triangle";
		}
		
	}
	//33:getPrimeNumbers
	public static String getPrimeNumbers(int start,int end) {
		if(start<0 || end<0)
			return "-1";
		else if(start>end)
			return "-2";
		else {
			String str="";
			int i=2;
			int num=0;
			/*
			 * int num=start+1; System.out.println(num); while(num<end) { num++;
			 * while(i<num){ System.out.println(i+" "+num); if(num%i==0) break; i++; }
			 * if(i==num) str=str+num+" "; num++; }
			 */
			for (num=start+1;num<end;num++){
				for (i=2;i<num;i++)
				{
					if (num%i==0)
					{
						break;
					}
				}
				if (i==num)
				{
					str=str+num+" ";
				}
			}
			return str;
		}
	}
	//34:getPrimeNumbersSum
	public static int getPrimeNumbersSum(int start,int end) {
		if(start<0 || end<0)
			return -1;
		else if(start==0 || end==0)
			return -2;
		else if(start>=end)
			return -3;
		else {
			int i=0;
			int num=0;
			int sum=0;
			for (num=start+1;num<end;num++){
				for (i=2;i<num;i++)
				{
					if (num%i==0)
						break;
				}
				if (i==num)
					sum=sum+num;
			}
			return sum;
		}
	}
	//35:getWeavedString
	public static String getWeavedString(String s1,String s2) {
		if(s1.equals(" ") || s2.equals(" "))
			return "-1";
		else if(s1.length()>s2.length())
			return s2+s1+s2;
		else if(s1.length()<s2.length())
			return s1+s2+s1;
		else {
			int i=0;
			String res="";
			while(i<s1.length()) {
				res=res+s1.charAt(i)+s2.charAt(i);
				i++;
			}
			return res;
		}
		
	}
	//36:sumOfArray
	public static int sumOfArray(int[] arr) {// 1 2 1 2 4 5
		System.out.println("FOP.sumOfArray()");
		if(arr==null)
			return -1;
		else {
			int sum=0;
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				if (arr[i]!=arr[j]){
					sum=sum+arr[j];
				}
			}
		}
		return sum;
		}
	}
	//37:getSum
	public static String getSum(int n1,int n2) {
		System.out.println("FOP.getSum():");
		if(n1<=0 ||  n2<=0)
			return "Error";
		else 
			return n1+n2+"";
	}
	//38:getMultiplesArray
	public static int[] getMultiplesArray(int num) {
		System.out.println("FOP.getMultiplesArray():");
		if(num<=0)
			return null;
		else {
			int[] res=new int[10];
			int i=0;
			int j=1;
			while(j<=10){
				res[i++]=num*j;
				j++;
			}
			return res;
		}
	}
	//39:getCount
	public static int getCount(int[] arr,int num) {
		System.out.println("FOP.getCount():");
		if(arr==null)
			return -1;
		else {
			int freq=0;
			for(int i=0;i<arr.length;i++){	
					if (arr[i]==num){
						freq++;
				}		 
			}
			return freq;
		}
	}
	//40:getProduct  russian
	public static int getProduct(int n1, int n2) {
		System.out.println("FOP.getProduct():");
		if(n1<0 || n2<0)
			return -1;
		else {
			int sum=0;
			while(n1>0) {
				if (n1%2!=0)
					sum=sum+n2;
				n1=n1/2;
				n2=n2*2;
			}
			return sum;
		}
	}
	public static void main(String[] args) {
		//1
		System.out.println(getSumOfDigits(35));
		System.out.println(getSumOfDigits(102));

		//2
		System.out.println(getDiffOfDigits(35));
		System.out.println(getDiffOfDigits(5));
		
		//3
		System.out.println(getNextMultipleOf100(124));
		System.out.println(getNextMultipleOf100(24));
		
		//4
		System.out.println(isPalindrome(101));
		System.out.println(isPalindrome(102));
		
		//5
		System.out.println(isEven(12));
		System.out.println(isEven(13));
		
		//6
		System.out.println(getGreatest(45,54));
		System.out.println(getGreatest(69,96));
		
		//7
		System.out.println(getLeastNum(45,54));
		System.out.println(getLeastNum(568,596));
		
		//8
		System.out.println("odd rounder :"+oddRounder(125));
		System.out.println("odd rounder :"+oddRounder(52));
		
		//9
		System.out.println(findSign(5));
		System.out.println(findSign(-5));
		System.out.println(findSign(0));
		
		//10
		System.out.println(isEvenOrOdd(15));
		System.out.println(isEvenOrOdd(12));
		System.out.println(isEvenOrOdd(-12));
		
		//11
		System.out.println(calculate(12));
		System.out.println(calculate(3));
		
		//12
		System.out.println(sumOfMultiples(12,15,18));	
		
		//13
		System.out.println(sumOfRoundedValues(12,15,18));//50
		
		//14
		System.out.println(ringAlarm(5,true));
		System.out.println(ringAlarm(0,false));
		System.out.println(ringAlarm(6,true));
		
		//15
		System.out.println(countBoolean(true,true,false));
		System.out.println(countBoolean(false,true,true));
		System.out.println(countBoolean(true,false,true));
		System.out.println(countBoolean(true,false,false));
		
		//16
		System.out.println();
		System.out.println(getNaturalNumbers(10,20));
		//17
		System.out.println(getNumbersInRangeAsc(10,20));
		System.out.println(getNumbersInRangeAsc(30,20));
		
		//18
		System.out.println(getNumbersInRangeDesc(50,20));
		System.out.println(getNumbersInRangeDesc(21,20));
		
		//19
		System.out.println(getNumbersInRangeAscIF(10,30,2));
		System.out.println(getNumbersInRangeAscIF(10,30,3));
		
		//20
		System.out.println();
		System.out.println(getFourPerLine(13));
		System.out.println();
		
		//21
		
		//22
		System.out.println(createStarPattern(5));
		
		//23
		//24
		System.out.println(checkPrime(11));
		System.out.println(checkPrime(12));
		System.out.println();
		
		//25
		System.out.println(checkPalindromeNumber(101));
		System.out.println(checkPalindromeNumber(102));
		System.out.println();
		
		//26
		System.out.println(checkArmStrong(1634));
		System.out.println(checkArmStrong(8208));
		System.out.println(checkArmStrong(8209));
		System.out.println();
		
		//27
		System.out.println(getFactorial(5));
		System.out.println(getFactorial(6));
		System.out.println();
		
		//28
		System.out.println(getFactors(10));
		System.out.println(getFactors(20));
		System.out.println();
		
		//29
		System.out.println(getSumOfFactors(10));
		System.out.println(getSumOfFactors(20));
		System.out.println();
		
		//30
		System.out.println(getEvenNumbers(10,30));
		System.out.println(getEvenNumbers(30,10));
		System.out.println();
		
		//31
		System.out.println(getSquare(12));
		System.out.println(getSquare(13));
		System.out.println();
		
		//32
		System.out.println(findTriangle(10,10,10));
		System.out.println(findTriangle(10,20,20));
		System.out.println(findTriangle(15,20,30));
		System.out.println();
		
		//33
		System.out.println(getPrimeNumbers(1,10));
		System.out.println(getPrimeNumbers(1,20));
		System.out.println();
		
		//34
		System.out.println(getPrimeNumbersSum(1,10));
		System.out.println();
		
		//35
		System.out.println(getWeavedString("hello","hello"));
		System.out.println();
		
		//36
		int arr1[]= {1,2,3,2,4,5,4};
		System.out.println(sumOfArray(arr1));
		
		System.out.println();
		//37
		System.out.println(getSum(12,12));
		System.out.println();
		
		//38
		System.out.println(Arrays.toString(getMultiplesArray(2)));
		System.out.println();
		
		//39
		int arr[]= {1,2,1,4,1,3,4,4,4,4,2};
		System.out.println(getCount(arr,1));
		System.out.println(getCount(arr,4));
		System.out.println();
		
		//40
		System.out.println(getProduct(11,12));
		System.out.println(getProduct(12,12));
		
	}

}
