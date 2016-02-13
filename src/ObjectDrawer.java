import java.util.Scanner;
public class ObjectDrawer {

	public static void main(String[] args) {
		double length = 0;
		String choice = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice to get shape a<square>, b<circle>");
		choice = sc.next();
		if ( choice.equals("a"))
		{
			System.out.println("Enter length of square");
			length = sc.nextDouble();
			Square sq = new Square();
			sq.enterLength(length);
			sq.draw();
			System.out.println("Area of Square = "+sq.getArea());
		}
		else if ( choice.equals("b"))
		{
			System.out.println("Enter radius of Circle");
			length = sc.nextDouble();
			Circle cir = new Circle();
			cir.enterRadius(length);
			cir.draw();
			System.out.println("Area of circle = "+cir.getArea());
		}
		else
		{
			System.out.println("Support not added");
		}
		
		sc.close();
		
	}
}
