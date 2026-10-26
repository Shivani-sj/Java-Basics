import java.util.*;
public class array_user_input{
public static void main (String args[]){
Scanner scan=new Scanner(System.in);
System.out.print("Enter the index value: ");
int n=scan.nextInt();
int mark[]=new int[n];
for (int i=0;i<mark.length;i++){
System.out.println("Element of "+i+ " index is");
mark[i]=scan.nextInt();
}
}
}