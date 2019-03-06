import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner (System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int result= gcdof2numbers(n1,n2);
      System.out.println(gcdof2numbers(n1,n2));
	}
  public static int gcdof2numbers(int num1,int num2)
  {int minelement;
   if(num1<num2)
   {minelement=num1;}
   else
   { minelement=num2;}
   while(minelement>=1)
   {if((num1%minelement==0)&&(num2%minelement==0))
   {return minelement;}
    --minelement;}
   return 0;
  }
}