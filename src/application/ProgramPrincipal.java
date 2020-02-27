package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class ProgramPrincipal {
	
	
	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of shapes");
		int n = sc.nextInt();
		
		List<Shape> list = new ArrayList<>();
		
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("rectangule or circle (r/c): ");
			char ch = sc.next().charAt(0);
			System.out.println("color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(ch == 'r') {
				System.out.println("width: ");
				double width = sc.nextDouble();
				System.out.println("height: ");
				double height = sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
				
			
			}else {
				
				System.out.println("Radius");
				double radius = sc.nextDouble();
				
				list.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		
		sc.close();
	}
}
