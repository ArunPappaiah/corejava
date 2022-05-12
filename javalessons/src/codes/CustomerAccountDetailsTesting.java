package codes;

public class CustomerAccountDetailsTesting {
	public static void main(String args[]) {
		testCode();
	}
   public static void testCode() {
	CustomerAccountDetails cd =new CustomerAccountDetails(3117, 636967965);
	cd.setAccount_type("Savings Account..");	
	cd.setCurrent_balance(25000.33F);
	
	CustomerAccountDetails cd1 =new CustomerAccountDetails(3118,879866);
	cd1.setAccount_type("Savings");
	cd1.setCurrent_balance(23000.25F);
	
	System.out.println("Customer ID :"+cd.customer_ID);
	System.out.println("Account No :"+cd.account_no);
	System.out.println("Account Type :"+cd.getAccount_type());
	System.out.println("Current Balance :"+cd.getCurrent_balance());
	
	System.out.println("Customer ID :"+cd1.customer_ID);
	System.out.println("Account No :"+cd1.account_no);
	System.out.println("Account Type :"+cd1.getAccount_type());
	System.out.println("Current Balance :"+cd1.getCurrent_balance());
  }
  
}
