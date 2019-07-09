package JavaSessions;

public class MethodOverloadingPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloadingPart2 obj = new MethodOverloadingPart2();
		System.out.println(obj.sum());
		
		String totalMesg = obj.sum(300);
		System.out.println(totalMesg);
		
		double finalSum = obj.sum(2000, 20.22);
		System.out.println("gross total is: "+ finalSum + "\t" + "Byeeee");
	}

	public int sum() {
		return 10+20;
	}

	public String sum(int total) {
		return "total is ="+total;
	}

	public double sum(int total, double tax) {
		return total+tax;
	}

}
