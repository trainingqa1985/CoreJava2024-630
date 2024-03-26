package polymorphism;

public  class Calculator {
	
	int a=10;
	
	final float pie=3.14F;
	
	public void add()
	{
	//	pie=2.45F;
		System.out.println(10+20);
	}
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void add(float a,int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		calculator.add();
		calculator.add(45, 7854);
		
		calculator.add(102.52F, 100);
		
	}

}
