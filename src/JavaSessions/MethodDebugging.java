package JavaSessions;

public class MethodDebugging {

	public static void main(String[] args) {

		MethodDebugging obj = new MethodDebugging();
		double s = obj.sum(10, 20);
		System.out.println(s);

		double s1 = obj.sum(30, 40);
		System.out.println(s1);

		double s2 = obj.sum(10.11, 200);
		System.out.println(s2);
		
		
		for(int i=1; i<=21; i++){
			if(i % 7 == 0){
				System.out.println("divisle of 7");		
			}else{
				System.out.println(i);
			}
		}
		
		
		
		

	}

	public double sum(double a, double b) {
		System.out.println(a);
		System.out.println(b);

		double sum = a + b;
		return sum;
	}
	
	

}
