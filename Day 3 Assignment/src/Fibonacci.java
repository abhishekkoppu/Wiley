
public class Fibonacci {
	
	public void fibonaccInRange(int firstNumber, int secondNumber) {
		int a=1;
		int b=1;
		
		if(firstNumber==0) {
			System.out.println("0");
			System.out.println("1");
		}
		if(firstNumber==1) {
			System.out.println("1");
			System.out.println("1");
		}

		for(int i=1;i<=secondNumber;i++) {
			a+=b;
			if(a>=firstNumber && a<=secondNumber)
			System.out.println(a);
			b+=a;
			if(b>=firstNumber && b<=secondNumber)
			System.out.println(b);
		}
	}
	


}
