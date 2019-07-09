package JavaSessions;

public class LoginPage {

	public static void main(String[] args) {

		LoginPage loginPage = new LoginPage();
		loginPage.login(1234);
		
	}
	
	

	// duplicate methods are not allowed in Java
	// Method Overloading: within the same class, when we have diff methods with the
	// same name
	// and different number of params 
	//or diff types of params.
	
	//Polymorphism - poly(many) + forms
	//compile time Polymorphism

	public void test() {// 0

	}

	public void test(int a) {// 1

	}

	public void test(String a) {// 1

	}

	public void test(int a, int b) {// 2

	}

	public void test(String a, int b) {// 2
	}

	public void login(String email, String password) {

	}

	public void login(long phoneNumber) {

	}

	public void login(int OTP) {

	}
	
	public void login(String socialMediaAccount){
		System.out.println("login with "+ socialMediaAccount);
	}

	public void login(String email, String password, String role) {

	}

	public void doPayment(String id, String pwd) {

	}

	public void doPayment(String cardNumber) {

	}

	public void doPayment(long paytmNumber) {

	}
	
	
	public void search(String key){
		
	}
	
	public void search(String key, String filter){
		
	}

}
