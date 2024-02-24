package com.multi.thread;

public class Demo3MultipleThread extends Thread
{
	
	public void run()
	{
		System.out.println("Thread started");
		System.out.println("Thread: ID-"+Thread.currentThread().getId());
		System.out.println("Thread: ID-"+Thread.currentThread().getName()+ " running");
		
	}

	public static void main(String[] args) throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			Demo3MultipleThread d=new Demo3MultipleThread();
			d.start();
			
			Demo3MultipleThread.sleep(1000);
		}
		

	}

}
