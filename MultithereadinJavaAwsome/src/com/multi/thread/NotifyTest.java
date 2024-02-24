package com.multi.thread;

class Notify1 extends Thread
{
	@Override
	public void run()
	{
		synchronized (this)
		{
			System.out.println("starting "+Thread.currentThread().getName());
			
			try 
			{
				this.wait();
			}
			catch(InterruptedException e)
			{
			e.printStackTrace();	
			}
			System.out.println("end "+Thread.currentThread().getName());
		}
	}
} 
class Notify2 extends Thread
{
	Notify1 notify1;//object referenece created 
	public Notify2(Notify1 notify1)
	{
		this.notify1=notify1;
	}
	@Override
	public void run()
	{
		synchronized (this.notify1)
		{
			System.out.println("starting "+Thread.currentThread().getName());
			
			try 
			{
				this.notify1.wait();
				this.wait();
			}
			catch(InterruptedException e)
			{
			e.printStackTrace();	
			}
			System.out.println("end "+Thread.currentThread().getName());
		}
	}

}
class Notify3 extends Thread
{
	Notify1 notify1;//object referenece created 
	public Notify3(Notify1 notify1)
	{
		this.notify1=notify1;
	}
	@Override
	public void run()
	{
		synchronized (this.notify1)
		{
			System.out.println("starting "+Thread.currentThread().getName());
			
			
				this.notify1.notify();
				
				
		
			System.out.println("end "+Thread.currentThread().getName());
		}
	}

}
public class NotifyTest 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// i am going to create three threads
		Notify1 notify1=new Notify1();
		Notify2 notify2=new Notify2(notify1);
		Notify3 notify3=new Notify3(notify1);
		
		Thread t1=new Thread(notify1," notify1");
		Thread t2=new Thread(notify2," notify2");
		Thread t3=new Thread(notify3," notify3");
		
		t1.start();
		t2.start();
		Thread.sleep(3000);
		t3.start();
		

	}

}
