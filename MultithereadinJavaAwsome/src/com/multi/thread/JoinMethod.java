package com.multi.thread;


public class JoinMethod extends Thread
{
	@Override
	public void run()
	{
		for(int i =1;i<=5;i++)
		{
			try 
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
			System.out.println(i+" - "+Thread.currentThread().getName());
		}
	}

	public static void main(String[] args) throws InterruptedException 
	{
		JoinMethod t1=new JoinMethod();
		JoinMethod t2=new JoinMethod();
		JoinMethod t3=new JoinMethod();
		t1.start();//i want complete this then start another
		t1.join();//wait until t1 will complete or die then after t2 and t2
		t1.join(5000);//after starting the execution of t1 thread ,,you have to join in 5 second
		t2.start();
		t3.start();
		

	}

}
