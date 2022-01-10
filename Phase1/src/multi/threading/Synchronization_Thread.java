package multi.threading;

//Example illustrates multiple threads are executing on the same Object at same time without synchronization.
import java.io.*;

class Line
{
	// if multiple threads(trains) will try to access this unsynchronized method, they all will get it. So there is chance that Object's state will be corrupted 
	//put synchronized and run
	synchronized public void getLine()                     
	{
		
		for (int i = 0; i < 3; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " : "+i);
			try
			{
				Thread.sleep(500);   //0.4 secs
			}
			catch (Exception e)
			{
				System.out.println(e);
			}
			
			System.out.println("running thread state is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getState());    
			System.out.println("running thread name is:"+Thread.currentThread().getName()); 
			System.out.println("Is my thread alive or not? :  "+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().isAlive()); 
		    System.out.println("The thread id is:"+ Thread.currentThread().getName()+ " :::" + Thread.currentThread().getId());
		}
	}
}

class Train extends Thread
{
	// reference to Line's Object.
	Line line;

	Train(Line line)
	{
		this.line = line;
	}

	@Override
	public void run()
	{
		line.getLine();
	}
}

public class Synchronization_Thread
{
	public static void main(String[] args)
	{
		// Object of Line class that is shared among the threads.
		Line obj = new Line();

		// creating the threads that are sharing the same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		Train train3 = new Train(obj);
		train1.setName("IT");
		train2.setName("Finance");
		train3.setName("HR");

		// threads start their execution.
		train1.start();
		train2.start();
		train3.start();
	}
}

