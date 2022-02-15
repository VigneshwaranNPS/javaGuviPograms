import java.util.*;
public class Main{
	static int cubeOf(int x) {
		return x*x*x;
	}
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner inp=new Scanner(System.in);
		int v=inp.nextInt();
		System.out.print(cubeOf(v));
	}
}
