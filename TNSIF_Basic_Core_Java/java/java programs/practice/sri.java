import java.util.Scanner;
class Saran
{
public static void main(String[]args)
{
System.out.print("Hellow world");
Scanner sc=new Scanner(System.in);
System.out.println("I am Saran");
System.out.println("Enter your name: ");
char input = Scanner.next().charAt(0);
System.out.println("Enter your age: ");
int a=sc.nextInt();
System.out.println("Enter your first number: ");
int b=sc.nextInt();
System.out.println("Enter your second number: ");
int c=sc.nextInt();
int d=b+c;
System.out.println("The sum of A and B is: "+d);
}
}
