package com.multi.thread.synchronize;

 class Count
{
	//if use synchronized then one by one thread will execute
	public synchronized void count(int n)//you can without use synchronized kyeword and with use then see the output 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i*n);//static block make some line of code like thread safe then use synchronized block 
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		}
	}
}


 class MyThread1 extends Thread
{
	Count c;
	public MyThread1(Count c)
	{
		this.c=c;
	}
	@Override
	public void run()
	{
		c.count(2);//calling count method n=2*i
	}
}
 class MyThread2 extends Thread
{
	Count c;
	public MyThread2(Count c)
	{
	this.c=c;	
	}
	public void run()
	{
		c.count(7);
	}
}



public class SynchronizeTest 
{
	

	public static void main(String[] args) 
	{
	  	 Count c= new Count();
		 MyThread1 t1=new  MyThread1(c);//one thread created
		 MyThread2 t2=new  MyThread2(c);//
		 t1.start();
		 t2.start();
		

	}
}