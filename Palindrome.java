import java.util.*;
public class Palindrome{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int a=x.nextInt();
int b=a;
int rev=0;
for(int i=1;i<=Integer.toString(a).length();i++){
rev=rev*10+b%10;
b=b/10;}
if(rev==a)
System.out.println("yes");
else
System.out.println("no");
}}