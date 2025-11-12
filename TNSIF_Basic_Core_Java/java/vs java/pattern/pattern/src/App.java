import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello, World!");
        int i;
        int j;
        int k;
        System.out.println("Enter the value of A");
        int a =scan.nextInt();
        for(i=1;i<=a;i++){
            for(k=1;k<=a-i;k++){
                System.out.print(" ");
                }
                for(j=1;j<=i;j++){
                    System.out.print("*");
        }
        System.out.println();
        }
    }
}
