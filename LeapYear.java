import java.util.*;
class LeapYear{
public static void main(String[] args){
System.out.println("Enter the year");
Scanner x=new Scanner(System.in);
int year=x.nextInt();
if(year%4==0)
if(year%100==0)
if(year%400==0)
System.out.println(year+" is a Leap Year");
else
System.out.println(year+" is not a Leap Year");
else
System.out.println(year+" is a Leap Year");
else
System.out.println(year+" is not a Leap Year");
} 
}