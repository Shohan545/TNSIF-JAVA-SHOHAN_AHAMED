class charecter5{
public static void main(String[] args){
int i,j;
char ch=65;
for(i=1;i<=5;i++){
if(i%2==0){
char chRev=(char)(ch+i-1);
for(j=1;j<=i;j++){
System.out.print(chRev-- +" ");
ch++;
}
System.out.println();
}
else{
for(j=1;j<=i;j++)
{
System.out.print(ch++ + " ");
}
System.out.println();
}
}
}
}