package JavaSessions;

public class Assignments {

	public static void main(String[] args) {

		/*
		 * n=4
		 * n=3
		 * n=2
		 * n=1
		 */
		//Time Complexity: O(n) 
		int num = 1; // O(1) --BIG O(1)
		num = num+10; //1+1 = 2 -- O(1)
		num++; //O(1)
		
		if(10>5){ //1 O(1)
			System.out.println("hii"); //1
		}
		
		//4+4+4 n =4
		for(int n=4; n>0; n--){
			System.out.println("n="+n); //n
			//n+n = 2n -- O(n)
		}
		
		int t = 4;
		while(t>0){
			System.out.println("t="+t);
			t--;
		}
		
		int p=4;
		do{
			System.out.println("p="+p);
			p--;
		}while(p>0);
		
		
		//nxn = n^2 = O(n^2)
		for(int i=0; i<40; i++){
			for(int j=0; j<40; j++){
				System.out.print(i+""+j+"\t");
				
			}
			System.out.println();
		}
		
		
		
	}

}
