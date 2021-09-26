package assignments1;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num1=60,num2=80,num3=40;
          int maxm;
          if(num1>num2) {
        	  if(num1>num3) {
        		maxm=num1;  
        	  }
        	  else {
        		  maxm=num3;
        	  }
          }
          else if(num2>num3) {
        	  maxm=num2;	  
          }
          else {
        	  maxm=num3;
          }
          System.out.println("maxm of three value is :" + maxm);
	}

}
