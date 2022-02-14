import java.util.*;
public class Main{
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner read_in=new Scanner(System.in);
		String given_in=read_in.next();
		char taken_in[]=given_in.toCharArray();
		String ref="0,1,2,3,4,5,6,7,8,9";
		if(given_in.contains(ref)) {
			System.out.print("Invalid");
		}
		else {
		for(int i=0;i<taken_in.length;i++) {
			System.out.print(taken_in[i]);
			if(i==taken_in.length-1) {
				break;
			}
			System.out.print(",");
		}
	}
	}
}
