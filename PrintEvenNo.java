import java.util.*;
public class PrintEvenNo{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int b=x.nextInt();
for(int y=a+1;(y>a)&&(y<b);y++)
{if(y%2!=0)
continue;
else
System.out.print(y+" ");
}
}
}