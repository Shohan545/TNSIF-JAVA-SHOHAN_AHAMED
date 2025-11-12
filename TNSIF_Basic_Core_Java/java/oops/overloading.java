package methodOverloading;

public class overloading {
public void add_data(int a, int b) {
	int c=a+b;
	System.out.println(c);
}
public void add_data(int a, float b) {
	float c=a+b;
	System.out.println(c);
}
public void add_data(float a, int b) {
	float c=a+b;
	System.out.println(c);
}
public void add_data(float a, float b) {
	float c=a+b;
	System.out.println(c);
}
public void add_data(float a, double b) {
	double c=a+b;
	System.out.println(c);
}
public static void main(String args[]) {
	overloading od=new overloading();
	od.add_data(1.0f,8554185874d);
}

}
