import java.util.*;
class CheckAlpha{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
System.out.println("Enter the character");
char ch=x.next().charAt(0);
if(Character.isLetter(ch))
System.out.println("Alphabet");
else
System.out.println("Not the Alphabet");
}
}