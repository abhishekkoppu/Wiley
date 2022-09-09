
public class Fibonacci {
	int a;
	int b;
	int firstNumber;
	int secondNumber;
	
	public Fibonacci(int firstNumber, int secondNumber) {
		this.a=1;
		this.b=1;
		this.firstNumber=firstNumber;
		this.secondNumber=secondNumber;
	}
	
	public void fibonacciInRange() {
		
		if(this.firstNumber==0) {
			System.out.println("0");
			System.out.println("1");
		}
		if(this.firstNumber==1) {
			System.out.println("1");
			System.out.println("1");
		}

		for(int i=1;i<=this.secondNumber;i++) {
			a+=b;
			if(a>=this.firstNumber && a<=this.secondNumber)
			System.out.println(a);
			b+=a;
			if(b>=this.firstNumber && b<=this.secondNumber)
			System.out.println(b);
		}
	}
	


}
