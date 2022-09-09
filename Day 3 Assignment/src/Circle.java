
public class Circle {
double radius;
double area;

public Circle(double radius) {
	this.radius=radius;
}

public double calculateArea() {
	this.area=(Math.PI * Math.pow(this.radius, 2));
	
	return area;
}
}
