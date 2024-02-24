package com.multi.thread.synchronize;


class IncrementCount
{
	volatile int count = 0;
	
	public int getCount()
	{
		return this.count;
	}
	public void increment(int n)
	{
		this.count=this.count+n;
	}

}
class MyTestThread1 extends Thread
{
	IncrementCount increamentCount;
	public MyTestThread1(IncrementCount c)
	{
		this.increamentCount=c;
	}
	public void run()
	{
		int count=increamentCount.getCount();
		System.out.println(Thread.currentThread().getName() +" old value of count"+count);
	
		//increment count value by 1
		increamentCount.increment(1);
		//read count value and print 
		 count=increamentCount.getCount();
		 System.out.println(Thread.currentThread().getName()+" new value count "+count);
		
	}

}
class MyTestThread2 extends Thread
{
	IncrementCount increamentCount;
	public MyTestThread2(IncrementCount c)
	{
		this.increamentCount=c;
	}
	public void run()
	{
		int count=increamentCount.getCount();
		System.out.println(Thread.currentThread().getName() + " old value of count"+count);
	
		//increment count value by 1
		increamentCount.increment(1);
		//read count value and print 
		 count=increamentCount.getCount();
		 System.out.println(Thread.currentThread().getName()+" new value count "+count);
		
	}

}


public class VolatileKeyword
{
	public static void main(String[] args) 
	{
		//created two thread and here will create of object of that 2 thread
		IncrementCount c=new IncrementCount();	
		MyTestThread1 t1=new MyTestThread1(c);
		MyTestThread2 t2=new MyTestThread2(c);
		t1.start();
		t2.start();
		
		//when run without volatile keyword then will not give consistence data every time will get different output ....to resolve this issue volatile came in the picture 
		
	}
	

}
