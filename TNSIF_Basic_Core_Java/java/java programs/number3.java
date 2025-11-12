class number3{
public static void main(String[] args){
int i,j,count;
for(i=1;i<=5;i++){
count=i*(i+1)/2;
for(j=1;j<=i;j++){
System.out.print(count-- + "*");
}
System.out.println();
}
}
}