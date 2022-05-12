package codes;

public class Demo extends Thread{
	public static void main(String args[]) {
		int n=124;
		int i=0;
		int sum=0;
		int temp=0;
		while(n>0) {
			sum=n%10;
			temp=temp+sum;
			n=n/10;
		}
		System.out.println(temp);
	}
}
