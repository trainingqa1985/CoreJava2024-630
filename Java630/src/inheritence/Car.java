package inheritence;

public class Car {
	
	public String  color="monolithic";
	
	public void move()
	{
		System.out.println("Car Helps tp move from one place to other");
	}

	public void horn()
	{
		System.out.println("Car can horn");
		
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void testPublic()
	{
		System.out.println("I am public method");
	}
	
	private void testPrivate()
	{
		System.out.println("I am a private method");
	}
	protected void testProtected()
	{
		System.out.println("Iam protected Method");
	}
	
	void testDfeault()
	{
		System.out.println("I am default method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car=new Car();
		car.move();
		car.horn();
		car.testDfeault();
		car.testPrivate();
		car.testProtected();
		car.testPublic();
	}

}
