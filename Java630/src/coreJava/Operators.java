package coreJava;

public class Operators {
	int a=20,b=15;
	
	public void arithematicOperators()
	{
		int c=a+b;
		System.out.println("addition operator value is "+ c);
		c=a-b;
		System.out.println("subtraction operator value is "+ c);
		c=a*b;
		System.out.println("multiplication operator value is "+ c);
		c=a/b;
		System.out.println("division operator value is "+ c);
		
		c=a%b;
		System.out.println("Modulus operator value is "+ c);
		++a;
		System.out.println("increment operator values is "+ a);
		
		--b;
		System.out.println("decrement operator values is "+ b);
	}
	
	public void assignmentOPerators()
	{
		System.out.println(a);
		++a;
		++a;
		System.out.println(a);
		a=a+10;
		System.out.println(a);
		a+=10;
		System.out.println(a);
		
		a-=10;
		System.out.println(a);
		
		a*=10;
		System.out.println(a);
		
		a/=10;
		System.out.println(a);
	}

	public void relationalOpearators()
	{
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
	}
	
	public void logicalOPerators()
	{
		boolean val=false;
		
		val=  a>b && a>15;
		
		System.out.println(val);
		
		val=  a<b && a<15;
		
		System.out.println(val);
		
		val=  a<b && a>15;
		
		System.out.println(val);
		
		
		
		val=  a>b || a>15;
		
		System.out.println(val);
		
		val=  a<b || a<15;
		
		System.out.println(val);
		
		val=  a<b || a>15;
		
		System.out.println(val);
		
		System.out.println(!val);
	}

	
	public void conditionalOPerator()
	{
		int c= a<b?100:50;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operators operators=new Operators();
	//	operators.arithematicOperators();
	//	operators.assignmentOPerators();
	//	operators.relationalOpearators();
	//	operators.logicalOPerators();
		operators.conditionalOPerator();
	}

}
