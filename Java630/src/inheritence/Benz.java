package inheritence;

public class Benz extends Car{
	
	public void transmissionMode()
	{
		System.out.println("Only automatic mode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Benz audi=new Benz();
		audi.transmissionMode();
		audi.move();
		audi.horn();
	}

}
