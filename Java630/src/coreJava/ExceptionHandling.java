package coreJava;



public class ExceptionHandling {
	
	public void demoException()
	{
		try {
		int a=10/10;
		/*
		 * String demo=null; demo.toCharArray();
		 */
		}
		
		catch(ArithmeticException ar)
		{
			System.out.println("exception handled");
		}
		catch(ClassCastException sq)
		{
			System.out.println("classCast exception sql");
		}
		catch(Exception e)
		{
			System.out.println("root");
		}
		
		finally {
			System.out.println("i wilol always execute irrespective of exception");
		}
		System.out.println("after exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling exceptionHandling=new ExceptionHandling();
		exceptionHandling.demoException();
	}

}
