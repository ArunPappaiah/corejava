package codes;

public class Branch1_Tester {
	public static void main(String args[]) {
		testBranch1();
	}
   public static void testBranch1() {
	   Branch1 b=new Branch1(2535);
	   System.out.println("Bank Name :"+b.bankName);
	  System.out.println("Bank ID :"+b.id);
	   b.setLocation("India");
	   System.out.println("Location :"+b.getLocation());
	   b.setManagerID(6567);
	   System.out.println("Manager ID :"+b.getManagerID());
	   
   }
}
