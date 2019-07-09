package JavaSessions;

import java.util.ArrayList;

public class FunctionsConcept {

	public static void main(String[] args) {

		FunctionsConcept obj = new FunctionsConcept();
		obj.test();
		String n1 = obj.getTrainerName();
		System.out.println("trainer name : "+ n1);
		if(n1.equals("Naveen")){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		int playerCount = obj.getTeamPlayers();
		System.out.println("total players:"+ playerCount);
		
		System.out.println(obj.getTeamPlayers());
		
		int sum1 = obj.sum(20, 30);
		System.out.println(sum1);
		
		int sum2 = obj.sum(90, 30);
		System.out.println(sum2);
		
		String cap1 = obj.getCapitalCityName("India");
		System.out.println("capital of India is: "+ cap1);
		
		ArrayList<String> JavaStudentsList = obj.getStudentNames("Java");
		System.out.println(JavaStudentsList);
		
		ArrayList<String> pythonStudentsList = obj.getStudentNames("Python");
		System.out.println(pythonStudentsList);

	}
	
	//1. no input and no return:
	//no param, no arguments or no input or 0 param
	//void --> does not return any value
	public void test(){
		System.out.println("test method");
	}
	
	//2. no input and some return:
	//return type: String
	public String getTrainerName(){
		System.out.println("getTrainerName");
		String name = "Naveen";
		return name;
	}
	
	public int getTeamPlayers(){
		System.out.println("getTeamPlayers");
		int playerCount = 11;
		int extraPlayers = 4;
		int totalNumberPlayers = playerCount + extraPlayers;
		return totalNumberPlayers;
	}
	
	//3. some input and some return:
	public int sum(int x, int y){
		System.out.println("sum method");
		int z = x+y;
		return z;
	}
	
	public String getCapitalCityName(String countryName){
		System.out.println("getCapitalCityName");
		if(countryName.equals("India")){
			return "New Delhi";
		}
		return "capital not found";
	}
	
	public ArrayList<String> getStudentNames(String batchName){
		System.out.println("getStudentNames");
		ArrayList<String> studentList = new ArrayList<String>();
		
		if(batchName.equals("Java")){
			studentList.add("Babita");
			studentList.add("Kasi");
			studentList.add("Shivam");
		}
		else if(batchName.equals("Python")){
			studentList.add("Arun");
			studentList.add("Ben");
			studentList.add("Maha");
		}
		
		return studentList;
	}
	
	public int getStudentRank(String name){
		if(name.equals("Naveen")){
			return 10;
		}
		else if(name.equals("jyothi")){
			return 1;
		}
		return 0;
	}
	
	public int getNumberOfMonths(){
		return 12;
	}

}
