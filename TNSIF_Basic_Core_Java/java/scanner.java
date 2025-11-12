import java.util.Scanner;
class scanner{
public static void main(String args[])
{
Scanner scan=new Scanner (System.in);
System.out.println("Enter the first number");
int a=scan.nextInt();
System.out.println("Enter the Second number");

int b=scan.nextInt();
int c=a+b;
System.out.print(c);
}
}