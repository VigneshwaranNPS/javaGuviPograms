import java.util.Scanner;
class Oddoreven{
public static void main(String[] args){
System.out.println("Enter the Number");
Scanner x=new Scanner(System.in);
int a=x.nextInt();
if (a%2==0){
  System.out.println("The number is even");
}
else if(a%2<0){
  System.out.println("Invalid");
}
else{
  System.out.println("The number is odd");
}
}
}
