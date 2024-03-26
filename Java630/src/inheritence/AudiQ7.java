package inheritence;

public class AudiQ7 extends Audi{
	
	public void driverMode()
	{
		System.out.println("4 wheel drive mode");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudiQ7 audiQ7=new AudiQ7();
		audiQ7.move();
		audiQ7.horn();
		audiQ7.transmissionMode();
		audiQ7.driverMode();
		
	}

}
