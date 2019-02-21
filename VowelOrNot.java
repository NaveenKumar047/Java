import java.util.*;
class VowelOrNot{
public static void main(String[] args){
System.out.println("Enter the Character");
Scanner x=new Scanner(System.in);
char ch=x.next().toLowerCase().charAt(0);
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
System.out.println("The Character is Vowel");
else
System.out.println("The Character is Consonant");
}}