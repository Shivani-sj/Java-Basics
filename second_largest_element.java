public class second_largest_element{
public static void main(String args[]){
int num[]={1,2,3,8,12,4,14,6};
int first_largest=0;
for (int i=0;i<num.length;i++){
    if (num[i]>first_largest){
        first_largest=num[i];
    }
    else{
        
    }
}
int second_largest=0;
for(int i=0;i<num.length;i++){
    if(first_largest>num[i]){
        if (second_largest<num[i]){
            second_largest=num[i];
        }
    }
}
    
System.out.println("Second largest element is: " + second_largest);
}
}