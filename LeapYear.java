import java.util.Scanner;
class LeapYear{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
int year=Scan.nextInt();
if(year%4==0){
if(year%100==0){
if(year%400==0)
{
  System.out.println("leap");
}
else{ 
  System.out.println("no");
}
}
else
{
  System.out.println("Yes");
}
}
else
{
  System.out.println("no");
}
}
}
