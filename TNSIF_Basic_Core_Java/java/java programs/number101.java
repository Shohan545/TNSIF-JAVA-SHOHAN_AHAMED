class CombinedPrograms {
public static void programOne() {
int i,j;
for(i=1;i<=5;i++){
for(j=1;j<=i;j++){
System.out.print(i);
}
System.out.println();
}
}
}
// Second program
public static void programTwo() {
int i,j,count;
count=4;
for(i=1;i<=4;i++){
for(j=1;j<=5-i;j++){
System.out.print(count);
}
count--;
System.out.println();
}
}
}
public static void main(String[] args) {
programOne();
programTwo();
}
}

