package logicImplementation;

import pojo.LoginPage;

public class LoginPageImpl {
	
	String tenant1 = "Bhakti";
	String tenant2 = "Shuzhong";
	
	public String verifyUser(LoginPage loginPage)
	{
		String userName = loginPage.getUserName();
		if(userName.equals(tenant1) || userName.equals(tenant2))
		{
			// System.out.println(userName);
			return userName;
		}
		else
		{
			return null;
		}
	}

}
