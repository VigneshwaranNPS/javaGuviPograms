import java.util.Scanner;

public class StringIN{
	public static void main(String [] args){
		Scanner Ui=new Scanner(System.in);
		String Given =Ui.nextLine();
		if(Given.length()>1) {
			System.out.println("Invalid input");
		}
		else {
			System.out.print(Given);
		}
	}
}
