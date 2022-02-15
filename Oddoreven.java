import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
if (a%2==0){
  System.out.println("Even");
}
else if(a%2<0){
  System.out.println("Invalid");
}
else{
  System.out.println("Odd");
}
}
}
