package codes;

public class BankEmployee extends Person {
    public BankEmployee(int id) {
    	super(id);
    }
	public static void main(String args[]) {
		testPerson();
	}
   public static void testPerson() {
	   Person ps1=new Person(1234);
	   System.out.println("ID No :"+ps1.id);
	   ps1.setName("Name :"+"Elonmusk");
	   System.out.println(ps1.getName());
	   ps1.setAddress("Locaton :"+"South Africa");
	   System.out.println(ps1.getAddress());
	   ps1.setPhoneNo(636967965);
	   System.out.println("Contact No :"+ps1.getPhoneNo());
   }
  
}
