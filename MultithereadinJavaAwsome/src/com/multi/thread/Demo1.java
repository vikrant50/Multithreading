package com.multi.thread;

public class Demo1 implements Runnable
{

	@Override
	public void run() 
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("thread strated ");
		try {
		Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) 
	{
		Demo1 d=new Demo1();
		
		Thread t=new Thread(d);
		t.start();
		

	}



}
