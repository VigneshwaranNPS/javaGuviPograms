import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner Ui=new Scanner(System.in);
		String Given =Ui.nextLine();
		if(Given.lastIndexOf(Given)>1) {
			System.out.println("Invalid input ");
		}
		else {
			System.out.print(Given);
		}
	}
}
