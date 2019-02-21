import java.util.*;
class NK{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int N=x.nextInt();
int K=x.nextInt();
int sum=0;
int[] ar=new int[N];
for(int i=0;i<N;i++)
{int temp=x.nextInt();
ar[i]=temp;
}
for(int j=0;j<K;j++)
sum=sum+ar[j];
System.out.println(sum);
}}