import java.util.Scanner;
class multiplication_table{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number: ");
int n=sc.nextInt();
for (int i=1; i<=n;i++){
    int output=n*i;
    System.out.println("7*"+i+"="+output);
}
}
}