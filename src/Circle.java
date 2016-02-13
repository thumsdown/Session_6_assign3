
public class Circle implements Shape{
	
	private double radius;
	public void enterRadius( double radius )
	{
		this.radius = radius;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw CIRCLE ()");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (27/7 * radius*radius  );
	}

}
