import java.util.*;
class ToCaps{
public static void main(String[] args)
{System.out.println("Enter the string to capitalize");
Scanner x=new Scanner(System.in);
String i=x.next();
System.out.println(i.substring(0,1).toUpperCase()+i.substring(1) );
}}