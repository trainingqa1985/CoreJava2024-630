package collectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HasMapDemo {
	
	HashMap<Integer,String> map=new HashMap<Integer,String>();
	
	public void addData()
	{
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(3, "C Sharp");
		map.put(3, "C Sharp1");
		map.put(null, null);
	}
	
	public void readData()
	{
		for(Map.Entry<Integer,String> mp:map.entrySet())
		{
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(4));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasMapDemo hashMapDemo=new HasMapDemo();
		hashMapDemo.addData();
		hashMapDemo.readData();
	}

}
