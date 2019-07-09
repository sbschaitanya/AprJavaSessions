package OOP1;

public class BMW extends Car {

	//Method Overrding: when we have same method with same number of params in parent class as well as in 
	//child class. 
	//Polymorphism : dynamic/RunTime Polymorphism
	
	@Override
	public void start() {
		System.out.println("BMW -- start");
	}

	public void theftSafety() {
		System.out.println("BMW -- theftSafety");
	}

}
