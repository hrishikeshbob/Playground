import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result=greatestof2number(n1,n2);
      System.out.println(greatestof2number(result,n3));
	}
  public static int greatestof2number(int num1,int num2)
  {int maxnumber=0;
   if (num1>num2)
   {maxnumber=num1;}
   else{maxnumber=num2;}
   return maxnumber;}
}