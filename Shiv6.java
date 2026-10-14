import java.util.*;
public class Shiv6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the 1st number: ");
int a=sc.nextInt();
System.out.print("Enter the 2nd number: ");
int b=sc.nextInt();
System.out.print("Enter the 3rd number: ");
int c=sc.nextInt();
if(a>b && a>c){
System.out.println("The greatest number among three is:"+a);
}
else if (b>a && b>c) {
System.out.println("The greatest number among three is:"+b);
}
else{
System.out.println("The greatest number among three is:"+c);
}
}
}