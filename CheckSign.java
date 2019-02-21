import java.util.Scanner;
class CheckSign{
public static void main(String[] qwe){
Scanner Scan=new Scanner(System.in);
int a=Scan.nextInt();
if(a<0){
System.out.print("negative");
}
else if(a==0){
System.out.print("zero");
}
else{
System.out.print("positive");
}
}
}