package coreJava;

public class ArgumentsandReturnTypes {
	
int a=20,b=10,A=90;
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public int sum(int a,int b)
	{
		return a+b;
	}
	
	
	public int diff(int a,int b)
	{
		return a-b;
	}
	
	
	public DataTypes getDataTypesObject()
	{
		return new DataTypes();
	}
	
	public static void main(String[] args) {
		ArgumentsandReturnTypes argumentsandReturnTypes=new ArgumentsandReturnTypes();
		argumentsandReturnTypes.add(42,56);
		argumentsandReturnTypes.add(42,569);
		int sumVar=argumentsandReturnTypes.sum(42,569);
		
		System.out.println(sumVar);
		
		
		int s1=argumentsandReturnTypes.sum(20,10);
		int d1=argumentsandReturnTypes.diff(20,10);
		int finaloutput=argumentsandReturnTypes.diff(s1,d1);
	}


}
