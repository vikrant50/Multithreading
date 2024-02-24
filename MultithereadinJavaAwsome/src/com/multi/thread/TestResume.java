package com.multi.thread;

public class TestResume extends Thread
{

	public  void run()
	{
		for(int i=0;i<10;i++)
		{
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i+"  -  "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) throws InterruptedException 
	{
		TestResume t1=new TestResume();
		TestResume t2=new TestResume();
		TestResume t3=new TestResume();
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		System.out.println("B-"+t2.isAlive());//false becuse not started yet
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("B-"+t2.isAlive());//true
		
		//if i want to not execute my t2 thread....suspend()
		t2.suspend();
		
		//my requirnment is that after 10 sec my t2 thread should be restart
		Thread.sleep(10000);
		t2.resume();//restart the t2 thread again
		
		
	}
}
