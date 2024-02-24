package com.multi.thread;

public class Demo4ThreadPriority 
{

	public static void main(String[] args)
	{
		String name = Thread.currentThread().getName();
		System.out.println("this is default thread name by jvm:"+name);//main
		
		//to check current priority 
		int priority=Thread.currentThread().getPriority();
		System.out.println("This is befault priority by JVM "+priority);//5
		
		//set the priority
		Thread.currentThread().setPriority(6);//only 1 to 10 lies	
		int prset=Thread.currentThread().getPriority();
		System.out.println("After set changed priority "+prset);
		

	}

}
