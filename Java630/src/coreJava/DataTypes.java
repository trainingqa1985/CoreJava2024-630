package coreJava;

public class DataTypes {
	
	byte byteVar=10;
	short shortVar=101;
	//2 power -32 to 2 power 32
	int intvar=20;
	// 2 power -64 to 2 power 64
	long longvar=1425887;
	//precision of 6 
	float floatVar=10.2345464645F;
	// precision might be 15 
	double doubleVar=10.235446979;
	
	char charVar='J';
	
	boolean boolVar=true;
	
	String name="Java";
	
	public void myMethod()
	{
		System.out.println(byteVar);
		System.out.println(shortVar);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DataTypes dataTypes=new DataTypes();

		System.out.println(dataTypes.name);
		
		dataTypes.myMethod();
	}

}
