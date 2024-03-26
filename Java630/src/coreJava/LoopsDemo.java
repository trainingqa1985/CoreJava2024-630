package coreJava;

import inheritence.Car;

public class LoopsDemo {
	
	int a=11;
	
	public void whileDemo()
	{
		while(a<=10)
		{
			System.out.println(a);
			++a;
		}
	}
	
	public void doWhile()
	{
		do {
			System.out.println(a);
			++a;
		}while(a<=10);
	}
	
	public void forLoop()
	{
		for(int j=1;j<=10;++j) 
		{
			System.out.println(j);
		}
	}
	
	public void nestedLoops()
	{
		for(int i=1;i<=4;++i)
		{
			for(int j=1;j<=i;++j)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		System.out.println("my name is "+a+" dfgtr");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopsDemo loopsDemo=new LoopsDemo();
	//	loopsDemo.whileDemo();
		loopsDemo.nestedLoops();
		Car car=new Car();
		car.testPublic();
	}

}
