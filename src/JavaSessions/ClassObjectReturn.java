package JavaSessions;

public class ClassObjectReturn {

	public static void main(String[] args) {

		LoginAppPage lp = new LoginAppPage();
		HomePage hp = lp.doLogin();
		hp.headerHomePage();
		
	}
	
	
}
