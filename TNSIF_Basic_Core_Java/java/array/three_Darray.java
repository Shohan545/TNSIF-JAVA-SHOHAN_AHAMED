import java.util.Scanner;
class three_Darray
{
public static void main(String args[])
{
Scanner scan=new Scanner(System.in);
int [][][] age = new int [2][3][5];
for(int i=0;i<age.length;i++){
for(int j=0;j<age[i].length;j++){
for(int k=0;k<age[i][j].length;k++){
System.out.println("Enter the "+(i+1)+" Block "+(j+1)+" School "+(k+1)+" Student Age :");
age[i][j][k]=scan.nextInt();
}
}
}
for(int i=0;i<age.length;i++){
for(int j=0;j<age[i].length;j++){
for(int k=0;k<age[i][j].length;k++){
System.out.println((i+1)+" St block "+(j)+" St School "+(k)+" St Student Age :"+(age[i][j][k]));
}
}
}
}
}