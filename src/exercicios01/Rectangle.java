package exercicios01;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
		
	}
	
	public double perimeter() {
		return 2* (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}

	@Override
	public String toString() {
		return "Rectangle Width= " + String.format("%.2f",width) + "\nRectangle Height= " + String.format("%.2f",height) +
				"\nAREA = " + String.format("%.2f", area()) + "\nPERIMETER= " + String.format("%.2f",perimeter()) + 
				"\nDIAGONAL= " + String.format("%.2f",diagonal());
	}
	
	
	
	

}
