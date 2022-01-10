package Inheritance;

abstract class vehicle{
	int speed = 45;
	long distance = 4500;

	vehicle(){
		System.out.println("Vehicle is created");
	}
	vehicle(int a, long d)
	{
		speed = a;
		distance =d;
	}
	
	public void fuel(int a){
		System.out.println("Value is = " + a);
	}
	
	public void fuel (float f, String s){
		System.out.println("Value is = " + f+ " and = "  + s);
	}
	
	public void fuel(char c, int a){
		System.out.println("Value is = " + c+ " and = " + a +"\n");
	}
	
	abstract void run();
	abstract void stop();
}

 class vehicle1 extends vehicle{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

	class twoW extends vehicle {
		int speed = 55;
		long distance = 4300;
		int num_of_tire = 2;
		
		void display(){
			System.out.println("class twoW speed = " + speed + " class twoW distance = " + distance + " class twoW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +" class vehicle distance = " + super.distance);
		}
		twoW(){
			System.out.println("twow is created");
		}
		 void run(){
			System.out.println("class twoW run");
		}
		void stop(){
			System.out.println("class twoW stop");
		}
	}
	
	
	class threeW extends vehicle {
		int speed = 40;
		long distance = 4650;
		int num_of_tire = 3;
		
		void display(){
			System.out.println("class threeW speed = " + speed+ " class threeW distance = " + distance + " class threeW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed+" class vehicle distance = " + super.distance);
		}
		threeW(){
			System.out.println("threeW is created");
		}
		 void run(){
			System.out.println("class threeW run");
		}
		void stop(){
			System.out.println("class threeW stop");
		}
	}
	
	class fourW extends vehicle {
		int speed = 35;
		long distance = 3900;
		int num_of_tire = 4;
		
		void display(){
			System.out.println("class fourW speed = " + speed + " class fourW distance = " + distance + " class fourW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +" class vehicle distance = " + super.distance);
		}
		fourW(){
			System.out.println("fourW is created");
		}
		 void run(){
			System.out.println("class fourW run");
		}
		void stop(){
			System.out.println("class fourW stop");
		}
	}

	class eightW extends vehicle {
		int speed = 60;
		long distance = 5100;
		int num_of_tire = 8;
		
		void display(){
			System.out.println("class eightW speed = " + speed + " class eightW distance = " + distance + " class eightW num_of_tyre = " +num_of_tire );
			System.out.println("class vehicle speed = " +super.speed +" class vehicle distance = " + super.distance);
		}
		eightW(){
			System.out.println("eightW is created");
		}
		 void run(){
			System.out.println("class eightW run");
		}
		void stop(){
			System.out.println("class eightW stop" + "\n");
		}
	}

public class Vehicle1 {
	public static void main(String[] args) {
		vehicle1 vv = new vehicle1 ();
		vv.fuel(40);
		vv.fuel('a', 45);
		vv.fuel(39.3f, "Hi");
	
		vehicle v1 = new twoW();
		v1.run();
		v1.stop();
		vehicle v2 = new threeW();
		v2.run();
		v2.stop();
		vehicle v3 = new fourW();
		v3.run();
		v3.stop();
		vehicle v4 = new eightW();
		v4.run();
		v4.stop(); 
		
		twoW t = new twoW();
		t.display();
		threeW tt = new threeW();
		tt.display();
		fourW f = new fourW();
		f.display();
		eightW e = new eightW();
		e.display();
		
		
		
		
	
		
	}

}
