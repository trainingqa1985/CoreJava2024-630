package collectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	ArrayList<Integer> arrayList=new ArrayList<Integer>();
	ArrayList<Integer> arrayList1=new ArrayList<Integer>();
	public void addData()
	{
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(20);
		arrayList1.add(30);
	}
	
	public void readData()
	{
		for(int i=0;i<arrayList.size();++i)
			System.out.println(arrayList.get(i));
	}

	public void forEach()
	{
		for(Integer lcv:arrayList)
			System.out.println(lcv);
	}
	
	public void deleteData()
	{
		arrayList.remove(0);
	}
	
	public void moreMethods()
	{
		System.out.println(arrayList.containsAll(arrayList1));
		
		arrayList.addAll(arrayList1);
		
		System.out.println(arrayList.containsAll(arrayList1));
		
		arrayList.removeAll(arrayList1);
		
		System.out.println(arrayList.containsAll(arrayList1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDemo arrayListDemo=new ArrayListDemo();
		arrayListDemo.addData();
		arrayListDemo.forEach();
		System.out.println("-----------------");
		arrayListDemo.deleteData();
		arrayListDemo.forEach();
		arrayListDemo.moreMethods();
	}

}
