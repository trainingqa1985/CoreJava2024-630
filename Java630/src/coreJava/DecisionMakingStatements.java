package coreJava;

public class DecisionMakingStatements {
	
	int a=100;
	
	String name="Jan";
	
	public void ifStatemnt()
	{
		
		if(a==1)
			System.out.println("composite number");
		else if(a%2==0)
		{
			System.out.println("even number");
		}
		
		else
		{
			System.out.println("odd number");
		}
	}
	
	public void switchDemo()
	{
		switch(a)
		{
		case 1:System.out.println("Jan");
				break;
		case 2: System.out.println("Feb");
			break;
		case 3:System.out.println("Mar");
			break;
			
		default: System.out.println("invalid input");
		}
	}
	
	public void switchDemoDifferentDataType()
	{
		switch(name)
		{
		case "Jan":System.out.println("1 st month");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecisionMakingStatements decisionMakingStatements=new DecisionMakingStatements();
	//	decisionMakingStatements.ifStatemnt();
		decisionMakingStatements.switchDemoDifferentDataType();
	}

}
