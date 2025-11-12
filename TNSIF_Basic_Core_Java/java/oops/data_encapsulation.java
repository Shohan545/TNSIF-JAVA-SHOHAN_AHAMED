package data_Encapsulation;

import OOPS.data_encapsulation;

public class data_encapsulation {
	private String name;
	private int rollnum;
	private float mark;
public void setdata(String name,int rollnum, float mark) {
	this.name=name;
	this.rollnum=rollnum;
	this.mark=mark;
}
public int getname() {
	return name;
}
public int getrollnum() {
	return rollnum;
}
public int getmark() {
	return mark;
}

}
public class demo{
	public static void main(String args[]) {
		data_encapsulation data=new data_encapsulation();
		data.setdata("Shohan",89,99.9f);
		System.out.println(data.getname()+" "+data.getrollnum()+" "+data.getmark());
	}
}
