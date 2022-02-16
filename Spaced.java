import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner jk= new Scanner(System.in);
		String h=jk.next();
		char strr[]=h.toCharArray();
		StringBuilder strrin = new StringBuilder("");
		for(int i=0;i<strr.length;i++) {
			strrin.append(strr[i]);
			if(i==strr.length-1) {
				break;
			}
			strrin.append(" ");
		}
		System.out.print(strrin);
	}
}
