package coreJava;

import inheritence.Car;

public class ArraysDemo extends Car{
	
	int[] marks=new int[6];
	
	int[] marks1= {100,95,90,85,80,75};
	
	int[] even=new int[10]; // 2,4,6,8,10,12,14,16,18,20
	
	public void setData()
	{
		marks[0]=10;
		marks[1]=20;
	}
	
	public void readData()
	{
		System.out.println(marks1[5]);
		for(int i=0;i<marks1.length;++i)
		{
			System.out.println(marks1[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysDemo arraysDemo=new ArraysDemo();
		arraysDemo.readData();
		arraysDemo.testProtected();
		arraysDemo.testPublic();
	}

}
