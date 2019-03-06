import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      System.out.print(squareofanumber(n));
	} 
  public static int squareofanumber(int a)
  {
    int result=a*a;
    return result;
  }}
