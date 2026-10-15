import java.util.Scanner;
class divisible_by_3{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int number=sc.nextInt();
int sum=0;
for(int i=1;i<=number;i++){
    if(i%3==0){
        sum=sum+i;
    }
    else{
        }
}
System.out.println("Sum of numbers= "+sum);
}
}
