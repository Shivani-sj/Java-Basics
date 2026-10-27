import java.util.*;
public class odd_even_array{
public static void main (String args[]){
int nums[]={1,2,3,4,5,6};
int odd[]=new int[3];
int odd_index=0;
int even[]=new int[3];
int even_index=0;
for (int i=0;i<nums.length;i++){
    if(i%2 ==0){
        even[even_index]=nums[i];
        even_index= even_index+1;
     }
    else{
        odd[odd_index]=nums[i];
        odd_index=odd_index+1;
        }  
}
System.out.println("Odd: "+Arrays.toString(even));
System.out.println("Even: "+Arrays.toString(odd));
}
}
