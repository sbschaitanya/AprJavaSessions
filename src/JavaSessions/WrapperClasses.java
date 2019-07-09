package JavaSessions;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class WrapperClasses {

	public static void main(String[] args) {

		//String to int conversion:
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String fare = "1200";		
		int fareVal = WrapperClasses.getIntegerValue(fare);
		System.out.println(fareVal-100);
		
//		String y = "100A";
//		int p = Integer.parseInt(y); //NumberFormatException: For input string: "100A"
//		System.out.println(p+20);
		
		//String to double:
		String t = "12.33";
//		double d = Double.parseDouble(t);
//		System.out.println(d+20);
		double d = WrapperClasses.getDoubleValue(t);
		System.out.println(d+100);
		
//		String name = null;
//		WrapperClasses.getDoubleValue(name);
		
		//int to String:
		int amount = 1000;
		System.out.println(amount+200-20);
		
		String amt = String.valueOf(amount); //"1000"
		System.out.println(amt+200);
		
		int p = 9;
		int q = p/0; // 1/0=Infinite and 0/1=0
		System.out.println(q); //ArithmeticException: / by zero
		
	}
	
	/**
	 * This method is used to convert a string value to an integer value
	 * @param value
	 * @return int
	 */
	public static int getIntegerValue(String value){
		return Integer.parseInt(value);
	}
	
	
	public static double getDoubleValue(String value){
		return Double.parseDouble(value);
	}
	

}
