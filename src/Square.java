
public class Square implements Shape{
	private double side;
	public void enterLength( double length )
	{
		side = length;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Got Square []");
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.side* this.side;
		
	}

}
