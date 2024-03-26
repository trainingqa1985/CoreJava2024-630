package coreJava;

public class VariablewScope {
	
	int classVarInstanceVar=10;
	
	static int statVar=100;
	
	public void LocaDemo()
	{
		int localVar=25;
		System.out.println(localVar);
	}
	
	public void add()
	{
		++classVarInstanceVar;
		System.out.println(classVarInstanceVar);
		++statVar;
		System.out.println(statVar);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(VariablewScope.statVar);
		
		
		VariablewScope variablewScope1=new VariablewScope();
		variablewScope1.add();
		variablewScope1.add();
		
		VariablewScope variablewScope2=new VariablewScope();
		variablewScope2.add();
		
		
	}

}
