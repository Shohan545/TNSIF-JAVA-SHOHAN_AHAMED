class pattern3{
public static void main(String args[]){
int i,j;
int count=1;
for(i=1;i<=5;i++){
for(j=1;j<=5;j++){
if(i<10){
for(j=1;j<=5;j++){
System.out.print("0"+count);
count++;
}
}}
else {
System.out.print(count);
count++;
}
System.out.println();
}
}
}