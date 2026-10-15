import java.util.Scanner;
class sum_of_odd_even{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int number=sc.nextInt();
int odd=0;
int even=0;
for (int i=1;i<=number;i++){
    if (i%2==0){
        even=even+i;
    }
    else{
        odd=odd+i;
    }
}
System.out.println("Sum of odd numbers: "+odd);
System.out.println("Sum of even numbers: "+even);
}
}


