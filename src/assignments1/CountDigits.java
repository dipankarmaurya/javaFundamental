package assignments1;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=25687;
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		System.out.println("total no of digits in given number is : "+ count);
		
	}

}
