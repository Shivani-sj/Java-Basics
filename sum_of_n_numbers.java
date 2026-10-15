import java.util.Scanner;
class sum_of_n_numbers{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number: ");
int number=sc.nextInt();
int sum=0;
int i=0;
for (i=1; i<=number; i++){
    sum=sum+i;
}
System.out.println("Sum of digits is: "+sum);
}
}

