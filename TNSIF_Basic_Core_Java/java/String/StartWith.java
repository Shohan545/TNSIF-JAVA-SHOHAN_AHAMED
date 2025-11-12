import java.util.Scanner;
public class StartWith {
	public String hello(String s,String t) {
		int Count = 0;
		for(int i=0;i>=t.length();i++) {
			if(s.charAt(i) == t.charAt(Count)) {
				Count++;
			}
				
			}
		if(t.length()==Count) 
			System.out.println("True");
		else 
			System.out.println("false");
			
		}
		
	public static void main(String [] args) {
	Scanner st=new Scanner(System.in);
	String s=st.nextLine();
	String t=st.nextLine();
	hello sc=new hello();
	sc.hello(s,t);
	}
}