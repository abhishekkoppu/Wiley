
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle(5);
		System.out.println(circle.calculateArea());
		
		Fibonacci fibonacci=new Fibonacci();
		fibonacci.fibonaccInRange(1, 13);
		
		Date date=new Date(15, 10, 20);
		date.checkDate();
		date.displayDate();

	}

}
