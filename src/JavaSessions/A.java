package JavaSessions;

public class A {

	public static void main(String[] args) {
		
		System.out.println("A -- Main method");
		B.main(args);
		
		B b = new B();
		b.test();
	}

}
