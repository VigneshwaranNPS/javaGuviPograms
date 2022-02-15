import java.util.*;
public class Main{
	static int cubeOf(int x) {
		return x*x*x;
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner inp=new Scanner(System.in);
		int v=inp.nextInt();
		if(v<0) {
			System.out.print("Invalid");
		}
		else {
			System.out.print(cubeOf(v));
		}
	}
}
