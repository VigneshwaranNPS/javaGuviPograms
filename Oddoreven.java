import java.util.Scanner;
class Main{
public static void main(String[] args){
System.out.println("Enter the Number");
Scanner x=new Scanner(System.in);
int a=x.nextInt();
if (a%2==0){
  System.out.println("even");
}
else if(a%2<0){
  System.out.println("Invalid");
}
else{
  System.out.println("odd");
}
}
}
