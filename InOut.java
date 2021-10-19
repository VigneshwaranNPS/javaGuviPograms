import java.util.Scanner;

public class InOut{
	public static void main(String [] args) {
		int i;
		Scanner in=new Scanner(System.in);	
		if(in.hasNextInt()) {
			i=in.nextInt();
			System.out.println(i);
		}
		else
		{
			System.out.println("input error");
		}
	}
}
