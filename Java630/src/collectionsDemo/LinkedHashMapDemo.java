package collectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	
	LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer,String>();
	
	public void addData()
	{
		map.put(1, "Java");
		map.put(2, "Python");
		map.put(4, "Ruby");
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
		LinkedHashMapDemo hashMapDemo=new LinkedHashMapDemo();
		hashMapDemo.addData();
		hashMapDemo.readData();
	}

}
