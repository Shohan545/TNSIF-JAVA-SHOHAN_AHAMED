import java.util.Scanner;
class array{
public static void main(String args[]){
System.out.println("Shohan Ahamed J");
int[]a=new int[5];
Scanner scan = new Scanner(System.in);
for(int i=0;i<4;i++)
{
System.out.println("Enter the"+(i+1)+"student Age ");
a[i]=scan.nextInt();
}
System.out.println("This is your array");
for(int i=0;i<4;i++)
{

System.out.println(a[i]);
}
}
}