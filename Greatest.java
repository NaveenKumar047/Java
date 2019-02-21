import java.util.*;
class Greatest{
public static void main(String[] args){
System.out.println("Enter the 3 nos");
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int b=x.nextInt();
int c=x.nextInt();
if((a>b)&&(a>c))
System.out.println(a+" is the greatest");
else if (b>c)
System.out.println(b+" is the greatest");
else
System.out.println(c+" is the greatest");
}
}