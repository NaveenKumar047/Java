import java.util.*;
class SumNNumbers{
public static void main(String[] args){
System.out.println("Enter the N value");
Scanner x= new Scanner(System.in);
int a=x.nextInt();
int sum=0;
for(int i=1;i<a;i++)
sum=sum+i;
System.out.println("output "+sum );
}}