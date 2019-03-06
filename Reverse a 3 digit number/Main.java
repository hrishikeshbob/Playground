import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner (System.in);
    int n = in.nextInt();
    int firstdig=n/100;
    int seconddig=(n/10)%10;
    int lastdig=n%10;
    
    int reverse=lastdig*100 + seconddig*10 + firstdig;
    System.out.println(reverse);
  }
}