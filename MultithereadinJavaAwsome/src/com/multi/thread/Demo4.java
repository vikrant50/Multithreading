package com.multi.thread;

public class Demo4 extends Thread
{
	

	public static void main(String[] args)
	{
	 	Thread.currentThread().setPriority(MAX_PRIORITY);
	    
	 	//CREATED 3 THREAD
		Demo4 thread1=new Demo4();//these those 3 three is a child of main thread so because of that always child having priority of parent thread
		Demo4 thread2=new Demo4();
		Demo4 thread3=new Demo4();
		
		//i want to check the default priority of this thread
		System.out.println(thread1.getPriority());//10
		System.out.println(thread2.getPriority());//10
		System.out.println(thread3.getPriority());//10
		
		//let's change the priority of user define thread
		thread1.setPriority(3);
		thread2.setPriority(5); 
		thread3.setPriority(10);
		
		System.out.println(thread1.getPriority());
		System.out.println(thread2.getPriority());
		System.out.println(thread3.getPriority());
		
		//print thread name with thread priority
		System.out.println(thread1.getName()+" "+thread1.getPriority());
		System.out.println(thread2.getName()+" "+thread2.getPriority());
		System.out.println(thread3.getName()+" "+thread3.getPriority());
	}

}
