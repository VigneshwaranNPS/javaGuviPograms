import java.util.*;
public class Sepcomma{
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner read_in=new Scanner(System.in);
		String given_in=read_in.next();
		char taken_in[]=given_in.toCharArray();
		for(int i=0;i<taken_in.length;i++) {
			System.out.print(taken_in[i]);
			if(i==taken_in.length-1) {
				break;
			}
			System.out.print(",");
		}
	}
}
