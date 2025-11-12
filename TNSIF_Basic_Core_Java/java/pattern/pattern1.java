import java.util.Scanner;
class pattern1{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
int i;
int j;
System.out.println("Ente the value of A :");
int a=scan.nextInt();
for(i=0;i<=a;i++){
for(j=0;j<=i;j++){
System.out.print(" *");
}
System.out.println();
}
}
}