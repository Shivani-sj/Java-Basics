import java.util.*;
public class occurance{
public static void main (String args[]){
Scanner scan=new Scanner(System.in);
int arr[]={10,20,30,10,40,50,10,60};
int count=0;
System.out.print("Enter the number to be searched: ");
int target=scan.nextInt();
for (int i:arr){
    if(i==target){
        count=count+1;
    }
}
System.out.println("Number 10 occurs "+count+" times.");
}
}


