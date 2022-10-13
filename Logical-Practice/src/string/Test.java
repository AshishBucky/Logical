package string;

public class Test {

	public static void main(String[] args) {
		Integer i=new Integer(5);
		Integer j=new Integer(5);
		if(i==j) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		if(i.equals(j)) {
			System.out.println("i and j same");
		}
		if(i.equals(new Integer(5))) {
			System.out.println("both are same");
		}
	}

}
