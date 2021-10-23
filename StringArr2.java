import java.util.Scanner;

public class Main{
	public static void main(String []args){
		Scanner v=new Scanner(System.in);
		int n=v.nextInt(),k=v.nextInt();
		int[] Arr=new int[n];
		for(int i=0;i<n;i++) {
			Arr[i]=v.nextInt();
		}	
		System.out.println(n+" "+k);
		for(int i=0;i<n;i++) {
			System.out.print(Arr[i]+" ");
		}
	}
}	
