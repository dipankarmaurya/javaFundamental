package assignments1;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=25687;
		int sum=0;
		while(n!=0) {
			int num=n%10;
			sum+=num;
			n/=10;
		}
		System.out.println("Sum of digits of given number is : "+ sum);
		
	}

}
