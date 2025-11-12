import java.util.Scanner;
public class jagedarray {
	public static void main(String args[]) {
		int[][]a=new int[2][];
		a[0]=new int[3];
		a[1]=new int[4];
		Scanner dd=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println("Enter the "+(i+1)+" School "+(j+1)+" Student Age: ");
				a[i][j]=dd.nextInt();
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
}