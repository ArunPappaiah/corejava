package codes;

public class Demo extends Thread{
	public static void main(String args[]) throws codes.InvalidInputDataException {
		String n="12/11/2000";
		//int parse= Integer.parseInt(n);
		String c="";
		for(int i=0;i<n.length()-8;i++) {
		c=c+n.charAt(i);
		}
		System.out.println("Date :"+" "+c);
		int p=Integer.parseInt(c);
		System.out.println(p);
		if(!(p>20)) {
			System.out.println("Invalid Data");
			throw new InvalidInputDataException("The value of date must be less than 31 :");
		}
	}
}
