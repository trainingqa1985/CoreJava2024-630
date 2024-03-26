package polymorphism;

public class SceintificCalculator extends Calculator{
	
	 public void add()
	{
		System.out.println(30+40);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SceintificCalculator sc=new SceintificCalculator();
		sc.add();
		
		Calculator calc=new SceintificCalculator();
		calc.add();
	}

}
