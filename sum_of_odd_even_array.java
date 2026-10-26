public class sum_of_odd_even_array{
public static void main(String args[]){
int num[]={5,4,3,2,1};
int even=0;
int odd=0;
for(int i:num){
    if (i%2==0){
    even+=i;
    }
    else{
    odd+=i;
    }
}
System.out.println("odd: "+odd);
System.out.println("even: "+even);
}
}