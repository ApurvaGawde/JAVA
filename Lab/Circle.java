package shapes;

public class Circle {
	private float radius; // Declares a private instance variable
	float pi; // Declares private instance variable for pi.

	private Circle() { //  private constructor 
		super(); // Calls the superclass constructor.
		this.radius = 1.5f; // Initializes the radius variable
	}

	Circle(float radius) { 
		this(radius, 3.5f); // Calls the private constructor
	}

	private Circle(float radius, float pi) { // Defines a private constructor 
		super(); // Calls the superclass constructor.
		this.radius = radius; // Initializes the radius 
		this.pi = pi; // Initializes the pi value 
	}

	double calculateCircleArea(float radius) { // Defines a method to calculate the area of the circle 
		double result; 
		result = pi * radius * radius; // To  Calculate the area of circle
		return result; 
	}

	double calculateCircumference(float radius) { // Defines a method to calculate the circumference 
		double result; 
		result = 2 * pi * radius; // Calculates the circumference of circle
		return result; 
	}

	public static void main(String[] args) { //  main method 
		Circle circle = new Circle(25); // Creates a new Circle object 
		double area = circle.calculateCircleArea(5); // Calculates the area of the circle 
		System.out.println("Area of the circle is: " + area); 
		double circumference = circle.calculateCircumference(4); 
		System.out.println("Circumference of the circle is: " + circumference); 
	}

	}


