import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int firstdig=n/10;
      int lastdig=n%10;
      int sum=firstdig+lastdig;
      System.out.print(sum);
      
	}
}