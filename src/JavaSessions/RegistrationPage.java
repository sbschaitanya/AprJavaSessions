package JavaSessions;

public class RegistrationPage {

	public static void main(String[] args) {
		RegistrationPage registrationPage = new RegistrationPage();
		registrationPage.userRegistration("Google");
		registrationPage.userRegistration("Facebook");
		registrationPage.userRegistration("LinkedIn");


	}

	public void userRegistration(String AccountName) {
		
		LoginPage loginPage = new LoginPage();
		
		if(AccountName.equals("Google") 
			|| AccountName.equals("Facebook") 
			|| AccountName.equals("LinkedIn") ){
			
			loginPage.login(AccountName);
		}
		
		
	}

	

}
