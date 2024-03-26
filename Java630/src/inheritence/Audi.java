package inheritence;

public class Audi extends Car{
	
	public String  color="mettalic";
	
	public void transmissionMode()
	{
		System.out.println("Audi has both manual automatic");
		
		System.out.println(color);
		
		System.out.println(super.color);
		System.out.println(this.color);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Audi audi=new Audi();
		audi.transmissionMode();
		audi.move();
		audi.horn();
		audi.testDfeault();
		audi.testProtected();
		audi.testPublic();
	}

}
