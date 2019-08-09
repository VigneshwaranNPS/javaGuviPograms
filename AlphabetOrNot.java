import java.util.Scanner;
class AlphabetOrNot{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
System.out.println("enter a choose");
char ch=Scan.next().charAt(0);
if((ch>64&&ch<91)||(ch>96&&ch<123)){
  System.out.println("Alphabet");
}
else{
  System.out.println("no");
}
}
}
