package com.multi.thread;

public class Demo1Threadextend extends Thread
{
	@Override
	public void run()
	{
		System.out.println("thread started..........");
		for(int i=0; i<10;i++)
		{
			System.out.println("user Thread "+i);
			try 
			{
				//sleep it will take pause of 1sec...2sec then it will execute
				Thread.sleep(2000);//1000ms=1s
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
				
			}
		}
	}

	public static void main(String[] args) 
	{
		Demo1Threadextend n= new Demo1Threadextend();
		n.start();//calling own method not runnable 
	
		
	}

}
