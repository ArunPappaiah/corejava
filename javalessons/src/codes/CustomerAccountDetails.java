package codes;

public class CustomerAccountDetails {
	public final int customer_ID;
	public final int account_no;
	private String account_type;
	private float current_balance;
	
	public CustomerAccountDetails(int cid,int ano) {
		this.customer_ID=cid;
		this.account_no=ano;
	}
	
	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

    public float getCurrent_balance() {
    	return current_balance;
    }
    
    public void setCurrent_balance(float current_balance) {
    	this.current_balance= current_balance;
    }
}