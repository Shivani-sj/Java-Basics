import java.util.*;
public class mark_of_array{
public static void main (String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the index value: ");
int n=scan.nextInt();
int mark[]=new int[n];
int sum=0;
for (int i=0;i<mark.length;i++){
System.out.println("Element of "+i+ " index is");
mark[i]=scan.nextInt();
sum=sum+mark[i];
}
System.out.println("Sum of the array is: "+sum);
}
}