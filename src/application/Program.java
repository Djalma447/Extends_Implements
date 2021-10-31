package application;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.AbstractShape;
import model.enums.Color;

public class Program {

	public static void main(String[] args) {

		AbstractShape s1 = new Circle(Color.Black, 5.0);
		AbstractShape s2 = new Rectangle(Color.White, 4.0, 3.0);
		
		System.out.println("Circle color: " + s1.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s1.area()));
		System.out.println("Rectangle color: " + s2.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s2.area()));
	}

}
