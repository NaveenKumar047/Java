import java.util.*;
public class Power{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int b=x.nextInt();
int ans=1;
for(int i=1;i<=3;i++)
{ans=ans*a;
}
System.out.println(ans);
}}