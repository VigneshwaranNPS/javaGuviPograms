import java.util.Scanner;
class Main{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
int a=Scan.nextInt();
int b=Scan.nextInt();
int c=Scan.nextInt();
if(a>b&&b>c){
System.out.println(a);
}
else if(b>c){
  System.out.println(b);
}
else
{
  System.out.println(c);
}
}
}
