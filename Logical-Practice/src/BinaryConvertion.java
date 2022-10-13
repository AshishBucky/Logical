import java.util.ArrayList;
import java.util.List;

public class BinaryConvertion {

	public static void main(String[] args) {

		System.out.println(find(7));
		System.out.println(find(19));	
		System.out.println(find(56));	
	}
	
	public static String find(int n) {
		List<Integer> l=new ArrayList<>(n);
		String binary="";
		for(int i=0;i<n;i++) {
			int currNum=(int) Math.pow(2, i);
			if(currNum>=n)
				break;
			l.add(currNum);
		}
		int len=l.size();
		for(int i=len;i>0;i--) {
			int matchNo=l.get(i-1);
			if(n>=matchNo) {
				binary=binary+" "+1;
				n=n-matchNo;
			}
			else {
				binary=binary+" "+0;
			}
		}
		return binary;
	}

}
