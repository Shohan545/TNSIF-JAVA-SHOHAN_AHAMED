import java.util.Scanner;
class towDarray
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int [][]age=new int[2][5];
for(int i=0;i<2;i++){
for(int j=0;j<age[i].length-1;j++){
System.out.println("Enter the "+(i+1)+" School "+(j+1)+(" Student Age :"));
age[i][j]=scan.nextInt();
}
}
for(int i=0;i<2;i++){
for(int j=0;j<age[i].length-1;j++){
System.out.println("("+(i)+","+(j)+")"+"="+(age[i][j]));
}
}
}
}
