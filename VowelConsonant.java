import java.util.Scanner;
class VowelConsonant{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
System.out.println("enter a choose");
char ch=Scan.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
  System.out.println(ch+"is vowel");
}
else if(ch=='b'||ch=='c'||ch=='d'||ch=='f'||ch=='g'||ch=='h'||ch=='j'||ch=='k'||ch=='l'||ch=='m'||ch=='n'||ch=='p'||ch=='q'||ch=='r'||ch=='s'||ch=='t'||ch=='g'||ch=='v'||ch=='w'||ch=='x'||ch=='y'||ch=='z'){
  System.out.println(ch+"is consonant");
}
}
}
