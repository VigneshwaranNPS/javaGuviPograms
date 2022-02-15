import java.util.*;
public class Main{
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner get_in=new Scanner(System.in);
		int refe=1,inp=get_in.nextInt();
		if(inp<0) {
			System.out.print("Invalid");
		}
		else if(inp==0||inp==1) {
			System.out.print("1");
		}
		else {
			for(int i=1;i<=inp;i++) {
				refe=refe*i;
			}
			System.out.print(refe);;
		}
	}
}
