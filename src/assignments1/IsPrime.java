package assignments1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=7;
		//method1
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
		
		
		//method2
		int flag=0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Number is not prime");	
		}
		else {
			System.out.println("number is prime");
		}
	}

}
