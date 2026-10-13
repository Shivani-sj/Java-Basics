public class Shiv2{
public static void main(String args[]){
int a = 4567;
int b = a%10;
int sum=b;
a=a/10;
b= a%10;
sum=sum+b;
a=a/10;
b=a%10;
sum=sum+b;
a=a/10;
b=a%10;
sum=sum+b;
System.out.println(sum);
}
}