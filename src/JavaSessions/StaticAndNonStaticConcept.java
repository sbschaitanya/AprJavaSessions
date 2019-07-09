package JavaSessions;

public class StaticAndNonStaticConcept {
	
	//data members: variable + methods
	//object will store only non static stuff
	//class variables: 
	
	String name = "BMW";
	static int wheels = 4;

	public static void main(String[] args) {

		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		
		//how to call static stuff: No need to use the object
		//1. call them directly:
		getWheels();
		System.out.println(wheels);
		
		//2. call them by class name:
		StaticAndNonStaticConcept.getWheels();
		System.out.println(StaticAndNonStaticConcept.wheels);
		
		obj.getWheels();
		System.out.println(obj.wheels);
		
		obj.start();
		
	}
	
	
	public static void getWheels(){
		System.out.println("get wheels method, wheels = 4");
	}
	
	
	public void start(){
		System.out.println("car -- start method");
		stop();
	}
	
	public void stop(){
		System.out.println("car -- stop");
	}
	
	

}
