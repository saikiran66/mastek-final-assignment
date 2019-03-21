package mastek_assesment;
import java.util.Scanner;

public class Problem22
{
public static void main (String[] args)
{
String name[]=new String[10];
int temp;
int hours[]=new int[10];
int first[]=new int[10];
int grandfirst=0;
int grandsecond=0;
int second[]=new int[10];
int third[]=new int[10];
int grandthird=0;
Scanner kb=new Scanner(System.in);
for(int i=0;i<10;i++)
{
name[i]=kb.next();
hours[i]=kb.nextInt();
if(hours[i]>=40)
{
temp=hours[i]-40;
first[i]=first[i]+(40*10);
grandfirst=grandfirst+first[i];
if(temp>=20)
{
temp=temp-20;
second[i]=second[i]+(20*15);
grandsecond=grandsecond+second[i];
if(temp>0)
{
third[i]=third[i]+(temp*20);
grandthird=grandthird+third[i];
}
}
}
}
System.out.println("name"+" "+"hours"+"first_40"+" "+"next_20"+" "+"remaining");
for(int i=0;i<10;i++)
{
System.out.println(name[i]+" "+hours[i]+" "+first[i]+" "+second[i]+" "+third[i]);
}
System.out.println(first column total:"+grandfirst);

System.out.println(second column total:"+grandsecond);

System.out.println(third column total:"+grandthird);
}
}

