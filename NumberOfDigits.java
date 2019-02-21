import java.util.*;
class NumberOfDigits{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int count=0;
while(a!=0)
{a=a/10;
count++;}
System.out.println(count);
}}